package com.simplestore.controllers;

import com.simplestore.models.Usuario;
import com.simplestore.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@ModelAttribute Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "cadastro";
        }
        usuarioService.salvar(usuario);
        model.addAttribute("mensagem", "Usuário cadastrado com sucesso! Faça login.");
        return "redirect:/login";
    }
}
