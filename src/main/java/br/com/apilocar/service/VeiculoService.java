package br.com.apilocar.service;

import java.util.List;
import java.util.Optional;

import br.com.apilocar.model.Veiculo;

public interface VeiculoService {
	
   void salvar(Veiculo veiculo);
   
   List<Veiculo> buscarVeiculos(String modelo);

   List<Veiculo> findAll();

   Optional<Veiculo> findById(Long id);
}
