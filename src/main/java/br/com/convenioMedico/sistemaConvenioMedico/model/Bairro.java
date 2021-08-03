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
public class Bairro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@ManyToOne
	private Municipio cidade;

	/**
	 * 
	 */
	public Bairro() {
		// TODO Auto-generated constructor stub
	}

	public Bairro(String nome, Municipio cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
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

	public Municipio getCidade() {
		return cidade;
	}

	public void setCidade(Municipio cidade) {
		this.cidade = cidade;
	}

}
