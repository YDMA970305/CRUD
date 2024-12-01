/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Desarrolloweb.Crud.servicio;

/**
 *
 * @author Yesid Martinez
 */
import java.util.List;
import com.Desarrolloweb.Crud.modelo.Reporte;

public interface IReporteServicio {
    public List <Reporte> ListarReportes();
    public void guardar (Reporte report);

    public void eliminar (Reporte report);
    public Reporte buscar (Reporte report);
    
    
}
