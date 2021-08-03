package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Bairro;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface BairroRepository extends CrudRepository<Bairro, Long>{
	
	
	public List<Bairro>findByCidadeId(Long id);
	
	
}
