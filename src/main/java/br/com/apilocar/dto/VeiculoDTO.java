package br.com.apilocar.dto;

import br.com.apilocar.model.Marca;

public class VeiculoDTO {
	
    private Marca marca;
	private String placa;
	private String modelo;
	private String quilometragem;
	private String cor;
	private String anoFabricacao;
	private String chassi; 
	private Integer qtdPortas;
	private String imagem;
	
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Integer getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(Integer qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}
