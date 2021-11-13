package br.edu.infnet.appreserva.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appreserva.model.domain.Alimentacao;
import br.edu.infnet.appreserva.model.domain.Empresa;
import br.edu.infnet.appreserva.model.domain.Hospedagem;
import br.edu.infnet.appreserva.model.domain.Lazer;
import br.edu.infnet.appreserva.model.domain.Reserva;
import br.edu.infnet.appreserva.model.domain.Servico;

public class ReservaTest {
	public static void main(String[] args) {
		
		Hospedagem hospedagem = new Hospedagem();
		//TODO preencher um primeiro atributo
		//TODO preencher um segundo atributo
		//TODO preencher um terceiro atributo
		
		Alimentacao alimentacao = new Alimentacao();
		//TODO preencher um primeiro atributo
		//TODO preencher um segundo atributo
		//TODO preencher um terceiro atributo
		
		Lazer lazer = new Lazer();
		//TODO preencher um primeiro atributo
		//TODO preencher um segundo atributo
		//TODO preencher um terceiro atributo
		
		List<Servico> servicos = new ArrayList<Servico>();
		servicos.add(hospedagem);
		servicos.add(alimentacao);
		servicos.add(lazer);
		
		Empresa empresa = new Empresa();
		//TODO preencher um primeiro atributo
		//TODO preencher um segundo atributo
		//TODO preencher um terceiro atributo
		
		Reserva reserva = new Reserva();
		reserva.setId(1);
		//TODO preencher um segundo atributo
		//TODO preencher um terceiro atributo
		reserva.setEmpresa(empresa);
		reserva.setServicos(servicos);
	}
}
