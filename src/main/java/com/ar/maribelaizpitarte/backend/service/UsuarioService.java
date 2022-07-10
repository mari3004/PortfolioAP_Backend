package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Usuario;
import com.ar.maribelaizpitarte.backend.interfaz.IUsuarioService;
import com.ar.maribelaizpitarte.backend.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired IUsuarioRepository iusuarioRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Usuario> getUsuario() {
        return (List <Usuario>) iusuarioRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUsuario(Usuario usuario) {
       iusuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void deleteUsuario(Long id) {
        iusuarioRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Usuario findUsuario(Long id) {
        Usuario usuario = iusuarioRepository.findById(id) .orElse(null);
                return usuario;
    }
    
}