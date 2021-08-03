package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Bairro;
import br.com.convenioMedico.sistemaConvenioMedico.model.Especialidade;
import br.com.convenioMedico.sistemaConvenioMedico.model.Estado;
import br.com.convenioMedico.sistemaConvenioMedico.model.Hospital;
import br.com.convenioMedico.sistemaConvenioMedico.model.Municipio;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {

	
	@Query("select h from Hospital h join fetch h.endereco e where h.especialidade = :especialidade and e.estado = :estado and e.cidade = :cidade and e.bairro = :bairro")
	public List<Hospital>findHospitaisCredenciados(Estado estado, Municipio cidade, Bairro bairro, Especialidade especialidade);
	
	
	
}
