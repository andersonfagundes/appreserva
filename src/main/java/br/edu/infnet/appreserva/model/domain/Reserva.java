package br.edu.infnet.appreserva.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Reserva {
	private Integer id;
	private LocalDateTime data;
	//
	//
	//
	private Empresa empresa;
	private List<Servico> servicos;
	
	public Reserva() {
		data = LocalDateTime.now();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
}
