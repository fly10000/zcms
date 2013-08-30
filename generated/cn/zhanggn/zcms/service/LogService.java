package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Log;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Log entities
 * 
 */
public interface LogService {

	/**
	 * Return all Log entity
	 * 
	 */
	public List<Log> findAllLogs(Integer startResult, Integer maxRows);

	/**
	 */
	public Log findLogByPrimaryKey(Integer id);

	/**
	 * Load an existing Log entity
	 * 
	 */
	public Set<Log> loadLogs();

	/**
	 * Save an existing Log entity
	 * 
	 */
	public void saveLog(Log log);

	/**
	 * Delete an existing Log entity
	 * 
	 */
	public void deleteLog(Log log_1);

	/**
	 * Return a count of all Log entity
	 * 
	 */
	public Integer countLogs();
}