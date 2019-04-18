package br.edu.unifacear.projetointegrador3.business;

import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.ProductOwner;

public class ProductOwnerBusiness {


	
	public String deveriaSalvarProductOwner(ProductOwner PO) throws BusinessException {

		Generec_DAO<ProductOwner> daoProductOwner= new Generec_DAO<ProductOwner>();

		if ((PO.getNome().equals(null))) {

			throw new BusinessException("Impossível inserir Prodct Owrner com campos nulos");

		} else {

			List<ProductOwner> donos = daoProductOwner.listarTodos(ProductOwner.class);

			int i = 0;

			for (i = 0; i <donos.size(); i++) {

				if (donos.get(i).getNome().equals(PO.getNome())) {
					throw new BusinessException("Nome ja Utilizado");
				} else if (i == donos.size() - 1) {

					daoProductOwner.inserir(PO);
				}
			}

			if (donos.size() == 0) {
				daoProductOwner.inserir(PO);
			}
		}
		return null;
	}
	
	public String deveriaListarProductOwner() throws BusinessException {

		Generec_DAO<ProductOwner> daoProductOwner = new Generec_DAO<ProductOwner>();

		List<ProductOwner> donos = daoProductOwner.listarTodos(ProductOwner.class);

		if (donos.size() == 0) {
			throw new BusinessException("Nenhum Prodct Owrner a ser listado");
		} else {
			for (ProductOwner u : donos) {
				System.out.println(u.getNome());
			}
		}

		return null;
	}
	public String deveriaAlterarProductOwner(String novoNome, String nome) throws BusinessException {

		Generec_DAO<ProductOwner> daoProductOwner = new Generec_DAO<ProductOwner>();

		List<ProductOwner> donos = daoProductOwner.listarTodos(ProductOwner.class);

		for (int i = 0; i < donos.size(); i++) {
			if (nome.equals(donos.get(i).getNome())) {
				donos.get(i).setNome(novoNome);

				daoProductOwner.alterar(donos.get(i));

				break;
			}
		}

		return null;
	}
	
}
