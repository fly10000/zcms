package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.LogDAO;

import cn.zhanggn.zcms.domain.Log;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Log entities
 * 
 */

@Service("LogService")
@Transactional
public class LogServiceImpl implements LogService {

	/**
	 * DAO injected by Spring that manages Log entities
	 * 
	 */
	@Autowired
	private LogDAO logDAO;

	/**
	 * Instantiates a new LogServiceImpl.
	 *
	 */
	public LogServiceImpl() {
	}

	/**
	 * Return all Log entity
	 * 
	 */
	@Transactional
	public List<Log> findAllLogs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Log>(logDAO.findAllLogs(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Log findLogByPrimaryKey(Integer id) {
		return logDAO.findLogByPrimaryKey(id);
	}

	/**
	 * Load an existing Log entity
	 * 
	 */
	@Transactional
	public Set<Log> loadLogs() {
		return logDAO.findAllLogs();
	}

	/**
	 * Save an existing Log entity
	 * 
	 */
	@Transactional
	public void saveLog(Log log) {
		Log existingLog = logDAO.findLogByPrimaryKey(log.getId());

		if (existingLog != null) {
			if (existingLog != log) {
				existingLog.setId(log.getId());
				existingLog.setIp(log.getIp());
				existingLog.setLogResult(log.getLogResult());
				existingLog.setLogType(log.getLogType());
				existingLog.setTime(log.getTime());
				existingLog.setUserName(log.getUserName());
				existingLog.setSysDate(log.getSysDate());
			}
			log = logDAO.store(existingLog);
		} else {
			log = logDAO.store(log);
		}
		logDAO.flush();
	}

	/**
	 * Delete an existing Log entity
	 * 
	 */
	@Transactional
	public void deleteLog(Log log) {
		logDAO.remove(log);
		logDAO.flush();
	}

	/**
	 * Return a count of all Log entity
	 * 
	 */
	@Transactional
	public Integer countLogs() {
		return ((Long) logDAO.createQuerySingleResult("select count(o) from Log o").getSingleResult()).intValue();
	}
}
