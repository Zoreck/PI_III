package Projeto_integrador_3_entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_PROJETO")

public class Projeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id_projeto;
	private String nome;
	private String objetivo;
	private Date data_inicio_prevista;
	private Date data_fim_prevista;
	private Date data_inicio_real;
	private Date data_fim_real;
	private Integer total_pf;
	private Integer esfor�o_horas;
	private Integer esfor�o_meses;
	private Double custo_total;
	private Integer scrum_master;
	
	public Integer getScrum_master() {
		return scrum_master;
	}
	public void setScrum_master(Integer scrum_master) {
		this.scrum_master = scrum_master;
	}
	public Integer getId_projeto() {
		return id_projeto;
	}
	public void setId_projeto(Integer id_projeto) {
		this.id_projeto = id_projeto;
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
	public Date getData_inicio_prevista() {
		return data_inicio_prevista;
	}
	public void setData_inicio_prevista(Date data_inicio_prevista) {
		this.data_inicio_prevista = data_inicio_prevista;
	}
	public Date getData_fim_prevista() {
		return data_fim_prevista;
	}
	public void setData_fim_prevista(Date data_fim_prevista) {
		this.data_fim_prevista = data_fim_prevista;
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
	public Integer getTotal_pf() {
		return total_pf;
	}
	public void setTotal_pf(Integer total_pf) {
		this.total_pf = total_pf;
	}
	public Integer getEsfor�o_horas() {
		return esfor�o_horas;
	}
	public void setEsfor�o_horas(Integer esfor�o_horas) {
		this.esfor�o_horas = esfor�o_horas;
	}
	public Integer getEsfor�o_meses() {
		return esfor�o_meses;
	}
	public void setEsfor�o_meses(Integer esfor�o_meses) {
		this.esfor�o_meses = esfor�o_meses;
	}
	public Double getCusto_total() {
		return custo_total;
	}
	public void setCusto_total(Double custo_total) {
		this.custo_total = custo_total;
	}
	
}
