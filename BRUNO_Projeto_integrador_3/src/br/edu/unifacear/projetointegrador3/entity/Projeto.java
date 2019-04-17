package br.edu.unifacear.projetointegrador3.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TAB_PROJETO")

public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_projeto;
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
	private Integer scrum_master;
	private Integer id_po;

	@OneToMany(mappedBy="projeto")
	private List<Tramitacao> tramitacao;
	
	@OneToMany(mappedBy="projeto")
	private List<ProjetoUsuario> projetousuario;
	
	@OneToMany(mappedBy="projeto")
	private List <Release> release;
	
	@OneToMany(mappedBy="projeto")
	private List <CasoUso> casouso;
	
	@OneToMany(mappedBy="projeto")
	private List <Tecnologia_utilizada> TecnologiaUtilizada;
	
	
	
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
	public Integer getId_po() {
		return id_po;
	}
	public void setId_po(Integer id_po) {
		this.id_po = id_po;
	}
	public List<Release> getRelease() {
		return release;
	}
	public void setRelease(List<Release> release) {
		this.release = release;
	}
	public List<ProjetoUsuario> getProjetousuario() {
		return projetousuario;
	}
	public void setProjetousuario(List<ProjetoUsuario> projetousuario) {
		this.projetousuario = projetousuario;
	}
	public List<CasoUso> getCasouso() {
		return casouso;
	}
	public void setCasouso(List<CasoUso> casouso) {
		this.casouso = casouso;
	}
	public List<Tecnologia_utilizada> getTecnologiaUtilizada() {
		return TecnologiaUtilizada;
	}
	public void setTecnologiaUtilizada(List<Tecnologia_utilizada> tecnologiaUtilizada) {
		TecnologiaUtilizada = tecnologiaUtilizada;
	}
	
	
}
