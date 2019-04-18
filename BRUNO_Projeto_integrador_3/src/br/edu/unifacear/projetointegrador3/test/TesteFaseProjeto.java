package br.edu.unifacear.projetointegrador3.test;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.FaseProjetoBusiness;
import br.edu.unifacear.projetointegrador3.entity.Fase_projeto;

public class TesteFaseProjeto {

	@Test
	public void inserirFaseProjeto() throws BusinessException {

		Fase_projeto faseprojeto = new Fase_projeto();
		
		faseprojeto.setFase("A fazer");
		
		try {
			new FaseProjetoBusiness().deveriaSalvarFaseProjeto(faseprojeto);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarFaseProjeto() throws BusinessException {

		try {
			new FaseProjetoBusiness().deveriaListarFaseProjeto();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void alterarFaseProjeto() throws BusinessException{
		
		String fase = ("A fazer");
		String faseNova = ("Feito");
		
		try {
			new FaseProjetoBusiness().deveriaAlterarFaseProjeto(faseNova,fase);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

	
	
}
