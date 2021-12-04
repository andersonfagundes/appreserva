package br.edu.infnet.appreserva.model.domain;

public class Empresa {
	
	private Integer id;
	private String nome;
	private String cnpj;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Empresa(String nome, String cnpj, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
}
