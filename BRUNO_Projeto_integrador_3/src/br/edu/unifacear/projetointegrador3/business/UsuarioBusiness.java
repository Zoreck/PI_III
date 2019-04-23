package br.edu.unifacear.projetointegrador3.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.edu.unifacear.projetointegrador3.DAO.Generec_DAO;
import br.edu.unifacear.projetointegrador3.entity.Usuario;

public class UsuarioBusiness {

	public String SalvarUsuario(Usuario usuario) throws BusinessException {

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

	public String ListarUsuario() throws BusinessException {

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

	public String AlterarUsuario(String cpf, String nome) throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		List<Usuario> usuarios = daoUsuario.listarTodos(Usuario.class);

		for (int i = 0; i < usuarios.size(); i++) {
			if (cpf.equals(usuarios.get(i).getCpf())) {
				usuarios.get(i).setNome(nome);

				daoUsuario.alterar(usuarios.get(i));

				break;
			}
		}

		return null;
	}

	
	  public String ExcluirUsuario(String cpf) throws BusinessException {
	  
	  Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();
	  
	  String where; 
	  List<Usuario> usuarios = new ArrayList<Usuario>();
	  
	  //String where = " t.dataDevolucao <= :agora ";
	  where = " where t.cpf = :cpf";
	  
	  HashMap<String,Object> argumentos = new HashMap<String,Object>();
	  argumentos.put("cpf", cpf);
	  
	  
	  usuarios = daoUsuario.listarWhere(Usuario.class, where, argumentos); 
	  for (int i= 0; i<usuarios.size(); i++) { 
		  if (cpf.equals(usuarios.get(i).getCpf())) {
	  
			  daoUsuario.excluir(usuarios.get(i));
			  System.out.println("deveria excluir");
			  break; 
		  }
		  
	  }
	  
	  return null; 
	 }
	

	/*public String excluiruser(String cpf) throws BusinessException {

		Generec_DAO<Usuario> daoUsuario = new Generec_DAO<Usuario>();

		List<Usuario> list = daoUsuario.listarTodos(Usuario.class);
		list = daoUsuario.listarTodos(Usuario.class);

		System.out.println(list.size());
		System.out.println("meu pinto"+cpf);
		
		for(Usuario u : list) {
			System.out.println(u.getCpf());
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("cpf: "+ cpf + "BUCETA "+ list.get(i).getCpf());
			if (cpf.equals(list.get(i).getCpf())) {
				Integer id = list.get(i).getIdUsuario();
				System.out.println();
				daoUsuario.excluir(list.get(i));
				break;
			} else if (i == list.size() - 1) {
				throw new BusinessException("FILHA DA PUTA");
			}
		}

		return null;
	}*/

}
