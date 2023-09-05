package com.bolsadeideas.springboot.app.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bolsadeideas.springboot.app.springbootweb.models.Usuario;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/app")
public class Index_Controller {

    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model){
        
        model.addAttribute("titulo", "Hola Spring Framework");
        
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();

        usuario.setNombre("Josan");
        usuario.setApellido("Castillo");
        usuario.setEmail("Josan.Castillo@ibm.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model){

        model.addAttribute("titulo", "Listado de usuarios");

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Josan", "Castillo", "Josan.Castillo@ibm.com"));
        usuarios.add(new Usuario("Solyareth", "Cipriano", "Solyareth@ibm.com"));
        usuarios.add(new Usuario("Adan", "Castillo", "Adan.Castillo@ibm.com"));
        usuarios.add(new Usuario("Graciela", "Castillo", "Graciela.Castillo@ibm.com"));

        return usuarios;

    }
    
}
