package Projeto_integrador_3_entidade;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TAB_SPRINT_CASO_USO")

public class SprintCasoUso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSprintCasoUso;
	private Integer esforço_horas;
	private Date data_inicio_prevista;
	private Date data_fim_prevista;
	private Date data_inicio_real;
	private Date data_fim_real;
	
	@ManyToOne
	@JoinColumn(name="idCasoUso")
	private CasoUso casouso;
	
	@ManyToOne
	@JoinColumn(name="idSprint")
	private Sprint sprint;
	
	@OneToMany(mappedBy="idTramitacao")
	private List<Tramitacao> tramitacao;
	
	public Integer getEsforço_horas() {
		return esforço_horas;
	}
	public void setEsforço_horas(Integer esforço_horas) {
		this.esforço_horas = esforço_horas;
	}
	public Date getData_inicio_prevista() {
		return data_inicio_prevista;
	}
	public void setData_inicio_prevista(Date data_inicio_prevista) {
		this.data_inicio_prevista = data_inicio_prevista;
	}
	public Date getData_fim_prevista() {
		return data_fim_prevista;
	}
	public void setData_fim_prevista(Date data_fim_prevista) {
		this.data_fim_prevista = data_fim_prevista;
	}
	public Date getData_inicio_real() {
		return data_inicio_real;
	}
	public void setData_inicio_real(Date data_inicio_real) {
		this.data_inicio_real = data_inicio_real;
	}
	public Date getData_fim_real() {
		return data_fim_real;
	}
	public void setData_fim_real(Date data_fim_real) {
		this.data_fim_real = data_fim_real;
	}

}
