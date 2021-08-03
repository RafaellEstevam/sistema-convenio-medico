package br.com.convenioMedico.sistemaConvenioMedico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.TipoServico;

/**
 * @author Rafaell Estevam
 *
 */
@Repository
public interface TipoServicoRepository extends CrudRepository<TipoServico, Long>{

}
