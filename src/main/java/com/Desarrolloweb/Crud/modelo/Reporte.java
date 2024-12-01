package com.Desarrolloweb.Crud.modelo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "reporte",catalog = "ejemplocrujsp")
public class Reporte implements Serializable {
private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private Integer paginas;
    private Float costo;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private String fecha_reporte;
    private Integer user_id;

}
