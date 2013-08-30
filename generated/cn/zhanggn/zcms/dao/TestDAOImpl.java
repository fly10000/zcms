package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Test entities.
 * 
 */
@Repository("TestDAO")
@Transactional
public class TestDAOImpl extends AbstractJpaDao<Test> implements TestDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Test.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TestDAOImpl
	 *
	 */
	public TestDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAllTests
	 *
	 */
	@Transactional
	public Set<Test> findAllTests() throws DataAccessException {

		return findAllTests(-1, -1);
	}

	/**
	 * JPQL Query - findAllTests
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Test> findAllTests(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTests", startResult, maxRows);
		return new LinkedHashSet<Test>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestById
	 *
	 */
	@Transactional
	public Test findTestById(Integer id) throws DataAccessException {

		return findTestById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTestById
	 *
	 */

	@Transactional
	public Test findTestById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTestById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Test) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTestByContentContaining
	 *
	 */
	@Transactional
	public Set<Test> findTestByContentContaining(String content) throws DataAccessException {

		return findTestByContentContaining(content, -1, -1);
	}

	/**
	 * JPQL Query - findTestByContentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Test> findTestByContentContaining(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestByContentContaining", startResult, maxRows, content);
		return new LinkedHashSet<Test>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestByNameContaining
	 *
	 */
	@Transactional
	public Set<Test> findTestByNameContaining(String name) throws DataAccessException {

		return findTestByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTestByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Test> findTestByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Test>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestByPrimaryKey
	 *
	 */
	@Transactional
	public Test findTestByPrimaryKey(Integer id) throws DataAccessException {

		return findTestByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTestByPrimaryKey
	 *
	 */

	@Transactional
	public Test findTestByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTestByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Test) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTestByName
	 *
	 */
	@Transactional
	public Set<Test> findTestByName(String name) throws DataAccessException {

		return findTestByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTestByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Test> findTestByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestByName", startResult, maxRows, name);
		return new LinkedHashSet<Test>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestByContent
	 *
	 */
	@Transactional
	public Set<Test> findTestByContent(String content) throws DataAccessException {

		return findTestByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findTestByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Test> findTestByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestByContent", startResult, maxRows, content);
		return new LinkedHashSet<Test>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Test entity) {
		return true;
	}
}
