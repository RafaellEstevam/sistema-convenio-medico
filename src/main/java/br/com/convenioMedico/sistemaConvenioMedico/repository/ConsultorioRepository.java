package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Bairro;
import br.com.convenioMedico.sistemaConvenioMedico.model.Consultorio;
import br.com.convenioMedico.sistemaConvenioMedico.model.Especialidade;
import br.com.convenioMedico.sistemaConvenioMedico.model.Estado;
import br.com.convenioMedico.sistemaConvenioMedico.model.Municipio;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Long> {
	
	@Query("select c from Consultorio c join fetch c.endereco e where c.especialidade = :especialidade and e.estado = :estado and e.cidade = :cidade and e.bairro = :bairro")
	public List<Consultorio>findConsultoriosCredenciados(Estado estado, Municipio cidade, Bairro bairro, Especialidade especialidade);
	
}
