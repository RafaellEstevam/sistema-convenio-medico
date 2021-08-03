package br.com.convenioMedico.sistemaConvenioMedico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.ProntoSocorro;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface ProntoSocorroRepository extends CrudRepository<ProntoSocorro, Long>{

	
	
}
