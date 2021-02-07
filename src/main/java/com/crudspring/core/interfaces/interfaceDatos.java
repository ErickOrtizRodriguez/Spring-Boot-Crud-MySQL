package com.crudspring.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudspring.core.modelo.Datos; //importamos el objeto persona del modulo

@Repository
public interface interfaceDatos extends CrudRepository<Datos, Integer> {


}
