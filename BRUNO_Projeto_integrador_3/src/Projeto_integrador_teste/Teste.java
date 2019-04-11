package Projeto_integrador_teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import Projeto_integrador_3_DAO.DAO;
import Projeto_integrador_3_DAO.Generec_DAO;
import Projeto_integrador_3_entidade.Usuario;

public class Teste {

	@Test
	public void Deveria_cadastrar_usuario(){
		
		Usuario usuario = new  Usuario();
		usuario.setNome("Bruno");
		
		DAO<Usuario> daousuario = new Generec_DAO<Usuario>();
		daousuario.inserir(usuario);
		
		//assertEquals(true,usuario.getId() != null);
	}
	@Test
	public void Deveria_listar_usuario() {
		
		DAO<Usuario> daousuario = new Generec_DAO<Usuario>();
		List<Usuario> lista_usuarios = daousuario.listarTodos(Usuario.class);
		assertEquals(true,lista_usuarios.size() > 0);
		
	}

}
