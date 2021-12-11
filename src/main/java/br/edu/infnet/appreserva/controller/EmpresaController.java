package br.edu.infnet.appreserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appreserva.model.domain.Empresa;
import br.edu.infnet.appreserva.model.domain.Usuario;
import br.edu.infnet.appreserva.model.service.EmpresaService;

@Controller
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;

	@GetMapping(value = "/empresa")
	public String telaCadastro() {

		return "empresa/cadastro";
	}
	
	@GetMapping(value = "/empresas")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("lista", empresaService.obterLista(usuario));
		
		return "empresa/lista";
	}

	@PostMapping(value = "/empresa/incluir")
	public String incluir(Model model, Empresa empresa, @SessionAttribute("user") Usuario usuario) {
		
		empresa.setUsuario(usuario);
		
		empresaService.incluir(empresa);
		
		model.addAttribute("mensagem", "A empresa "+empresa.getNome()+" foi cadastrada com sucesso!!!");
		
		return telaLista(model, usuario);
	}

	@GetMapping(value = "/empresa/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

		Empresa empresa = empresaService.obterPorId(id);		
		empresaService.excluir(id);

		model.addAttribute("mensagem", "A empresa "+empresa.getNome()+" foi removida com sucesso!!!");		
		
		return telaLista(model, usuario);
	}
}
