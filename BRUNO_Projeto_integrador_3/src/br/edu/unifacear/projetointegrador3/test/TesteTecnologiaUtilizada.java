package br.edu.unifacear.projetointegrador3.test;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.TecnologiaUtilizadaBusiness;
import br.edu.unifacear.projetointegrador3.entity.Tecnologia_utilizada;

public class TesteTecnologiaUtilizada {

	@Test
	public void inserirTecnologiaUtilizada() throws BusinessException {

		Tecnologia_utilizada tecUtilizada = new Tecnologia_utilizada();
		
		tecUtilizada.setDescricao("JAVA DESKTOP");
		
		try {
			new TecnologiaUtilizadaBusiness().deveriaSalvarTecnologiaUtilizada(tecUtilizada);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarTecnologiaUtilizada() throws BusinessException {

		try {
			new TecnologiaUtilizadaBusiness().deveriaListarTecnologiaUtilizada();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void alterarTecnologiaUtilizada() throws BusinessException{
		
		String nome = ("JAVA DESKTOP");
		String nomeNovo = ("JAVA WEB");
		
		try {
			new TecnologiaUtilizadaBusiness().deveriaAlterarTecnologiaUtilizada(nomeNovo,nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
}
