package dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import dao.BaseDao;

public abstract class BaseDaoImpl<E, N extends Number> implements BaseDao<E, N> {
	private Class<E> entityClass;

	public BaseDaoImpl(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	@PersistenceContext(unitName = "main_unit")
	protected EntityManager entityManager;
	@Resource
	UserTransaction trx;

	@SuppressWarnings("unchecked")
	public E findById(N id) {
		try {
			E result = null;
			trx.begin();
			result = (E) entityManager
					.createQuery(
							"select e from " + entityClass.getSimpleName()
									+ " e where e.id = :id")
					.setParameter("id", id).getSingleResult();
			trx.commit();
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	public void save(E entity) {
		try {
			trx.begin();
			entityManager.persist(entity);
			entityManager.flush();
			trx.commit();
		} catch (Exception e) {

		}
	}

	public void remove(E entity) {
		try {
			trx.begin();
			entityManager.remove(entityManager.merge(entity));
			trx.commit();
		} catch (Exception e) {

		}
	}

	public E update(E entity) {
		try {
			E result = null;
			trx.begin();
			result = entityManager.merge(entity);
			trx.commit();
			return result;
		} catch (Exception e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		try {
			List<E> result = null;
			trx.begin();
			result = entityManager.createQuery(
					"from " + entityClass.getSimpleName()).getResultList();
			trx.commit();
			return result;
		} catch (Exception e) {
			return null;
		}

	}
}