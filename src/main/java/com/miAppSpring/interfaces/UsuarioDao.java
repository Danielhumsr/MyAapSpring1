package com.miAppSpring.interfaces;

import com.miAppSpring.model.Usuario;
import org.springframework.data.repository.CrudRepository;



public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
