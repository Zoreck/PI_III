package br.edu.unifacear.projetointegrador3.business;

import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.Fase_projeto;
import br.edu.unifacear.projetointegrador3.entity.Projeto;

public class FaseProjetoBusiness {


	public String deveriaSalvarFaseProjeto(Fase_projeto faseprojeto) throws BusinessException {

		Generec_DAO<Fase_projeto> daoFaseProjeto = new Generec_DAO<Fase_projeto>();

		if ((faseprojeto.getFase().equals(null))) {

			throw new BusinessException("Impossível inserir a fase com campos nula");

		} else {

			List<Fase_projeto> fases = daoFaseProjeto.listarTodos(Fase_projeto.class);

			int i = 0;

			for (i = 0; i <fases.size(); i++) {

				if (fases.get(i).getFase().equals(faseprojeto.getFase())) {
					throw new BusinessException("Fase ja Utilizado");
				} else if (i == fases.size() - 1) {

					daoFaseProjeto.inserir(faseprojeto);
				}
			}

			if (fases.size() == 0) {
				daoFaseProjeto.inserir(faseprojeto);
			}
		}
		return null;
	}
	
	public String deveriaListarFaseProjeto() throws BusinessException {

		Generec_DAO<Fase_projeto> daoFaseProjeto = new Generec_DAO<Fase_projeto>();

		List<Fase_projeto> fases = daoFaseProjeto.listarTodos(Fase_projeto.class);

		if (fases.size() == 0) {
			throw new BusinessException("Nenhuma Fase a ser listada");
		} else {
			for (Fase_projeto u : fases) {
				System.out.println(u.getFase());
			}
		}

		return null;
	}
	public String deveriaAlterarFaseProjeto(String faseNova, String fase) throws BusinessException {

		Generec_DAO<Fase_projeto> daoFaseProjeto = new Generec_DAO<Fase_projeto>();

		List<Fase_projeto> fases = daoFaseProjeto.listarTodos(Fase_projeto.class);

		for (int i = 0; i < fases.size(); i++) {
			if (fase.equals(fases.get(i).getFase())) {
				fases.get(i).setFase(faseNova);

				daoFaseProjeto.alterar(fases.get(i));

				break;
			}
		}

		return null;
	}

	
	
	
}
