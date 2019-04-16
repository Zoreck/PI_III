package Projeto_integrador_3_entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAB_TECNOLOGIA")

public class Tecnologia_utilizada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTecnologia;
	private String descri��o;
	private Integer produtividade_pf;
	
	@ManyToOne
	@JoinColumn(name="tecnologiautilizada")
	private Projeto projeto;
	
	public Integer getId_tecnologia() {
		return idTecnologia;
	}
	public void setIdTecnologia(Integer idTecnologia) {
		this.idTecnologia = idTecnologia;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public Integer getProdutividade_pf() {
		return produtividade_pf;
	}
	public void setProdutividade_pf(Integer produtividade_pf) {
		this.produtividade_pf = produtividade_pf;
	}
	
}
