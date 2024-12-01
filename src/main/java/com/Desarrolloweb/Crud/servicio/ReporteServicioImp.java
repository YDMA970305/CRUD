/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Desarrolloweb.Crud.servicio;

/**
 *
 * @Yesid Martinez
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Desarrolloweb.Crud.IReporteCrud;
import com.Desarrolloweb.Crud.modelo.Reporte;

@Service
public class ReporteServicioImp implements IReporteServicio {

    @Autowired
    IReporteCrud reporteCrud;

    @Transactional(readOnly = true)
    @Override
    public List<Reporte> ListarReportes() {
        return (List<Reporte>) reporteCrud.findAll();
    }

    @Transactional
    @Override
    public void guardar(Reporte reporte) {
        reporteCrud.save(reporte);
    }

    @Transactional
    @Override
    public void eliminar(Reporte reporte) {
        reporteCrud.delete(reporte);
    }

    @Transactional(readOnly = true)
    @Override
    public Reporte buscar(Reporte reporte) {
        return reporteCrud.findById(reporte.getId()).orElse(null);
    }
}


