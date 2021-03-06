package br.edu.unifacear.projetointegrador3.test;

import org.junit.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.UsuarioBusiness;
import br.edu.unifacear.projetointegrador3.entity.Usuario;

public class newTest {
	
	@Test
	public void inserirUsuario() throws BusinessException {

		Usuario user = new Usuario();
		
		user.setNome("bruno");
		user.setLogin("Luquinhas123");
		user.setSenha("ElefanteColorido");
		user.setCpf("890.004.349-15");
		
		try {
			new UsuarioBusiness().SalvarUsuario(user);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarUsario() throws BusinessException {

		try {
			new UsuarioBusiness().ListarUsuario();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}	
	@Test
	public void alterarUsuario() throws BusinessException{
		
		String cpf = ("890.004.349-15");
		String nome = ("CACETUDO");
		
		try {
			new UsuarioBusiness().AlterarUsuario(cpf,nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void excluirUsuario() throws BusinessException{
		
		String cpf = ("090.004.349-95");
		
		try {
			new UsuarioBusiness().ExcluirUsuario(cpf);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

}
