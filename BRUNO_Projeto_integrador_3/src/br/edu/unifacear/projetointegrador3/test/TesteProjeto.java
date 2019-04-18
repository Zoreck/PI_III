package br.edu.unifacear.projetointegrador3.test;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.ProjetoBusiness;
import br.edu.unifacear.projetointegrador3.entity.Projeto;

public class TesteProjeto {

	@Test
	public void inserirProjeto() throws BusinessException {

		Projeto projeto = new Projeto();
		
		projeto.setNome("PI_4");
		projeto.setObjetivo("gestao de empresas");
		
		
		try {
			new ProjetoBusiness().deveriaSalvarProjeto(projeto);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarProjeto() throws BusinessException {

		try {
			new ProjetoBusiness().deveriaListarProjetos();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void alterarProjeto() throws BusinessException{
		
		String nome = ("Projeto novo");
		String nomeNovo = ("Projeto 4");
		
		try {
			new ProjetoBusiness().deveriaAlterarProjeto(nomeNovo,nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
}
