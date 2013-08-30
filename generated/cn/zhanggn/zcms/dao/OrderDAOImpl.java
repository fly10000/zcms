package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Order;

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
 * DAO to manage Order entities.
 * 
 */
@Repository("OrderDAO")
@Transactional
public class OrderDAOImpl extends AbstractJpaDao<Order> implements OrderDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Order.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderDAOImpl
	 *
	 */
	public OrderDAOImpl() {
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
	 * JPQL Query - findOrderByOtherContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOtherContaining(String other) throws DataAccessException {

		return findOrderByOtherContaining(other, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOtherContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOtherContaining(String other, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOtherContaining", startResult, maxRows, other);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByTelContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByTelContaining(String tel) throws DataAccessException {

		return findOrderByTelContaining(tel, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByTelContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByTelContaining", startResult, maxRows, tel);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderBySysDate
	 *
	 */
	@Transactional
	public Set<Order> findOrderBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findOrderBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByDanweiContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDanweiContaining(String danwei) throws DataAccessException {

		return findOrderByDanweiContaining(danwei, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDanweiContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDanweiContaining(String danwei, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDanweiContaining", startResult, maxRows, danwei);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByReleaseDate
	 *
	 */
	@Transactional
	public Set<Order> findOrderByReleaseDate(String releaseDate) throws DataAccessException {

		return findOrderByReleaseDate(releaseDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByReleaseDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByReleaseDate(String releaseDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByReleaseDate", startResult, maxRows, releaseDate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByTel
	 *
	 */
	@Transactional
	public Set<Order> findOrderByTel(String tel) throws DataAccessException {

		return findOrderByTel(tel, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByTel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByTel(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByTel", startResult, maxRows, tel);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByReleaseDateContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByReleaseDateContaining(String releaseDate) throws DataAccessException {

		return findOrderByReleaseDateContaining(releaseDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByReleaseDateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByReleaseDateContaining(String releaseDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByReleaseDateContaining", startResult, maxRows, releaseDate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOther
	 *
	 */
	@Transactional
	public Set<Order> findOrderByOther(String other) throws DataAccessException {

		return findOrderByOther(other, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOther
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOther(String other, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOther", startResult, maxRows, other);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	@Transactional
	public Order findOrderById(Integer id) throws DataAccessException {

		return findOrderById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderById
	 *
	 */

	@Transactional
	public Order findOrderById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNameContaining(String name) throws DataAccessException {

		return findOrderByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer id) throws DataAccessException {

		return findOrderByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */

	@Transactional
	public Order findOrderByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByDanwei
	 *
	 */
	@Transactional
	public Set<Order> findOrderByDanwei(String danwei) throws DataAccessException {

		return findOrderByDanwei(danwei, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByDanwei
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByDanwei(String danwei, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByDanwei", startResult, maxRows, danwei);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByTimeContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByTimeContaining(String time) throws DataAccessException {

		return findOrderByTimeContaining(time, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByTimeContaining(String time, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByTimeContaining", startResult, maxRows, time);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	@Transactional
	public Set<Order> findAllOrders() throws DataAccessException {

		return findAllOrders(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrders
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrders", startResult, maxRows);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	@Transactional
	public Set<Order> findOrderByName(String name) throws DataAccessException {

		return findOrderByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByName", startResult, maxRows, name);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByNumContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNumContaining(String num) throws DataAccessException {

		return findOrderByNumContaining(num, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNumContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNumContaining(String num, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNumContaining", startResult, maxRows, num);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException {

		return findOrderByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByTime
	 *
	 */
	@Transactional
	public Set<Order> findOrderByTime(String time) throws DataAccessException {

		return findOrderByTime(time, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByTime(String time, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByTime", startResult, maxRows, time);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByNum
	 *
	 */
	@Transactional
	public Set<Order> findOrderByNum(String num) throws DataAccessException {

		return findOrderByNum(num, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByNum
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByNum(String num, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByNum", startResult, maxRows, num);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	@Transactional
	public Set<Order> findOrderByAddress(String address) throws DataAccessException {

		return findOrderByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Order entity) {
		return true;
	}
}
