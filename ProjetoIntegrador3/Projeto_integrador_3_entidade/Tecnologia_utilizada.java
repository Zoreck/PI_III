package Projeto_integrador_3_entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_TECNOLOGIA")

public class Tecnologia_utilizada {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id_tecnlogia;
	private String descrição;
	private Integer produtividade_pf;
	
	public Integer getId_tecnlogia() {
		return id_tecnlogia;
	}
	public void setId_tecnlogia(Integer id_tecnlogia) {
		this.id_tecnlogia = id_tecnlogia;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Integer getProdutividade_pf() {
		return produtividade_pf;
	}
	public void setProdutividade_pf(Integer produtividade_pf) {
		this.produtividade_pf = produtividade_pf;
	}
	
}
