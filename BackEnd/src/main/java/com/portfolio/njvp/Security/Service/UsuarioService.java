package com.portfolio.njvp.Security.Service;

import com.portfolio.njvp.Security.Enums.Entity.Usuario;
import com.portfolio.njvp.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean exitsByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean exitsByEmail(String Email) {
        return iusuarioRepository.existsByEmail(Email);
    }
    
    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }
}
