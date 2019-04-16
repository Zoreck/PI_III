package Projeto_integrador_3_entidade;

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
@Table(name="TAB_CASO_USO")

public class CasoUso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCasoUso;
	private String nome;
	private String objetivo;
	private String prioridade;
	private String anexo;
	
	@ManyToOne
	@JoinColumn(name="casouso")
	private Projeto projeto;
	
	@OneToMany(mappedBy="casouso")
	private List<SprintCasoUso> Sprintcasouso;	
	
	
	public Integer getidCasoUso() {
		return idCasoUso;
	}
	public void setidCasoUso(Integer idCasoUso) {
		this.idCasoUso = idCasoUso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	
}
