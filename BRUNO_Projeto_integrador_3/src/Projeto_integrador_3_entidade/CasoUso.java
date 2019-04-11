package Projeto_integrador_3_entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TAB_CASO_USO")

public class CasoUso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCasoUso;
	@ManyToOne
	@JoinColumn(name="ID_CASOUSO")
	private Projeto projeto;
	private String nome;
	private String objetivo;
	private String prioridade;
	private String anexo;
	
	
	public CasoUso() {
		projeto = new Projeto();
	}
	
	public CasoUso(Integer idCasoUso, Projeto projeto, String nome, String objetivo, String prioridade, String anexo) {
		super();
		this.idCasoUso = idCasoUso;
		this.projeto = projeto;
		this.nome = nome;
		this.objetivo = objetivo;
		this.prioridade = prioridade;
		this.anexo = anexo;
	}

	public Integer getId_caso_uso() {
		return idCasoUso;
	}
	public void setId_caso_uso(Integer idCasoUso) {
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
