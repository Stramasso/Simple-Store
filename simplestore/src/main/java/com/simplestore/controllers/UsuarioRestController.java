package com.simplestore.controllers;

import com.simplestore.models.Usuario;
import com.simplestore.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = usuarioService.salvar(usuario);
        return ResponseEntity.ok(usuarioSalvo);
    }
}
