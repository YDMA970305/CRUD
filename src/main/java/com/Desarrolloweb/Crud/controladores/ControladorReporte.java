package com.Desarrolloweb.Crud.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Desarrolloweb.Crud.modelo.Reporte;
import com.Desarrolloweb.Crud.servicio.IReporteServicio;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ControladorReporte {
    
        @Autowired
    IReporteServicio reporteServicio;

    @GetMapping("/reportes")
    public String inicio(Model modelo) {
        List<Reporte> listaReportes = (List<Reporte>) reporteServicio.ListarReportes();        modelo.addAttribute("reporte", listaReportes);
        log.info("ejecutando el controlador de Reportes");
        return "reportes";
    }

    @GetMapping("/reportes/agregar")
    public String agregar(Reporte reporte) {
        return "modificarReporte";
    }

    @PostMapping("/reportes/guardar")
    public String guardar(Reporte reporte) {
        reporteServicio.guardar(reporte);
        return "redirect:/reportes";
    }

    @GetMapping("/reportes/editar/{id}")
    public String editar(@PathVariable("id") Reporte id, Model modelo) { // Cambiado a int
        log.info("invocando el metodo editar Reporte");
        Reporte reporte = reporteServicio.buscar(id); // Buscar producto por ID
        modelo.addAttribute("reporte", reporte);
        return "modificarReporte";
    }

    @GetMapping("/reportes/eliminar/{id}")
    public String eliminar(Reporte reporte) {
        reporteServicio.eliminar(reporte);
        return "redirect:/reportes";
    }

}
