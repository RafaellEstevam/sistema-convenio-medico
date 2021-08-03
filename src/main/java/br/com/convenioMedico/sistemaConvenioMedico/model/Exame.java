package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Exame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String preparo;

	@ManyToMany(mappedBy = "exames", fetch = FetchType.EAGER)
	private List<Laboratorio> laboratorios;

	/**
	 * 
	 */
	public Exame() {
		// TODO Auto-generated constructor stub
	}

	public Exame(String nome, String preparo) {
		super();
		this.nome = nome;
		this.preparo = preparo;
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

	public String getPreparo() {
		return preparo;
	}

	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

}
