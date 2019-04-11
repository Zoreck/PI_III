package Projeto_integrador_3_entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_SPRINT")

public class Sprint {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer numero_sprint;
	private Date data_inicio_real;
	private Date data_fim_real;
	private String anotaçao;
	private List<CasoUso> casos_uso;
	
	public Integer getNumero_sprint() {
		return numero_sprint;
	}
	public void setNumero_sprint(Integer numero_sprint) {
		this.numero_sprint = numero_sprint;
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
	public String getAnotaçao() {
		return anotaçao;
	}
	public void setAnotaçao(String anotaçao) {
		this.anotaçao = anotaçao;
	}
	public List<CasoUso> getCasos_uso() {
		return casos_uso;
	}
	public void setCasos_uso(List<CasoUso> casos_uso) {
		this.casos_uso = casos_uso;
	}
}
