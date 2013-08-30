package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Channel;

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
 * DAO to manage Channel entities.
 * 
 */
@Repository("ChannelDAO")
@Transactional
public class ChannelDAOImpl extends AbstractJpaDao<Channel> implements
		ChannelDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Channel.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ChannelDAOImpl
	 *
	 */
	public ChannelDAOImpl() {
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
	 * JPQL Query - findChannelBySingleContaining
	 *
	 */
	@Transactional
	public Set<Channel> findChannelBySingleContaining(String single) throws DataAccessException {

		return findChannelBySingleContaining(single, -1, -1);
	}

	/**
	 * JPQL Query - findChannelBySingleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelBySingleContaining(String single, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelBySingleContaining", startResult, maxRows, single);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByFatherId
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByFatherId(Integer fatherId) throws DataAccessException {

		return findChannelByFatherId(fatherId, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByFatherId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByFatherId(Integer fatherId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByFatherId", startResult, maxRows, fatherId);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByName
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByName(String name) throws DataAccessException {

		return findChannelByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByName", startResult, maxRows, name);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelBySingle
	 *
	 */
	@Transactional
	public Set<Channel> findChannelBySingle(String single) throws DataAccessException {

		return findChannelBySingle(single, -1, -1);
	}

	/**
	 * JPQL Query - findChannelBySingle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelBySingle(String single, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelBySingle", startResult, maxRows, single);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByNameContaining
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByNameContaining(String name) throws DataAccessException {

		return findChannelByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByVisitTotal
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByVisitTotal(Integer visitTotal) throws DataAccessException {

		return findChannelByVisitTotal(visitTotal, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByVisitTotal
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByVisitTotal(Integer visitTotal, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByVisitTotal", startResult, maxRows, visitTotal);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByCheckState
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByCheckState(Integer checkState) throws DataAccessException {

		return findChannelByCheckState(checkState, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByCheckState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByCheckState", startResult, maxRows, checkState);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByInfo
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByInfo(String info) throws DataAccessException {

		return findChannelByInfo(info, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByInfo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByInfo(String info, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByInfo", startResult, maxRows, info);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByDisplay
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByDisplay(String display) throws DataAccessException {

		return findChannelByDisplay(display, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByDisplay
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByDisplay(String display, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByDisplay", startResult, maxRows, display);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelById
	 *
	 */
	@Transactional
	public Channel findChannelById(Integer id) throws DataAccessException {

		return findChannelById(id, -1, -1);
	}

	/**
	 * JPQL Query - findChannelById
	 *
	 */

	@Transactional
	public Channel findChannelById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findChannelById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Channel) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findChannelByDisplayInIndex
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByDisplayInIndex(String displayInIndex) throws DataAccessException {

		return findChannelByDisplayInIndex(displayInIndex, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByDisplayInIndex
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByDisplayInIndex(String displayInIndex, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByDisplayInIndex", startResult, maxRows, displayInIndex);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllChannels
	 *
	 */
	@Transactional
	public Set<Channel> findAllChannels() throws DataAccessException {

		return findAllChannels(-1, -1);
	}

	/**
	 * JPQL Query - findAllChannels
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findAllChannels(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllChannels", startResult, maxRows);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByDisplayContaining
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByDisplayContaining(String display) throws DataAccessException {

		return findChannelByDisplayContaining(display, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByDisplayContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByDisplayContaining(String display, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByDisplayContaining", startResult, maxRows, display);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByDisplayInIndexContaining
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByDisplayInIndexContaining(String displayInIndex) throws DataAccessException {

		return findChannelByDisplayInIndexContaining(displayInIndex, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByDisplayInIndexContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByDisplayInIndexContaining(String displayInIndex, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByDisplayInIndexContaining", startResult, maxRows, displayInIndex);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByPrimaryKey
	 *
	 */
	@Transactional
	public Channel findChannelByPrimaryKey(Integer id) throws DataAccessException {

		return findChannelByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByPrimaryKey
	 *
	 */

	@Transactional
	public Channel findChannelByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findChannelByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Channel) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findChannelBySysDate
	 *
	 */
	@Transactional
	public Set<Channel> findChannelBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findChannelBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findChannelBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * JPQL Query - findChannelByRankId
	 *
	 */
	@Transactional
	public Set<Channel> findChannelByRankId(Integer rankId) throws DataAccessException {

		return findChannelByRankId(rankId, -1, -1);
	}

	/**
	 * JPQL Query - findChannelByRankId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Channel> findChannelByRankId(Integer rankId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findChannelByRankId", startResult, maxRows, rankId);
		return new LinkedHashSet<Channel>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Channel entity) {
		return true;
	}
}
