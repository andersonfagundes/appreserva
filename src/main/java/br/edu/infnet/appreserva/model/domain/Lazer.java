package br.edu.infnet.appreserva.model.domain;

public class Lazer extends Servico {
	
	private Integer id;
	private boolean aluguelChurrasqueira;
	private boolean servicoSpa;
	private boolean servicoMassagem;
	
	public boolean isAluguelChurrasqueira() {
		return aluguelChurrasqueira;
	}
	public void setAluguelChurrasqueira(boolean aluguelChurrasqueira) {
		this.aluguelChurrasqueira = aluguelChurrasqueira;
	}
	public boolean isServicoSpa() {
		return servicoSpa;
	}
	public void setServicoSpa(boolean servicoSpa) {
		this.servicoSpa = servicoSpa;
	}
	public boolean isServicoMassagem() {
		return servicoMassagem;
	}
	public void setServicoMassagem(boolean servicoMassagem) {
		this.servicoMassagem = servicoMassagem;
	}
	
}
