package com.Desarrolloweb.Crud;

import org.springframework.data.repository.CrudRepository;

import com.Desarrolloweb.Crud.modelo.Usuario;

public interface IUsuarioCrud extends CrudRepository<Usuario, Integer> {


}
