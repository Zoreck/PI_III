package Projeto_integrador_3_entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_TRAMITAÇÃO")
public class Tramitação {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTramitacao;
	
	private Date data_inicio;

	public Date getData_inicio() {
		return data_inicio;
	}
	
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	
	public Integer getIdTramitacao() {
		return idTramitacao;
	}

	public void setIdTramitacao(Integer idTramitacao) {
		this.idTramitacao = idTramitacao;
	}


}
