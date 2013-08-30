package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Log;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Log entities.
 * 
 */
public interface LogDAO extends JpaDao<Log> {

	/**
	 * JPQL Query - findAllLogs
	 *
	 */
	public Set<Log> findAllLogs() throws DataAccessException;

	/**
	 * JPQL Query - findAllLogs
	 *
	 */
	public Set<Log> findAllLogs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByTime
	 *
	 */
	public Set<Log> findLogByTime(java.util.Calendar time) throws DataAccessException;

	/**
	 * JPQL Query - findLogByTime
	 *
	 */
	public Set<Log> findLogByTime(Calendar time, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogTypeContaining
	 *
	 */
	public Set<Log> findLogByLogTypeContaining(String logType) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogTypeContaining
	 *
	 */
	public Set<Log> findLogByLogTypeContaining(String logType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByIp
	 *
	 */
	public Set<Log> findLogByIp(String ip) throws DataAccessException;

	/**
	 * JPQL Query - findLogByIp
	 *
	 */
	public Set<Log> findLogByIp(String ip, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByUserName
	 *
	 */
	public Set<Log> findLogByUserName(String userName) throws DataAccessException;

	/**
	 * JPQL Query - findLogByUserName
	 *
	 */
	public Set<Log> findLogByUserName(String userName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogBySysDate
	 *
	 */
	public Set<Log> findLogBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findLogBySysDate
	 *
	 */
	public Set<Log> findLogBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogResult
	 *
	 */
	public Set<Log> findLogByLogResult(String logResult) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogResult
	 *
	 */
	public Set<Log> findLogByLogResult(String logResult, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByPrimaryKey
	 *
	 */
	public Log findLogByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findLogByPrimaryKey
	 *
	 */
	public Log findLogByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogById
	 *
	 */
	public Log findLogById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findLogById
	 *
	 */
	public Log findLogById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogResultContaining
	 *
	 */
	public Set<Log> findLogByLogResultContaining(String logResult_1) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogResultContaining
	 *
	 */
	public Set<Log> findLogByLogResultContaining(String logResult_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogType
	 *
	 */
	public Set<Log> findLogByLogType(String logType_1) throws DataAccessException;

	/**
	 * JPQL Query - findLogByLogType
	 *
	 */
	public Set<Log> findLogByLogType(String logType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByUserNameContaining
	 *
	 */
	public Set<Log> findLogByUserNameContaining(String userName_1) throws DataAccessException;

	/**
	 * JPQL Query - findLogByUserNameContaining
	 *
	 */
	public Set<Log> findLogByUserNameContaining(String userName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLogByIpContaining
	 *
	 */
	public Set<Log> findLogByIpContaining(String ip_1) throws DataAccessException;

	/**
	 * JPQL Query - findLogByIpContaining
	 *
	 */
	public Set<Log> findLogByIpContaining(String ip_1, int startResult, int maxRows) throws DataAccessException;

}