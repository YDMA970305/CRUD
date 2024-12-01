/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Desarrolloweb.Crud;

/**
 *
 * @author Yesid Martinez
 */
import com.Desarrolloweb.Crud.modelo.Reporte;
import org.springframework.data.repository.CrudRepository;

public interface IReporteCrud extends CrudRepository<Reporte, Integer>{
    
    
}
