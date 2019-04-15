package Projeto_integrador_teste;

import org.junit.Test;

import Projeto_integrador_3_DAO.DAO;
import Projeto_integrador_3_DAO.Generec_DAO;
import Projeto_integrador_3_entidade.Usuario;

public class newTest {
	
	@Test
	public void main() {

		Usuario user = new Usuario();
		
		user.setNome("Lucas");
		user.setLogin("Luquinhas123");
		user.setSenha("ElefanteColorido");

		DAO<Usuario> daouser = new Generec_DAO<Usuario>();
		daouser.inserir(user);
		
		
	}

}
