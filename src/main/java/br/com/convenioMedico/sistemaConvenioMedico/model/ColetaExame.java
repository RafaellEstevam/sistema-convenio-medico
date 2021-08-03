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
import javax.persistence.OneToMany;

/**
 * @author Rafaell Estevam
 *
 */
@Entity
public class ColetaExame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private LocalTime horario;
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	private Exame exame;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Laboratorio laboratorio;

	/**
	 * 
	 */
	public ColetaExame() {
		// TODO Auto-generated constructor stub
	}

	//para popular o BD com as datas e horários disponíveis para agendamento, "exame", "cliente" e "laboratório devem ir como "Null".
	public ColetaExame(LocalDate data, LocalTime horario, Status status, Exame exame, Cliente cliente,
			Laboratorio laboratorio) {
		super();
		this.data = data;
		this.horario = horario;
		this.status = status;
		this.exame = exame;
		this.cliente = cliente;
		this.laboratorio = laboratorio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
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

}
