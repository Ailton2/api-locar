package br.com.apilocar.service;

import java.util.List;

import br.com.apilocar.model.Veiculo;

public interface VeiculoService {
	
   void salvar(Veiculo veiculo);
   
   List<Veiculo> buscarVeiculos(String modelo);
}
