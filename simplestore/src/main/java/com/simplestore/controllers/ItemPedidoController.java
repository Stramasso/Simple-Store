package com.simplestore.controllers;

import com.simplestore.services.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/itempedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    // Exemplo: remover item do pedido
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable Long id) {
        itemPedidoService.remover(id);
        return "redirect:/pedido/carrinho";
    }
}
