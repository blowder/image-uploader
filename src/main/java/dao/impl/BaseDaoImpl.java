package dao.impl;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.BaseDao;

@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class BaseDaoImpl<E, N extends Number> implements BaseDao<E, N> {
	private Class<E> entityClass;

	public BaseDaoImpl(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	@PersistenceContext(unitName = "main_unit")
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public E findById(N id) {
		return (E) entityManager
				.createQuery(
						"select e from " + entityClass.getSimpleName()
								+ " e where e.id = :id").setParameter("id", id)
				.getSingleResult();
	}

	public void save(E entity) {
		entityManager.persist(entity);
		entityManager.flush();
	}

	public void remove(E entity) {
		entityManager.remove(entityManager.merge(entity));
	}

	public E update(E entity) {
		return entityManager.merge(entity);
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return entityManager.createQuery("from " + entityClass.getSimpleName())
				.getResultList();
	}
}