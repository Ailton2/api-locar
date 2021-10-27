package br.com.apilocar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apilocar.exception.SvcException;
import br.com.apilocar.model.Veiculo;
import br.com.apilocar.repository.VeiculoRepository;

@Service
public class VeiculoServiceImpl implements VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public void salvar(Veiculo veiculo) {
		Veiculo v = veiculoRepository.buscarVeiculosPorPlaca(veiculo.getPlaca());
		if(v  != null) {
			throw new SvcException("Já existe um veiculo com essa placa");
		}
		veiculoRepository.save(veiculo);	
	}

	@Override
	public List<Veiculo> buscarVeiculos(String modelo) {
		return veiculoRepository.buscarVeiculos(modelo);
	}

	@Override
	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}

	@Override
	public Optional<Veiculo> findById(Long id) {
		return veiculoRepository.findById(id);
	}




}
