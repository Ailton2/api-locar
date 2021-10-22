package br.com.apilocar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apilocar.model.Veiculo;
import br.com.apilocar.repository.VeiculoRepository;

@Service
public class VeiculoServiceImpl implements VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public void salvar(Veiculo veiculo) {
		veiculoRepository.save(veiculo);	
	}

	@Override
	public List<Veiculo> buscarVeiculos(String modelo) {
		return veiculoRepository.buscarVeiculos(modelo);
	}




}
