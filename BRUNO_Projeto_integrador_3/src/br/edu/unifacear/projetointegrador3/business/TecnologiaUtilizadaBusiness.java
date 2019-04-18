package br.edu.unifacear.projetointegrador3.business;

import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.Projeto;
import br.edu.unifacear.projetointegrador3.entity.Tecnologia_utilizada;

public class TecnologiaUtilizadaBusiness {

	public String deveriaSalvarTecnologiaUtilizada(Tecnologia_utilizada tecUtilizada) throws BusinessException {

		Generec_DAO<Tecnologia_utilizada> daoTecnologiaUtilizada = new Generec_DAO<Tecnologia_utilizada>();

		if ((tecUtilizada.getDescricao().equals(null))) {

			throw new BusinessException("Impossível inserir Tecnologia com campos nulos");

		} else {

			List<Tecnologia_utilizada> tecnologias = daoTecnologiaUtilizada.listarTodos(Tecnologia_utilizada.class);

			int i = 0;

			for (i = 0; i <tecnologias.size(); i++) {

				if (tecnologias.get(i).getDescricao().equals(tecUtilizada.getDescricao())) {
					throw new BusinessException("Nome ja Utilizado");
				} else if (i == tecnologias.size() - 1) {

					daoTecnologiaUtilizada.inserir(tecUtilizada);
				}
			}

			if (tecnologias.size() == 0) {
				daoTecnologiaUtilizada.inserir(tecUtilizada);
			}
		}
		return null;
	}
	
	public String deveriaListarTecnologiaUtilizada() throws BusinessException {

		Generec_DAO<Tecnologia_utilizada> daoTecnologiaUtilizada = new Generec_DAO<Tecnologia_utilizada>();

		List<Tecnologia_utilizada> tecnologias = daoTecnologiaUtilizada.listarTodos(Tecnologia_utilizada.class);

		if (tecnologias.size() == 0) {
			throw new BusinessException("Nenhuma Tecnologia a ser listado");
		} else {
			for (Tecnologia_utilizada u : tecnologias) {
				System.out.println(u.getDescricao());
			}
		}

		return null;
	}
	public String deveriaAlterarTecnologiaUtilizada(String novoNome, String nome) throws BusinessException {

		Generec_DAO<Tecnologia_utilizada> daoTecnologiaUtilizada = new Generec_DAO<Tecnologia_utilizada>();

		List<Tecnologia_utilizada> tecnologias = daoTecnologiaUtilizada.listarTodos(Tecnologia_utilizada.class);

		for (int i = 0; i < tecnologias.size(); i++) {
			if (nome.equals(tecnologias.get(i).getDescricao())) {
				tecnologias.get(i).setDescricao(novoNome);

				daoTecnologiaUtilizada.alterar(tecnologias.get(i));

				break;
			}
		}

		return null;
	}
	
}
