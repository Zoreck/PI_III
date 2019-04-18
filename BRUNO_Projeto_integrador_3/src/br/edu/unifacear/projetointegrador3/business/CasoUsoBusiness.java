package br.edu.unifacear.projetointegrador3.business;

import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.CasoUso;
import br.edu.unifacear.projetointegrador3.entity.Projeto;

public class CasoUsoBusiness {

	public String deveriaSalvarCasoUso(CasoUso casouso) throws BusinessException {

		Generec_DAO<CasoUso> daoCasoUso = new Generec_DAO<CasoUso>();

		if ((casouso.getNome().equals(null))) {

			throw new BusinessException("Impossível inserir Backlog com campos nulos");

		} else {

			List<CasoUso> listacasouso = daoCasoUso.listarTodos(CasoUso.class);

			int i = 0;

			for (i = 0; i <listacasouso.size(); i++) {

				if (listacasouso.get(i).getNome().equals(casouso.getNome())) {
					throw new BusinessException("Este Backlog ja esta sendo utilizado");
				} else if (i == listacasouso.size() - 1) {

					daoCasoUso.inserir(casouso);
				}
			}

			if (listacasouso.size() == 0) {
				daoCasoUso.inserir(casouso);
			}
		}
		return null;
	}
	
	public String deveriaListarCasoUso() throws BusinessException {

		Generec_DAO<CasoUso> daoCasoUso = new Generec_DAO<CasoUso>();

		List<CasoUso> listacasouso = daoCasoUso.listarTodos(CasoUso.class);

		if (listacasouso.size() == 0) {
			throw new BusinessException("Nenhum Backlog a ser listado");
		} else {
			for (CasoUso u : listacasouso) {
				System.out.println(u.getNome());
			}
		}

		return null;
	}
	public String deveriaAlterarCasoUso(String novoNome, String nome) throws BusinessException {

		Generec_DAO<CasoUso> daoCasoUso = new Generec_DAO<CasoUso>();

		List<CasoUso> listacasouso = daoCasoUso.listarTodos(CasoUso.class);

		for (int i = 0; i < listacasouso.size(); i++) {
			if (nome.equals(listacasouso.get(i).getNome())) {
				listacasouso.get(i).setNome(novoNome);

				daoCasoUso.alterar(listacasouso.get(i));

				break;
			}
		}

		return null;
	}
	
}
