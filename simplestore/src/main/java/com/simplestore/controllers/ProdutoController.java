package com.simplestore.controllers;

import com.simplestore.models.Produto;
import com.simplestore.services.ProdutoService;
import com.simplestore.services.CategoriaService; // <- IMPORTANTE

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private CategoriaService categoriaService; // <- ADICIONE ESTA LINHA

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", produtoService.listarTodos());
        return "produtos";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "form-produto";
    }

    @PostMapping
    public String salvar(@ModelAttribute Produto produto) {
        produtoService.salvar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("produto", produtoService.buscarPorId(id));
        model.addAttribute("categorias", categoriaService.listarTodos());
        return "form-produto";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        produtoService.excluir(id);
        return "redirect:/produtos";
    }
}
