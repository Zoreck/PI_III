package br.edu.unifacear.testarbanco;

import org.junit.Test;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;

public class test {
	@Test
	public void inserircliente() {
		
		cliente cli = new cliente();
		
		cli.setNome("Lucas");
		cli.setIdade(15);
		Dao<cliente> daoCliente = new GenericDao<cliente>();
		daoCliente.inserir(cli);
		
		
		
		
	}

}
