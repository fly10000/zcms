package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Log;

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
 * DAO to manage Log entities.
 * 
 */
@Repository("LogDAO")
@Transactional
public class LogDAOImpl extends AbstractJpaDao<Log> implements LogDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Log.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new LogDAOImpl
	 *
	 */
	public LogDAOImpl() {
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
	 * JPQL Query - findAllLogs
	 *
	 */
	@Transactional
	public Set<Log> findAllLogs() throws DataAccessException {

		return findAllLogs(-1, -1);
	}

	/**
	 * JPQL Query - findAllLogs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findAllLogs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllLogs", startResult, maxRows);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByTime
	 *
	 */
	@Transactional
	public Set<Log> findLogByTime(java.util.Calendar time) throws DataAccessException {

		return findLogByTime(time, -1, -1);
	}

	/**
	 * JPQL Query - findLogByTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByTime(java.util.Calendar time, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByTime", startResult, maxRows, time);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByLogTypeContaining
	 *
	 */
	@Transactional
	public Set<Log> findLogByLogTypeContaining(String logType) throws DataAccessException {

		return findLogByLogTypeContaining(logType, -1, -1);
	}

	/**
	 * JPQL Query - findLogByLogTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByLogTypeContaining(String logType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByLogTypeContaining", startResult, maxRows, logType);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByIp
	 *
	 */
	@Transactional
	public Set<Log> findLogByIp(String ip) throws DataAccessException {

		return findLogByIp(ip, -1, -1);
	}

	/**
	 * JPQL Query - findLogByIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByIp(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByIp", startResult, maxRows, ip);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByUserName
	 *
	 */
	@Transactional
	public Set<Log> findLogByUserName(String userName) throws DataAccessException {

		return findLogByUserName(userName, -1, -1);
	}

	/**
	 * JPQL Query - findLogByUserName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByUserName(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByUserName", startResult, maxRows, userName);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogBySysDate
	 *
	 */
	@Transactional
	public Set<Log> findLogBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findLogBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findLogBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByLogResult
	 *
	 */
	@Transactional
	public Set<Log> findLogByLogResult(String logResult) throws DataAccessException {

		return findLogByLogResult(logResult, -1, -1);
	}

	/**
	 * JPQL Query - findLogByLogResult
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByLogResult(String logResult, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByLogResult", startResult, maxRows, logResult);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByPrimaryKey
	 *
	 */
	@Transactional
	public Log findLogByPrimaryKey(Integer id) throws DataAccessException {

		return findLogByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findLogByPrimaryKey
	 *
	 */

	@Transactional
	public Log findLogByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLogByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Log) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findLogById
	 *
	 */
	@Transactional
	public Log findLogById(Integer id) throws DataAccessException {

		return findLogById(id, -1, -1);
	}

	/**
	 * JPQL Query - findLogById
	 *
	 */

	@Transactional
	public Log findLogById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLogById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Log) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findLogByLogResultContaining
	 *
	 */
	@Transactional
	public Set<Log> findLogByLogResultContaining(String logResult) throws DataAccessException {

		return findLogByLogResultContaining(logResult, -1, -1);
	}

	/**
	 * JPQL Query - findLogByLogResultContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByLogResultContaining(String logResult, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByLogResultContaining", startResult, maxRows, logResult);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByLogType
	 *
	 */
	@Transactional
	public Set<Log> findLogByLogType(String logType) throws DataAccessException {

		return findLogByLogType(logType, -1, -1);
	}

	/**
	 * JPQL Query - findLogByLogType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByLogType(String logType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByLogType", startResult, maxRows, logType);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByUserNameContaining
	 *
	 */
	@Transactional
	public Set<Log> findLogByUserNameContaining(String userName) throws DataAccessException {

		return findLogByUserNameContaining(userName, -1, -1);
	}

	/**
	 * JPQL Query - findLogByUserNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByUserNameContaining(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByUserNameContaining", startResult, maxRows, userName);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * JPQL Query - findLogByIpContaining
	 *
	 */
	@Transactional
	public Set<Log> findLogByIpContaining(String ip) throws DataAccessException {

		return findLogByIpContaining(ip, -1, -1);
	}

	/**
	 * JPQL Query - findLogByIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Log> findLogByIpContaining(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLogByIpContaining", startResult, maxRows, ip);
		return new LinkedHashSet<Log>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Log entity) {
		return true;
	}
}
