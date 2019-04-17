package br.edu.unifacear.projetointegrador.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TAB_USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idUsuario;
	private String nome;
	private String login;
	private String senha;
	private String cpf;
	
	@OneToMany(mappedBy="usuario")
	private List<Tramitacao> tramitacao;
	
	@OneToMany(mappedBy="usuario")
	private List<ProjetoUsuario> projetousuario;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<Tramitacao> getTramitacao() {
		return tramitacao;
	}
	public void setTramitacao(List<Tramitacao> tramitacao) {
		this.tramitacao = tramitacao;
	}
	public List<ProjetoUsuario> getProjetousuario() {
		return projetousuario;
	}
	public void setProjetousuario(List<ProjetoUsuario> projetousuario) {
		this.projetousuario = projetousuario;
	}
	
	
}
