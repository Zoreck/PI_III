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
	private TecnologiaUtilizada tecUtilizada;
	private String nome;
	private String objetivo;
	private Date data_inicio_prevista;
	private Date data_fim_prevista;
	private Date data_inicio_real;
	private Date data_fim_real;
	private Integer total_pf;
	private Integer esforço_horas;
	private Integer esforço_meses;
	private Double custo_total;
	private Usuario scrumMaster;
	
	public Projeto() {
		scrumMaster = new Usuario();
		tecUtilizada = new TecnologiaUtilizada();
	}
	
	public Projeto(Integer id_projeto, TecnologiaUtilizada tecUtilizada, String nome, String objetivo,
			Date data_inicio_prevista, Date data_fim_prevista, Date data_inicio_real, Date data_fim_real,
			Integer total_pf, Integer esforço_horas, Integer esforço_meses, Double custo_total, Usuario scrumMaster) {
		super();
		this.id_projeto = id_projeto;
		this.tecUtilizada = tecUtilizada;
		this.nome = nome;
		this.objetivo = objetivo;
		this.data_inicio_prevista = data_inicio_prevista;
		this.data_fim_prevista = data_fim_prevista;
		this.data_inicio_real = data_inicio_real;
		this.data_fim_real = data_fim_real;
		this.total_pf = total_pf;
		this.esforço_horas = esforço_horas;
		this.esforço_meses = esforço_meses;
		this.custo_total = custo_total;
		this.scrumMaster = scrumMaster;
	}
	
	public Integer getId_projeto() {
		return id_projeto;
	}
	public void setId_projeto(Integer id_projeto) {
		this.id_projeto = id_projeto;
	}
	
	public Usuario getScrumMaster() {
		return scrumMaster;
	}
	public void setScrum_master(Usuario scrumMaster) {
		this.scrumMaster = scrumMaster;
	}
	
	public TecnologiaUtilizada getTecUtilizada() {
		return tecUtilizada;
	}

	public void setTecUtilizada(TecnologiaUtilizada tecUtilizada) {
		this.tecUtilizada = tecUtilizada;
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
	
	public Integer getEsforço_horas() {
		return esforço_horas;
	}
	public void setEsforço_horas(Integer esforço_horas) {
		this.esforço_horas = esforço_horas;
	}
	
	public Integer getEsforço_meses() {
		return esforço_meses;
	}
	public void setEsforço_meses(Integer esforço_meses) {
		this.esforço_meses = esforço_meses;
	}
	
	public Double getCusto_total() {
		return custo_total;
	}
	public void setCusto_total(Double custo_total) {
		this.custo_total = custo_total;
	}
}
