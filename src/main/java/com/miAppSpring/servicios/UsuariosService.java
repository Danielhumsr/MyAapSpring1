package com.miAppSpring.servicios;

import com.miAppSpring.model.Usuario;

import java.util.List;

public interface UsuariosService {

    public List<Usuario> listaUsuarios();

    public void guardar (Usuario usuario);

    public void eliminar (Usuario usuario);

    public Usuario getUsuario (Usuario usuario);


}
