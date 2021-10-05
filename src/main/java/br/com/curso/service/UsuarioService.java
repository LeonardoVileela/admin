package br.com.curso.service;

import br.com.curso.domain.Usuario;
import br.com.curso.domain.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(String nombre,
                               String apellido,
                               String email,
                               String telefone,
                               String password) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEmail(email);
        usuario.setPassword(telefone);
        usuario.setTelefone(password);

        return usuarioRepository.save(usuario);


    }
}
