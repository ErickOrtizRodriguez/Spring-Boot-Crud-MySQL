package com.crudspring.core.interfacesService;

import java.util.List;
import java.util.Optional;


import com.crudspring.core.modelo.Datos;

public interface interfaceDatosService {
	//crear los metodos del crud listar, borrar, agregar
	
	public List<Datos>listar();
	public Optional<Datos>listarId(int id);
	public int save(Datos d);
	public void delete(int id);
	public int save2(Datos d);
	
}
