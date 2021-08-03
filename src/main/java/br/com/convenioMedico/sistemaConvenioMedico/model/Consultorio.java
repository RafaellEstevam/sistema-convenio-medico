package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Consultorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String CnpjOuCrm;
	@Enumerated(EnumType.STRING)
	private Regiao regiao;
	private String telefone;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@JoinColumn(unique = true)
	private Endereco endereco;

	@ManyToOne
	private Especialidade especialidade;

	@OneToMany(mappedBy = "consultorio", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Profissional> profissionais;

	/**
	 * 
	 */
	public Consultorio() {
		// TODO Auto-generated constructor stub
	}

	public Consultorio(String nome, String cnpjOuCrm, Regiao regiao, String telefone, Endereco endereco,
			Especialidade especialidade) {
		super();
		this.nome = nome;
		CnpjOuCrm = cnpjOuCrm;
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

	public String getCnpjOuCrm() {
		return CnpjOuCrm;
	}

	public void setCnpjOuCrm(String cnpjOuCrm) {
		CnpjOuCrm = cnpjOuCrm;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", CnpjOuCrm=" + CnpjOuCrm + ", telefone=" + telefone + ", endereco= " + endereco
				+ ", especialidade=" + especialidade.getNome();
	}

	
	
}
