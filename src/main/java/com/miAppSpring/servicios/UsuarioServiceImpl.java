package com.miAppSpring.servicios;

import com.miAppSpring.interfaces.UsuarioDao;
import com.miAppSpring.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuariosService {

    @Autowired
    private UsuarioDao usuariosDao;


    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listaUsuarios() {

        return (List<Usuario>) usuariosDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {

        usuariosDao.save(usuario);

    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {

        usuariosDao.delete(usuario);

    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {

        return usuariosDao.findById(usuario.getId()).orElse(null);

    }
}
