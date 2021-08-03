package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Profissional {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String crm;
	private String nome;
	private String cpf;
	private String telefone;

	@ManyToOne
	private Especialidade especialidade;

	@OneToMany(mappedBy = "profissional", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Consulta> consultas;

	@ManyToOne
	private Consultorio consultorio;

	/**
	 * 
	 */
	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(String crm, String nome, String cpf, String telefone, Especialidade especialidade,
			Consultorio consultorio) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.especialidade = especialidade;
		this.consultorio = consultorio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

}
