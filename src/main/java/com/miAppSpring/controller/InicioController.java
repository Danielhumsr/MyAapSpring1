package com.miAppSpring.controller;


import com.miAppSpring.servicios.UsuariosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class InicioController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/")
    public String inicio (Model model){

        var  usuarios = usuariosService.listaUsuarios();



        // var usuarios = Arrays.asList(usuario,usuario2);



        var saludar = "listos para todo";
        log.info("se esta ejecutando inicio que retorna index");
        model.addAttribute("usuarios", usuarios);
        return "index";

    }
}
