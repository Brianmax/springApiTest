package org.example.springapitest.controller;

import lombok.Getter;
import org.example.springapitest.document.Usuario;
import org.example.springapitest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/findAll")
    public Page<Usuario> findAll(Pageable pageable)
    {
        return usuarioService.findAll(pageable);
    }
}
