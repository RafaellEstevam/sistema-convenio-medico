package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Especialidade;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface EspecialidadeRepository extends CrudRepository<Especialidade, Long>{
	
	List<Especialidade>findByTipoServico_Id(Long id);
	
	
}
