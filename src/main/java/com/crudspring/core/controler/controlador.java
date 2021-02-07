package com.crudspring.core.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crudspring.core.interfacesService.interfaceDatosService; //importamos interfaceDatosService para ser uso de los metodos del crud
import com.crudspring.core.modelo.Datos;

@Controller
@RequestMapping
public class controlador {
	
	@Autowired
	private interfaceDatosService service;

	@GetMapping("/inicio")
	public String inicio(Model model) {
	return "index";
	
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
	List<Datos>datos = service.listar();
	model.addAttribute("datos",datos);
	return "listar";
	
	}
	
	@GetMapping("/acciones")
	public String acciones(Model model) {
		List<Datos>datos = service.listar();
		model.addAttribute("datos",datos);
		return "acciones";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("datos", new Datos());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Datos d, Model model ) {
		service.save(d);
		return "redirect:/inicio";
	}
	
	@PostMapping("/save2")
	public String save2(@Validated Datos d, Model model ) {
		service.save(d);
		return "redirect:/acciones";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model){
		Optional<Datos>datos=service.listarId(id);
		model.addAttribute("datos",datos);
		return "editar";
	}
	
	@GetMapping("/eliminar1/{id}")
	public String eliminar1(@PathVariable int id, Model model){
		Optional<Datos>datos=service.listarId(id);
		model.addAttribute("datos",datos);
		return "eliminar";
	}
	
//	@GetMapping("/editar/{id}")
//	public String editar(@PathVariable int id, Model model){
//		Optional<Datos>datos=service.listarId(id);
//		model.addAttribute("datos",datos);
//		return "editar";
//	}
	
	@GetMapping("/eliminar{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/acciones";
	}
	
	
}
