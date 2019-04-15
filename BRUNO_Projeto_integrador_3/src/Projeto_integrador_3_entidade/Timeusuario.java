package Projeto_integrador_3_entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TAB_TIMEUSUARIO")
public class Timeusuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@OneToMany
	(mappedBy="timesuario")
	private List<Time> time;
	
	@OneToMany
	(mappedBy="timeusuario")
	private List<Usuario> usuario;
	
	public List<Time> getTime() {
		return time;
	}
	public void setTime(List<Time> time) {
		this.time = time;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
}
