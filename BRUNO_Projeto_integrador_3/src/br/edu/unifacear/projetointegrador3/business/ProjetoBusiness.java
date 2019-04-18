package br.edu.unifacear.projetointegrador3.business;

import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.Projeto;

public class ProjetoBusiness {

	
	public String deveriaSalvarProjeto(Projeto projeto) throws BusinessException {

		Generec_DAO<Projeto> daoProjeto = new Generec_DAO<Projeto>();

		if ((projeto.getNome().equals(null))) {

			throw new BusinessException("Impossível inserir projeto com campos nulos");

		} else {

			List<Projeto> projetos = daoProjeto.listarTodos(Projeto.class);

			int i = 0;

			for (i = 0; i <projetos.size(); i++) {

				if (projetos.get(i).getNome().equals(projeto.getNome())) {
					throw new BusinessException("Nome ja Utilizado");
				} else if (i == projetos.size() - 1) {

					daoProjeto.inserir(projeto);
				}
			}

			if (projetos.size() == 0) {
				daoProjeto.inserir(projeto);
			}
		}
		return null;
	}
	
	public String deveriaListarProjetos() throws BusinessException {

		Generec_DAO<Projeto> daoProjeto = new Generec_DAO<Projeto>();

		List<Projeto> projetos = daoProjeto.listarTodos(Projeto.class);

		if (projetos.size() == 0) {
			throw new BusinessException("Nenhum projeto a ser listado");
		} else {
			for (Projeto u : projetos) {
				System.out.println(u.getNome());
			}
		}

		return null;
	}
	public String deveriaAlterarProjeto(String novoNome, String nome) throws BusinessException {

		Generec_DAO<Projeto> daoProjeto = new Generec_DAO<Projeto>();

		List<Projeto> projetos = daoProjeto.listarTodos(Projeto.class);

		for (int i = 0; i < projetos.size(); i++) {
			if (nome.equals(projetos.get(i).getNome())) {
				projetos.get(i).setNome(novoNome);

				daoProjeto.alterar(projetos.get(i));

				break;
			}
		}

		return null;
	}
}
