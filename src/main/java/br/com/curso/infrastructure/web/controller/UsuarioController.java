package br.com.curso.infrastructure.web.controller;

import br.com.curso.domain.Usuario;
import br.com.curso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public Usuario getUsuario() {

        return usuarioService.saveUsuario("Leonardo", "Vilela", "leovilela@gmail.com", "67991779595", "123");
    }

}
