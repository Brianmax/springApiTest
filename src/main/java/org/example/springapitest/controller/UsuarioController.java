package org.example.springapitest.controller;

import org.example.springapitest.document.Usuario;
import org.example.springapitest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping("/create")
    public Usuario createUsuario(@RequestBody Usuario usuario)
    {
        return usuarioService.createUser(usuario);
    }
}
