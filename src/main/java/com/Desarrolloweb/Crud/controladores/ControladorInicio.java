
package com.Desarrolloweb.Crud.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Desarrolloweb.Crud.modelo.Usuario;
import com.Desarrolloweb.Crud.servicio.IUsuarioServicio;

import lombok.extern.slf4j.Slf4j;


/**
 *
 * @author Yesid Martinez
 */
@Controller
@Slf4j
public class ControladorInicio {
     @Autowired
     // IUsuarioCrud iUsuarioCrud;
     IUsuarioServicio userServicio;
    @GetMapping("/")
    public String inicio(Model modelo) {
        // List<Usuario> listaUsuarios = (List<Usuario>) iUsuarioCrud.findAll();
        List<Usuario> listaUsuarios = (List<Usuario>) userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("ejecutando el controlador inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Usuario usuario) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        userServicio.guardar(usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Usuario usuario, Model modelo) {
        log.info("invocando el metodo editar");
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        return "modificar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(Usuario usuario ) {
        userServicio.eliminar(usuario);
        return "redirect:/";
    }

    
}
