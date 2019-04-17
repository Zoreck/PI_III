package br.edu.unifacear.projetointegrador.entity;

import java.util.Date;
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
@Table(name="TAB_SPRINT")

public class Sprint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero_sprint;
	private Date data_inicio_real;
	private Date data_fim_real;
	private String anota�ao;

	@ManyToOne
	@JoinColumn(name="Release_numeroRelease")
	private Release release;
	
	@OneToMany(mappedBy="sprint")
	private List<SprintCasoUso> Sprintcasouso;	
	
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
	public String getAnota�ao() {
		return anota�ao;
	}
	public void setAnota�ao(String anota�ao) {
		this.anota�ao = anota�ao;
	}

}
