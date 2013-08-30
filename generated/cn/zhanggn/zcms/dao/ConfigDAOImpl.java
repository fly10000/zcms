package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Config;

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
 * DAO to manage Config entities.
 * 
 */
@Repository("ConfigDAO")
@Transactional
public class ConfigDAOImpl extends AbstractJpaDao<Config> implements ConfigDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Config.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ConfigDAOImpl
	 *
	 */
	public ConfigDAOImpl() {
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
	 * JPQL Query - findConfigByVersion
	 *
	 */
	@Transactional
	public Set<Config> findConfigByVersion(String version) throws DataAccessException {

		return findConfigByVersion(version, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByVersion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByVersion(String version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByVersion", startResult, maxRows, version);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByKeywords
	 *
	 */
	@Transactional
	public Set<Config> findConfigByKeywords(String keywords) throws DataAccessException {

		return findConfigByKeywords(keywords, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByKeywords
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByKeywords(String keywords, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByKeywords", startResult, maxRows, keywords);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCeo
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCeo(String ceo) throws DataAccessException {

		return findConfigByCeo(ceo, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCeo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCeo(String ceo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCeo", startResult, maxRows, ceo);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByTemplate
	 *
	 */
	@Transactional
	public Set<Config> findConfigByTemplate(String template) throws DataAccessException {

		return findConfigByTemplate(template, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByTemplate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByTemplate(String template, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByTemplate", startResult, maxRows, template);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCompany
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCompany(String company) throws DataAccessException {

		return findConfigByCompany(company, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCompany
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCompany(String company, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCompany", startResult, maxRows, company);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCtp
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCtp(String ctp) throws DataAccessException {

		return findConfigByCtp(ctp, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCtp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCtp(String ctp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCtp", startResult, maxRows, ctp);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByStatisticsContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByStatisticsContaining(String statistics) throws DataAccessException {

		return findConfigByStatisticsContaining(statistics, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByStatisticsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByStatisticsContaining(String statistics, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByStatisticsContaining", startResult, maxRows, statistics);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCopyright
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCopyright(String copyright) throws DataAccessException {

		return findConfigByCopyright(copyright, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCopyright
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCopyright(String copyright, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCopyright", startResult, maxRows, copyright);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByIpContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByIpContaining(String ip) throws DataAccessException {

		return findConfigByIpContaining(ip, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByIpContaining(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByIpContaining", startResult, maxRows, ip);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByTelContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByTelContaining(String tel) throws DataAccessException {

		return findConfigByTelContaining(tel, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByTelContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByTelContaining", startResult, maxRows, tel);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByUuid
	 *
	 */
	@Transactional
	public Set<Config> findConfigByUuid(String uuid) throws DataAccessException {

		return findConfigByUuid(uuid, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByUuid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByUuid(String uuid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByUuid", startResult, maxRows, uuid);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByDescription
	 *
	 */
	@Transactional
	public Set<Config> findConfigByDescription(String description) throws DataAccessException {

		return findConfigByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByIp
	 *
	 */
	@Transactional
	public Set<Config> findConfigByIp(String ip) throws DataAccessException {

		return findConfigByIp(ip, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByIp(String ip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByIp", startResult, maxRows, ip);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByKeywordsContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByKeywordsContaining(String keywords) throws DataAccessException {

		return findConfigByKeywordsContaining(keywords, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByKeywordsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByKeywordsContaining(String keywords, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByKeywordsContaining", startResult, maxRows, keywords);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCeoContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCeoContaining(String ceo) throws DataAccessException {

		return findConfigByCeoContaining(ceo, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCeoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCeoContaining(String ceo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCeoContaining", startResult, maxRows, ceo);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByQqContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByQqContaining(String qq) throws DataAccessException {

		return findConfigByQqContaining(qq, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByQqContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByQqContaining(String qq, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByQqContaining", startResult, maxRows, qq);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCtpContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCtpContaining(String ctp) throws DataAccessException {

		return findConfigByCtpContaining(ctp, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCtpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCtpContaining(String ctp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCtpContaining", startResult, maxRows, ctp);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByIntroduce
	 *
	 */
	@Transactional
	public Set<Config> findConfigByIntroduce(String introduce) throws DataAccessException {

		return findConfigByIntroduce(introduce, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByIntroduce
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByIntroduce(String introduce, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByIntroduce", startResult, maxRows, introduce);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllConfigs
	 *
	 */
	@Transactional
	public Set<Config> findAllConfigs() throws DataAccessException {

		return findAllConfigs(-1, -1);
	}

	/**
	 * JPQL Query - findAllConfigs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findAllConfigs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllConfigs", startResult, maxRows);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByMobileContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByMobileContaining(String mobile) throws DataAccessException {

		return findConfigByMobileContaining(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByMobileContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByMobileContaining(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByMobileContaining", startResult, maxRows, mobile);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByEmail
	 *
	 */
	@Transactional
	public Set<Config> findConfigByEmail(String email) throws DataAccessException {

		return findConfigByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByName
	 *
	 */
	@Transactional
	public Set<Config> findConfigByName(String name) throws DataAccessException {

		return findConfigByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByName", startResult, maxRows, name);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByPrimaryKey
	 *
	 */
	@Transactional
	public Config findConfigByPrimaryKey(Integer id) throws DataAccessException {

		return findConfigByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByPrimaryKey
	 *
	 */

	@Transactional
	public Config findConfigByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findConfigByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Config) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findConfigByDomain
	 *
	 */
	@Transactional
	public Set<Config> findConfigByDomain(String domain) throws DataAccessException {

		return findConfigByDomain(domain, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByDomain
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByDomain(String domain, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByDomain", startResult, maxRows, domain);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByRecordCode
	 *
	 */
	@Transactional
	public Set<Config> findConfigByRecordCode(String recordCode) throws DataAccessException {

		return findConfigByRecordCode(recordCode, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByRecordCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByRecordCode(String recordCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByRecordCode", startResult, maxRows, recordCode);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByRecordCodeContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByRecordCodeContaining(String recordCode) throws DataAccessException {

		return findConfigByRecordCodeContaining(recordCode, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByRecordCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByRecordCodeContaining(String recordCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByRecordCodeContaining", startResult, maxRows, recordCode);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByQq
	 *
	 */
	@Transactional
	public Set<Config> findConfigByQq(String qq) throws DataAccessException {

		return findConfigByQq(qq, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByQq
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByQq(String qq, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByQq", startResult, maxRows, qq);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByMobile
	 *
	 */
	@Transactional
	public Set<Config> findConfigByMobile(String mobile) throws DataAccessException {

		return findConfigByMobile(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByMobile
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByMobile(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByMobile", startResult, maxRows, mobile);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCopyrightContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCopyrightContaining(String copyright) throws DataAccessException {

		return findConfigByCopyrightContaining(copyright, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCopyrightContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCopyrightContaining(String copyright, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCopyrightContaining", startResult, maxRows, copyright);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByEmailContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByEmailContaining(String email) throws DataAccessException {

		return findConfigByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByTemplateContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByTemplateContaining(String template) throws DataAccessException {

		return findConfigByTemplateContaining(template, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByTemplateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByTemplateContaining(String template, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByTemplateContaining", startResult, maxRows, template);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByFullNameContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByFullNameContaining(String fullName) throws DataAccessException {

		return findConfigByFullNameContaining(fullName, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByFullNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByFullNameContaining(String fullName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByFullNameContaining", startResult, maxRows, fullName);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigBySysDate
	 *
	 */
	@Transactional
	public Set<Config> findConfigBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findConfigBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findConfigBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByDescriptionContaining(String description) throws DataAccessException {

		return findConfigByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByIntroduceContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByIntroduceContaining(String introduce) throws DataAccessException {

		return findConfigByIntroduceContaining(introduce, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByIntroduceContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByIntroduceContaining(String introduce, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByIntroduceContaining", startResult, maxRows, introduce);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByUuidContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByUuidContaining(String uuid) throws DataAccessException {

		return findConfigByUuidContaining(uuid, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByUuidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByUuidContaining(String uuid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByUuidContaining", startResult, maxRows, uuid);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByFullName
	 *
	 */
	@Transactional
	public Set<Config> findConfigByFullName(String fullName) throws DataAccessException {

		return findConfigByFullName(fullName, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByFullName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByFullName(String fullName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByFullName", startResult, maxRows, fullName);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByTel
	 *
	 */
	@Transactional
	public Set<Config> findConfigByTel(String tel) throws DataAccessException {

		return findConfigByTel(tel, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByTel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByTel(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByTel", startResult, maxRows, tel);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByStatistics
	 *
	 */
	@Transactional
	public Set<Config> findConfigByStatistics(String statistics) throws DataAccessException {

		return findConfigByStatistics(statistics, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByStatistics
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByStatistics(String statistics, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByStatistics", startResult, maxRows, statistics);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByNameContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByNameContaining(String name) throws DataAccessException {

		return findConfigByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByCompanyContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByCompanyContaining(String company) throws DataAccessException {

		return findConfigByCompanyContaining(company, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByCompanyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByCompanyContaining(String company, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByCompanyContaining", startResult, maxRows, company);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByVersionContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByVersionContaining(String version) throws DataAccessException {

		return findConfigByVersionContaining(version, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByVersionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByVersionContaining(String version, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByVersionContaining", startResult, maxRows, version);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigByDomainContaining
	 *
	 */
	@Transactional
	public Set<Config> findConfigByDomainContaining(String domain) throws DataAccessException {

		return findConfigByDomainContaining(domain, -1, -1);
	}

	/**
	 * JPQL Query - findConfigByDomainContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Config> findConfigByDomainContaining(String domain, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigByDomainContaining", startResult, maxRows, domain);
		return new LinkedHashSet<Config>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigById
	 *
	 */
	@Transactional
	public Config findConfigById(Integer id) throws DataAccessException {

		return findConfigById(id, -1, -1);
	}

	/**
	 * JPQL Query - findConfigById
	 *
	 */

	@Transactional
	public Config findConfigById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findConfigById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Config) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Config entity) {
		return true;
	}
}
