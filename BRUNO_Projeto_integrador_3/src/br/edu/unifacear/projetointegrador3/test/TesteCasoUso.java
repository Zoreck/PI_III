package br.edu.unifacear.projetointegrador3.test;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.CasoUsoBusiness;
import br.edu.unifacear.projetointegrador3.entity.CasoUso;

public class TesteCasoUso {

	@Test
	public void inserirCasoUso() throws BusinessException {

		CasoUso casouso = new CasoUso();
		
		casouso.setNome("Cadastrar usuario");
		casouso.setObjetivo("Fazer o cadastramento de usuario");
		
		
		try {
			new CasoUsoBusiness().deveriaSalvarCasoUso(casouso);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarCasoUso() throws BusinessException {

		try {
			new CasoUsoBusiness().deveriaListarCasoUso();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void alterarCasoUso() throws BusinessException{
		
		String nome = ("Cadastrar funcionario");
		String nomeNovo = ("Cadastrar cliente");
		
		try {
			new CasoUsoBusiness().deveriaAlterarCasoUso(nomeNovo,nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
}
