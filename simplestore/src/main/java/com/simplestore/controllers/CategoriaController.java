package com.simplestore.controllers;

import com.simplestore.models.Categoria;
import com.simplestore.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listar(Model model) {
        List<Categoria> categorias = categoriaService.listarTodos();
        model.addAttribute("categorias", categorias);
        return "categorias";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "form-categoria";
    }

    @PostMapping
    public String salvar(Categoria categoria) {
        categoriaService.criar(categoria);
        return "redirect:/categorias";
    }
}
