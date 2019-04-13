package Projeto_integrador_3_entidade;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_RELEASE")

public class Release {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Integer numero_release;
	private Date data_prevista_entrega;
	private Date data_real_entrega;
	private String anotaçao;
	private List<Sprint> sprits;
	
	public Integer getNumero_release() {
		return numero_release;
	}
	public void setNumero_release(Integer numero_release) {
		this.numero_release = numero_release;
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
	public List<Sprint> getSprits() {
		return sprits;
	}
	public void setSprits(List<Sprint> sprits) {
		this.sprits = sprits;
	}
}
