package br.edu.unifacear.projetointegrador3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fase_projeto")

public class Fase_projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_fase;
	private String fase;
	
	public Integer getId_fase() {
		return id_fase;
	}
	public void setId_fase(Integer id_fase) {
		this.id_fase = id_fase;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
}
