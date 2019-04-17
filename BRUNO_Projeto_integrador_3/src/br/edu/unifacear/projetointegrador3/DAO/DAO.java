package br.edu.unifacear.projetointegrador3.DAO;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface DAO<T> {
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("projetointegrador3");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listarTodos(Class<T> c);

	public void excluir(T t);

	public List<T> listarWhere(Class<T> c, String where,
			Map<String,Object> argumentos);
}
