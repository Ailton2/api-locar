package br.com.apilocar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.apilocar.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	@Query("select v from Veiculo v where v.modelo like %:modelo%")
	public List<Veiculo> buscarVeiculos(String modelo);
	
	@Query("select v from Veiculo v where v.placa = :placa")
	public Veiculo buscarVeiculosPorPlaca(String placa);

}
