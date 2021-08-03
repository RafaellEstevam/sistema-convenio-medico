package br.com.convenioMedico.sistemaConvenioMedico;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.convenioMedico.sistemaConvenioMedico.model.Bairro;
import br.com.convenioMedico.sistemaConvenioMedico.model.Consultorio;
import br.com.convenioMedico.sistemaConvenioMedico.model.Especialidade;
import br.com.convenioMedico.sistemaConvenioMedico.model.Estado;
import br.com.convenioMedico.sistemaConvenioMedico.model.Hospital;
import br.com.convenioMedico.sistemaConvenioMedico.model.Municipio;
import br.com.convenioMedico.sistemaConvenioMedico.repository.BairroRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.ConsultorioRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.EspecialidadeRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.EstadoRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.HospitalRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.LaboratorioRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.MunicipioRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.ProntoSocorroRepository;
import br.com.convenioMedico.sistemaConvenioMedico.repository.TipoServicoRepository;

@SpringBootApplication
public class SistemaConvenioMedicoApplication implements CommandLineRunner {

	private final EstadoRepository estadoRepository;
	private final MunicipioRepository municipioRepository;
	private final BairroRepository bairroRepository;
	private final TipoServicoRepository tipoServicoRepository;
	private final EspecialidadeRepository especialidadeRepository;
	private final HospitalRepository hospitalRepository;
	private final ConsultorioRepository consultorioRepository;
	private final ProntoSocorroRepository prontoSocorroRepository;
	private final LaboratorioRepository laboratorioRepository;

	public SistemaConvenioMedicoApplication(EstadoRepository estadoRepository, MunicipioRepository municipioRepository,
			BairroRepository bairroRepository, TipoServicoRepository tipoServicoRepository,
			EspecialidadeRepository especialidadeRepository, HospitalRepository hospitalRepository,
			ConsultorioRepository consultorioRepository, ProntoSocorroRepository prontoSocorroRepository,
			LaboratorioRepository laboratorioRepository) {
		super();
		this.estadoRepository = estadoRepository;
		this.municipioRepository = municipioRepository;
		this.bairroRepository = bairroRepository;
		this.tipoServicoRepository = tipoServicoRepository;
		this.especialidadeRepository = especialidadeRepository;
		this.hospitalRepository = hospitalRepository;
		this.consultorioRepository = consultorioRepository;
		this.prontoSocorroRepository = prontoSocorroRepository;
		this.laboratorioRepository = laboratorioRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SistemaConvenioMedicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estado estado = new Estado();
		estado.setId(1L);
		
		Municipio cidade = new Municipio();
		cidade.setId(2L);
		
		Bairro bairro = new Bairro();
		bairro.setId(2L);
		
		Especialidade especialidade = new Especialidade();
		especialidade.setId(2L);
		
		
		List<Consultorio> consultorios = consultorioRepository.findConsultoriosCredenciados(estado, cidade, bairro, especialidade);
		
		
		for (Consultorio consultorio : consultorios) {
			System.out.println(consultorio);
		}
		
		
		
	}

}







/* 		
   		CADASTRO DE HOSPITAL
 		Estado estado = new Estado();
		estado.setId(1L);

		Municipio cidade = new Municipio();
		cidade.setId(1L);

		Bairro bairro = new Bairro();
		bairro.setId(1L);

		Endereco endereco = new Endereco("04013060", "RUA AZEVEDO MACEDO, 113", estado, cidade, bairro);

		Especialidade especialidade = new Especialidade();
		especialidade.setId(1L);

		Hospital hospital = new Hospital("HOSPITAL DA LUZ", " 51.722.957/0005-06", Regiao.ZONAOESTE, "11 - 3003-1333",
				endereco, especialidade);

		hospitalRepository.save(hospital);
		
		
		
		
		
		
		CADASTRO DE CONSULTORIO		
		Estado estado = new Estado();
		estado.setId(1L);

		Municipio cidade = new Municipio();
		cidade.setId(2L);

		Bairro bairro = new Bairro();
		bairro.setId(2L);
		
		
		Endereco endereco = new Endereco("13024410", "RUA ALECRINS, 401 SALA 02", estado, cidade, bairro);
		
		Especialidade especialidade = new Especialidade();
		especialidade.setId(2L);
		
		Consultorio consultorio = new Consultorio("CRISTIANE SCAFF BENATTI", "CRM-SP 82853", Regiao.CENTRO, "19 - 3254-0887", endereco, especialidade); 
		
		
		consultorioRepository.save(consultorio);
		
		
		
		
		
		CADASTRO DE PS
		
		Estado estado = new Estado();
		estado.setId(1L);

		Municipio cidade = new Municipio();
		cidade.setId(1L);

		Bairro bairro = new Bairro();
		bairro.setId(1L);

		Endereco endereco = new Endereco("01227200", "AVENIDA ANGELICA, 1987", estado, cidade, bairro);

		Especialidade especialidade = new Especialidade();
		especialidade.setId(6L);
		
		ProntoSocorro ps = new ProntoSocorro("HOSPITAL INFANTIL SABARA", "61.213.674/0002-40", Regiao.ZONAOESTE, "11 - 3155-2800", endereco, especialidade);
		
		prontoSocorroRepository.save(ps);
 */





