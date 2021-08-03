package br.com.convenioMedico.sistemaConvenioMedico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String endereco;

	@ManyToOne
	private Estado estado;

	@ManyToOne
	private Municipio cidade;

	@ManyToOne
	private Bairro bairro;

	/**
	 * 
	 */
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(String cep, String endereco, Estado estado, Municipio cidade, Bairro bairro) {
		super();
		this.cep = cep;
		this.endereco = endereco;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Municipio getCidade() {
		return cidade;
	}

	public void setCidade(Municipio cidade) {
		this.cidade = cidade;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro.getNome();
	}

	
}
