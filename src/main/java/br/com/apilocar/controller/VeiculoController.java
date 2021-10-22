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

import br.com.apilocar.model.Veiculo;
import br.com.apilocar.repository.VeiculoRepository;
import br.com.apilocar.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
@CrossOrigin(value = "*")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Veiculo veiculo) {
		veiculoService.salvar(veiculo);
		return new ResponseEntity<Veiculo>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<?> lista(){
		 List<Veiculo> veiculos = veiculoRepository.findAll();
		 return new ResponseEntity<List<Veiculo>>(veiculos,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id){
		 Optional<Veiculo> veiculo = veiculoRepository.findById(id);
		 if(veiculo == null) {
			 return ResponseEntity.noContent().build();
		 }
		 return new ResponseEntity<Veiculo>(veiculo.get(),HttpStatus.OK);
	}
	
	@GetMapping("/modelo")
	public ResponseEntity<?> lista(@RequestParam String modelo){
		 List<Veiculo> veiculos = veiculoRepository.buscarVeiculos(modelo);
		 return new ResponseEntity<List<Veiculo>>(veiculos,HttpStatus.OK);
	}
}
