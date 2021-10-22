package br.com.apilocar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apilocar.model.Marca;
import br.com.apilocar.repository.MarcaRepository;

@RestController
@RequestMapping("/marca")
@CrossOrigin(value = "*")
public class MarcaController {

	@Autowired
	private MarcaRepository marcaRepository;
	
	@GetMapping
	public List<Marca> listMarcas(){
		return marcaRepository.findAll();
	}
}
