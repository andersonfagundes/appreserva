package br.edu.infnet.appreserva.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreserva.model.domain.Empresa;
import br.edu.infnet.appreserva.model.domain.Usuario;
import br.edu.infnet.appreserva.model.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	public List<Empresa> obterLista(){

		return (List<Empresa>) empresaRepository.findAll();
	}
	
	public List<Empresa> obterLista(Usuario usuario){

		return (List<Empresa>) empresaRepository.findAll(usuario.getId());
	}

	public void incluir(Empresa solicitante) {

		empresaRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {

		empresaRepository.deleteById(id);
	}
	
	public Empresa obterPorId(Integer id) {

		return empresaRepository.findById(id).orElse(null);
	}
}