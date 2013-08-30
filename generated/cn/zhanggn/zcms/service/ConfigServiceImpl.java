package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.ConfigDAO;

import cn.zhanggn.zcms.domain.Config;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Config entities
 * 
 */

@Service("ConfigService")
@Transactional
public class ConfigServiceImpl implements ConfigService {

	/**
	 * DAO injected by Spring that manages Config entities
	 * 
	 */
	@Autowired
	private ConfigDAO configDAO;

	/**
	 * Instantiates a new ConfigServiceImpl.
	 *
	 */
	public ConfigServiceImpl() {
	}

	/**
	 * Delete an existing Config entity
	 * 
	 */
	@Transactional
	public void deleteConfig(Config config) {
		configDAO.remove(config);
		configDAO.flush();
	}

	/**
	 * Return all Config entity
	 * 
	 */
	@Transactional
	public List<Config> findAllConfigs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Config>(configDAO.findAllConfigs(startResult, maxRows));
	}

	/**
	 * Save an existing Config entity
	 * 
	 */
	@Transactional
	public void saveConfig(Config config) {
		Config existingConfig = configDAO.findConfigByPrimaryKey(config.getId());

		if (existingConfig != null) {
			if (existingConfig != config) {
				existingConfig.setId(config.getId());
				existingConfig.setVersion(config.getVersion());
				existingConfig.setCompany(config.getCompany());
				existingConfig.setCopyright(config.getCopyright());
				existingConfig.setDomain(config.getDomain());
				existingConfig.setEmail(config.getEmail());
				existingConfig.setName(config.getName());
				existingConfig.setRecordCode(config.getRecordCode());
				existingConfig.setTemplate(config.getTemplate());
				existingConfig.setFullName(config.getFullName());
				existingConfig.setQq(config.getQq());
				existingConfig.setCeo(config.getCeo());
				existingConfig.setDescription(config.getDescription());
				existingConfig.setIntroduce(config.getIntroduce());
				existingConfig.setKeywords(config.getKeywords());
				existingConfig.setMobile(config.getMobile());
				existingConfig.setStatistics(config.getStatistics());
				existingConfig.setTel(config.getTel());
				existingConfig.setIp(config.getIp());
				existingConfig.setSysDate(config.getSysDate());
				existingConfig.setUuid(config.getUuid());
				existingConfig.setCtp(config.getCtp());
			}
			config = configDAO.store(existingConfig);
		} else {
			config = configDAO.store(config);
		}
		configDAO.flush();
	}

	/**
	 */
	@Transactional
	public Config findConfigByPrimaryKey(Integer id) {
		return configDAO.findConfigByPrimaryKey(id);
	}

	/**
	 * Return a count of all Config entity
	 * 
	 */
	@Transactional
	public Integer countConfigs() {
		return ((Long) configDAO.createQuerySingleResult("select count(o) from Config o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Config entity
	 * 
	 */
	@Transactional
	public Set<Config> loadConfigs() {
		return configDAO.findAllConfigs();
	}
}
