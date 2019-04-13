package Projeto_integrador_3_DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Generec_DAO <T> implements DAO<T> {
	@Override
	public void inserir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listarTodos(Class<T> c) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from " + c.getName());
		List<T> result = q.getResultList();

		em.close();
		return result;
	}

	@Override
	public void excluir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	}

}
