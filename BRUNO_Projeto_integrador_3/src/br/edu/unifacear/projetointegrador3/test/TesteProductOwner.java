package br.edu.unifacear.projetointegrador3.test;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.business.ProductOwnerBusiness;
import br.edu.unifacear.projetointegrador3.entity.ProductOwner;

public class TesteProductOwner {

	
	@Test
	public void inserirProductOwner() throws BusinessException {

		ProductOwner PO = new ProductOwner();
		
		PO.setNome("Ricardo");
		
		try {
			new ProductOwnerBusiness().deveriaSalvarProductOwner(PO);
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void listarProductOwner() throws BusinessException {

		try {
			new ProductOwnerBusiness().deveriaListarProductOwner();
		} catch (BusinessException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void alterarProductOwner() throws BusinessException{
		
		String nome = ("Ricardo");
		String nomeNovo = ("Frederico");
		
		try {
			new ProductOwnerBusiness().deveriaAlterarProductOwner(nomeNovo,nome);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
}
