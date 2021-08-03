package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Plano {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer codigoAns;
	private String nome;
	private BigDecimal valor;

	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "plano_consultorio", joinColumns = @JoinColumn(name = "plano_id"), inverseJoinColumns = @JoinColumn(name = "consultorio_id"))
	private List<Consultorio> consultorios;

	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "plano_hospital", joinColumns = @JoinColumn(name = "plano_id"), inverseJoinColumns = @JoinColumn(name = "hospital_id"))
	private List<Hospital> hospitais;

	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "plano_prontoSocorro", joinColumns = @JoinColumn(name = "plano_id"), inverseJoinColumns = @JoinColumn(name = "prontoSocorro_id"))
	private List<ProntoSocorro> prontosSocorros;

	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "plano_laboratorio", joinColumns = @JoinColumn(name = "plano_id"), inverseJoinColumns = @JoinColumn(name = "laboratorio_id"))
	private List<Laboratorio> laboratorios;

	/**
	 * 
	 */
	public Plano() {
		// TODO Auto-generated constructor stub
	}

	public Plano(Integer codigoAns, String nome, BigDecimal valor, List<Consultorio> consultorios,
			List<Hospital> hospitais, List<ProntoSocorro> prontosSocorros, List<Laboratorio> laboratorios) {
		super();
		this.codigoAns = codigoAns;
		this.nome = nome;
		this.valor = valor;
		this.consultorios = consultorios;
		this.hospitais = hospitais;
		this.prontosSocorros = prontosSocorros;
		this.laboratorios = laboratorios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigoAns() {
		return codigoAns;
	}

	public void setCodigoAns(Integer codigoAns) {
		this.codigoAns = codigoAns;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Consultorio> getConsultorios() {
		return consultorios;
	}

	public void setConsultorios(List<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public List<Hospital> getHospitais() {
		return hospitais;
	}

	public void setHospitais(List<Hospital> hospitais) {
		this.hospitais = hospitais;
	}

	public List<ProntoSocorro> getProntosSocorros() {
		return prontosSocorros;
	}

	public void setProntosSocorros(List<ProntoSocorro> prontosSocorros) {
		this.prontosSocorros = prontosSocorros;
	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

}
