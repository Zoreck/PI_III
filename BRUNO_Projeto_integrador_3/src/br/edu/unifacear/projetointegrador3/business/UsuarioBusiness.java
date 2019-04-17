package br.edu.unifacear.projetointegrador3.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Projeto_integrador_3_entidade.Usuario;
import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;

public class UsuarioBusiness {

	public String deveriaSalvarUsuario(Usuario usuario) throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		if ((usuario.getNome().equals(null)) || (usuario.getLogin().equals(null))
				|| (usuario.getSenha().equals(null))) {

			throw new BusinessException("Impossível inserir usuario com campos nulos");

		} else {

			List<Usuario> usuarios = daoUsuario.listarTodos(Usuario.class);

			int i = 0;

			for (i = 0; i < usuarios.size(); i++) {

				if (usuarios.get(i).getCpf().equals(usuario.getCpf())) {
					throw new BusinessException("CPF já cadastrado");
				} else if (i == usuarios.size() - 1) {

					daoUsuario.inserir(usuario);
				}
			}

			if (usuarios.size() == 0) {
				daoUsuario.inserir(usuario);
			}
		}
		return null;
	}

	public String deveriaListarUsuario() throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		List<Usuario> usuarios = daoUsuario.listarTodos(Usuario.class);

		if (usuarios.size() == 0) {
			throw new BusinessException("Nenhum usuario a ser listado");
		} else {
			for (Usuario u : usuarios) {
				System.out.println(u.getNome());
			}
		}

		return null;
	}

	public String deveriaAlterarUsuario(String cpf, String nome) throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		List<Usuario> usuarios = daoUsuario.listarTodos(Usuario.class);

		for (int i = 0; i<usuarios.size(); i++) {
			if (cpf.equals(usuarios.get(i).getCpf())) {
				usuarios.get(i).setNome(nome);
				
				daoUsuario.alterar(usuarios.get(i));	
				
				break;
			}
		}

		return null;
	}

	public String deveriaExcluirUsuario(String cpf) throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		List<Usuario> usuarios = daoUsuario.listarTodos(Usuario.class);

		for (int i = 0; i<usuarios.size(); i++) {
			if (cpf.equals(usuarios.get(i).getCpf())) {
				
				//daoUsuario.excluir(usuarios.get(i));	
				System.out.println("deveria excluir");
				break;
			}
		}

		return null;
	}
	
}
