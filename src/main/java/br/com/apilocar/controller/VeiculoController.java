package br.com.apilocar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.apilocar.exception.SvcException;
import br.com.apilocar.model.Veiculo;
import br.com.apilocar.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
@CrossOrigin(value = "*")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Veiculo veiculo) {
		try {
			veiculoService.salvar(veiculo);
			return new ResponseEntity<Veiculo>(HttpStatus.CREATED);
		} catch (SvcException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	
	}
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> lista(){
		 List<Veiculo> veiculos = veiculoService.findAll();
		 return ResponseEntity.ok(veiculos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id){
		 Optional<Veiculo> veiculo = veiculoService.findById(id);
		 if(veiculo == null) {
			 return ResponseEntity.noContent().build();
		 }
		 return ResponseEntity.ok(veiculo.get());
	}
	
	@GetMapping("/modelo")
	public ResponseEntity<List<Veiculo>> lista(@RequestParam String modelo){
		 List<Veiculo> veiculos = veiculoService.buscarVeiculos(modelo);
		 return ResponseEntity.ok(veiculos);
	}
}
