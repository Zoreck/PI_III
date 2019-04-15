package Projeto_integrador_3_entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_CASO_USO")

public class Caso_uso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_caso_uso;
	private String nome;
	private String objetivo;
	private String prioridade;
	private String anexo;
	
	public Integer getId_caso_uso() {
		return id_caso_uso;
	}
	public void setId_caso_uso(Integer id_caso_uso) {
		this.id_caso_uso = id_caso_uso;
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
