package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Municipio;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface MunicipioRepository extends CrudRepository<Municipio, Long>{
	
	
	public List<Municipio>findByEstadoId(Long id);
	
	
	
}
