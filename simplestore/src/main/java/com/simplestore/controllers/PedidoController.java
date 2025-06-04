package com.simplestore.controllers;

import com.simplestore.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Lista os pedidos do usuário logado
    @GetMapping("/meus-pedidos")
    public String meusPedidos(Model model, Principal principal) {
        model.addAttribute("pedidos", pedidoService.listarPorUsuario(principal.getName()));
        return "pedidos";
    }

    // Exibe detalhes de um pedido específico
    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        model.addAttribute("pedido", pedidoService.buscarPorId(id));
        return "pedido-detalhes";
    }

    // Finaliza o carrinho (cria um novo pedido)
    @PostMapping("/finalizar")
    public String finalizarPedido(Principal principal) {
        pedidoService.finalizarPedido(principal.getName());
        return "redirect:/pedido/meus-pedidos";
    }
}
