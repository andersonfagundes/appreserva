package br.edu.infnet.appreserva.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreserva.model.domain.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Integer> {

	@Query("from Empresa s where s.usuario.id = :userid")
	public List<Empresa> findAll(Integer userid);
}