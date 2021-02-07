package com.crudspring.core.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Declaramos como una entidad
@Table(name = "datos") //nombre de la base de datos a crear
public class Datos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Referencia de private Id es el id de la tabla

	private int id;
	private String nombre;
	private String apellido;
	private String telefono;


	public Datos() {

	}


	public Datos(int id, String nombre, String telefono, String apellido) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




}
