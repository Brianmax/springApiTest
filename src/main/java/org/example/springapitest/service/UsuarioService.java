package org.example.springapitest.service;

import org.example.springapitest.document.Usuario;
import org.example.springapitest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario createUser(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
    public Page<Usuario> findAll(Pageable pageable)
    {
        return usuarioRepository.findAll(pageable);
    }
}
