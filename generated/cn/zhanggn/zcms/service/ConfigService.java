package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Config;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Config entities
 * 
 */
public interface ConfigService {

	/**
	 * Delete an existing Config entity
	 * 
	 */
	public void deleteConfig(Config config);

	/**
	 * Return all Config entity
	 * 
	 */
	public List<Config> findAllConfigs(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Config entity
	 * 
	 */
	public void saveConfig(Config config_1);

	/**
	 */
	public Config findConfigByPrimaryKey(Integer id);

	/**
	 * Return a count of all Config entity
	 * 
	 */
	public Integer countConfigs();

	/**
	 * Load an existing Config entity
	 * 
	 */
	public Set<Config> loadConfigs();
}