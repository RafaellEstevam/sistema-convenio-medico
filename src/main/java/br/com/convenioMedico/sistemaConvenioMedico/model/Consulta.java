package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private LocalTime horario;
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Profissional profissional;

	/**
	 * 
	 */
	public Consulta() {
		// TODO Auto-generated constructor stub
	}

	public Consulta(LocalDate data, LocalTime horario, Status status, Cliente cliente, Profissional profissional) {
		super();
		this.data = data;
		this.horario = horario;
		this.status = status;
		this.cliente = cliente;
		this.profissional = profissional;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

}
