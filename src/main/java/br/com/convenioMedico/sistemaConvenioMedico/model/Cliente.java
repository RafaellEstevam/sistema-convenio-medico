package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.time.LocalDate;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numCarteirinha;
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String telefone;
	private String email;
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@JoinColumn(unique = true)
	private Endereco endereco;

	@ManyToOne
	private Plano plano;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Dependente> dependentes;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Consulta> consultas;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@Fetch(FetchMode.SUBSELECT)
	private List<ColetaExame> coletaExames;

	/**
	 * 
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer numCarteirinha, String nome, LocalDate dataNascimento, String cpf, String telefone,
			String email, Genero genero, Endereco endereco, Plano plano) {
		super();
		this.numCarteirinha = numCarteirinha;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.genero = genero;
		this.endereco = endereco;
		this.plano = plano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumCarteirinha() {
		return numCarteirinha;
	}

	public void setNumCarteirinha(Integer numCarteirinha) {
		this.numCarteirinha = numCarteirinha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public List<ColetaExame> getColetaExames() {
		return coletaExames;
	}

	public void setColetaExames(List<ColetaExame> coletaExames) {
		this.coletaExames = coletaExames;
	}

}
