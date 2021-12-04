package br.edu.infnet.appreserva.model.domain;

public class Hospedagem extends Servico {
	
	private Integer id;
	private Integer qtdeAdultos;
	private Integer qtdeCriancas;
	private Integer qtdeQuartos;
	
	public Integer getQtdeAdultos() {
		return qtdeAdultos;
	}
	
	public void setQtdeAdultos(Integer qtdeAdultos) {
		this.qtdeAdultos = qtdeAdultos;
	}
	
	public Integer getQtdeCriancas() {
		return qtdeCriancas;
	}
	
	public void setQtdeCriancas(Integer qtdeCriancas) {
		this.qtdeCriancas = qtdeCriancas;
	}
	
	public Integer getQtdeQuartos() {
		return qtdeQuartos;
	}
	
	public void setQtdeQuartos(Integer qtdeQuartos) {
		this.qtdeQuartos = qtdeQuartos;
	}
		
}
