package br.edu.unifacear.projetointegrador3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.DAO.DAO;
import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.Usuario;

public class Teste {

	@Test
	public void Deveria_cadastrar_usuario(){
		
		Usuario usuario = new  Usuario();
		usuario.setNome("Bruno");
		
		DAO<Usuario> daousuario = new Generec_DAO<Usuario>();
		daousuario.inserir(usuario);
		
		//assertEquals(true,usuario.getId_usuario() != null);
	}
	@Test
	public void Deveria_listar_usuario() {
		
		DAO<Usuario> daousuario = new Generec_DAO<Usuario>();
		List<Usuario> lista_usuarios = daousuario.listarTodos(Usuario.class);
		assertEquals(true,lista_usuarios.size() > 0);
		
	}

}
