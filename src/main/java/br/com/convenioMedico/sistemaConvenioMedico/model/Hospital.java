package br.com.convenioMedico.sistemaConvenioMedico.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cnpj;
	@Enumerated(EnumType.STRING)
	private Regiao regiao;
	private String telefone;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
	@JoinColumn(unique = true)
	private Endereco endereco;

	@ManyToOne
	private Especialidade especialidade;

	/**
	 * 
	 */
	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	public Hospital(String nome, String cnpj, Regiao regiao, String telefone, Endereco endereco,
			Especialidade especialidade) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.regiao = regiao;
		this.telefone = telefone;
		this.endereco = endereco;
		this.especialidade = especialidade;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return nome + " -- " + cnpj +" -- " + telefone + "\n"
				+ endereco + "\nespecialidade=" + especialidade.getNome();
	}

	
	
}
