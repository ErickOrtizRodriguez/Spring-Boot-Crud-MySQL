package com.crudspring.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudspring.core.interfaces.interfaceDatos;
import com.crudspring.core.interfacesService.interfaceDatosService;
import com.crudspring.core.modelo.Datos;
import java.util.Optional;




@Service
public class serviceDatos implements interfaceDatosService{

	@Autowired
	private interfaceDatos data;
	
	@Override
	public List<Datos> listar() {
		// TODO Auto-generated method stub
		return (List<Datos>)data.findAll(); //retorna la lista de datos
	}

	@Override
	public int save(Datos d) {
		int res=0;
		Datos dato=data.save(d);
		if(!dato.equals(null)) {
			return res=1;
		}
		return res;
	}
	
	@Override
	public int save2(Datos d) {
		int res=0;
		Datos dato=data.save(d);
		if(!dato.equals(null)) {
			return res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		 data.deleteById(id);
	}
	
	

//	@Override
//	public Optional<Datos> listarId(int id) {
//		
//		return data.findById(id);
//	}

	@Override
	public Optional<Datos> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}
	
//	@Override
//	public Optional2<Datos> listarId(int id) {
//		// TODO Auto-generated method stub
//		return data.findById(id);
//	}


}
