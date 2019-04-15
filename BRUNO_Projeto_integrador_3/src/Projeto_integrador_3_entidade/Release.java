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
@Table(name="TAB_RELEASE")

public class Release {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroRelease;
	private Date data_prevista_entrega;
	private Date data_real_entrega;
	private String anotaçao;
	
	@OneToMany(mappedBy="release")
	private List<Sprint> sprints;
	
	@ManyToOne
	@JoinColumn(name="Projeto_id_projeto")
	private Projeto projeto;
	
	public List<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	public Integer getNumeroRelease() {
		return numeroRelease;
	}
	public void setNumeroRelease(Integer numeroRelease) {
		this.numeroRelease = numeroRelease;
	}
	public Date getData_prevista_entrega() {
		return data_prevista_entrega;
	}
	public void setData_prevista_entrega(Date data_prevista_entrega) {
		this.data_prevista_entrega = data_prevista_entrega;
	}
	public Date getData_real_entrega() {
		return data_real_entrega;
	}
	public void setData_real_entrega(Date data_real_entrega) {
		this.data_real_entrega = data_real_entrega;
	}
	public String getAnotaçao() {
		return anotaçao;
	}
	public void setAnotaçao(String anotaçao) {
		this.anotaçao = anotaçao;
	}

}
