package br.com.convenioMedico.sistemaConvenioMedico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Especialidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@ManyToOne
	private TipoServico tipoServico;

	/**
	 * 
	 */
	public Especialidade() {
		// TODO Auto-generated constructor stub
	}

	public Especialidade(String nome, TipoServico tipoServico) {
		super();
		this.nome = nome;
		this.tipoServico = tipoServico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

}
