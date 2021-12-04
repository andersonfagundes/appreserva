package br.edu.infnet.appreserva.model.domain;

public class Alimentacao extends Servico {
	
	private Integer id;
	private boolean cafeDaManha;
	private boolean almoco;
	private boolean Jantar;
	
	public boolean isCafeDaManha() {
		return cafeDaManha;
	}
	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}
	public boolean isAlmoco() {
		return almoco;
	}
	public void setAlmoco(boolean almoco) {
		this.almoco = almoco;
	}
	public boolean isJantar() {
		return Jantar;
	}
	public void setJantar(boolean jantar) {
		Jantar = jantar;
	}
	
}
