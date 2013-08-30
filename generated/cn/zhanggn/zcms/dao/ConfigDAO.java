package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Config;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Config entities.
 * 
 */
public interface ConfigDAO extends JpaDao<Config> {

	/**
	 * JPQL Query - findConfigByVersion
	 *
	 */
	public Set<Config> findConfigByVersion(String version) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByVersion
	 *
	 */
	public Set<Config> findConfigByVersion(String version, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByKeywords
	 *
	 */
	public Set<Config> findConfigByKeywords(String keywords) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByKeywords
	 *
	 */
	public Set<Config> findConfigByKeywords(String keywords, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCeo
	 *
	 */
	public Set<Config> findConfigByCeo(String ceo) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCeo
	 *
	 */
	public Set<Config> findConfigByCeo(String ceo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTemplate
	 *
	 */
	public Set<Config> findConfigByTemplate(String template) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTemplate
	 *
	 */
	public Set<Config> findConfigByTemplate(String template, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCompany
	 *
	 */
	public Set<Config> findConfigByCompany(String company) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCompany
	 *
	 */
	public Set<Config> findConfigByCompany(String company, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCtp
	 *
	 */
	public Set<Config> findConfigByCtp(String ctp) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCtp
	 *
	 */
	public Set<Config> findConfigByCtp(String ctp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByStatisticsContaining
	 *
	 */
	public Set<Config> findConfigByStatisticsContaining(String statistics) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByStatisticsContaining
	 *
	 */
	public Set<Config> findConfigByStatisticsContaining(String statistics, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCopyright
	 *
	 */
	public Set<Config> findConfigByCopyright(String copyright) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCopyright
	 *
	 */
	public Set<Config> findConfigByCopyright(String copyright, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIpContaining
	 *
	 */
	public Set<Config> findConfigByIpContaining(String ip) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIpContaining
	 *
	 */
	public Set<Config> findConfigByIpContaining(String ip, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTelContaining
	 *
	 */
	public Set<Config> findConfigByTelContaining(String tel) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTelContaining
	 *
	 */
	public Set<Config> findConfigByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByUuid
	 *
	 */
	public Set<Config> findConfigByUuid(String uuid) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByUuid
	 *
	 */
	public Set<Config> findConfigByUuid(String uuid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDescription
	 *
	 */
	public Set<Config> findConfigByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDescription
	 *
	 */
	public Set<Config> findConfigByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIp
	 *
	 */
	public Set<Config> findConfigByIp(String ip_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIp
	 *
	 */
	public Set<Config> findConfigByIp(String ip_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByKeywordsContaining
	 *
	 */
	public Set<Config> findConfigByKeywordsContaining(String keywords_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByKeywordsContaining
	 *
	 */
	public Set<Config> findConfigByKeywordsContaining(String keywords_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCeoContaining
	 *
	 */
	public Set<Config> findConfigByCeoContaining(String ceo_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCeoContaining
	 *
	 */
	public Set<Config> findConfigByCeoContaining(String ceo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByQqContaining
	 *
	 */
	public Set<Config> findConfigByQqContaining(String qq) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByQqContaining
	 *
	 */
	public Set<Config> findConfigByQqContaining(String qq, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCtpContaining
	 *
	 */
	public Set<Config> findConfigByCtpContaining(String ctp_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCtpContaining
	 *
	 */
	public Set<Config> findConfigByCtpContaining(String ctp_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIntroduce
	 *
	 */
	public Set<Config> findConfigByIntroduce(String introduce) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIntroduce
	 *
	 */
	public Set<Config> findConfigByIntroduce(String introduce, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllConfigs
	 *
	 */
	public Set<Config> findAllConfigs() throws DataAccessException;

	/**
	 * JPQL Query - findAllConfigs
	 *
	 */
	public Set<Config> findAllConfigs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByMobileContaining
	 *
	 */
	public Set<Config> findConfigByMobileContaining(String mobile) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByMobileContaining
	 *
	 */
	public Set<Config> findConfigByMobileContaining(String mobile, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByEmail
	 *
	 */
	public Set<Config> findConfigByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByEmail
	 *
	 */
	public Set<Config> findConfigByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByName
	 *
	 */
	public Set<Config> findConfigByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByName
	 *
	 */
	public Set<Config> findConfigByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByPrimaryKey
	 *
	 */
	public Config findConfigByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByPrimaryKey
	 *
	 */
	public Config findConfigByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDomain
	 *
	 */
	public Set<Config> findConfigByDomain(String domain) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDomain
	 *
	 */
	public Set<Config> findConfigByDomain(String domain, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByRecordCode
	 *
	 */
	public Set<Config> findConfigByRecordCode(String recordCode) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByRecordCode
	 *
	 */
	public Set<Config> findConfigByRecordCode(String recordCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByRecordCodeContaining
	 *
	 */
	public Set<Config> findConfigByRecordCodeContaining(String recordCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByRecordCodeContaining
	 *
	 */
	public Set<Config> findConfigByRecordCodeContaining(String recordCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByQq
	 *
	 */
	public Set<Config> findConfigByQq(String qq_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByQq
	 *
	 */
	public Set<Config> findConfigByQq(String qq_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByMobile
	 *
	 */
	public Set<Config> findConfigByMobile(String mobile_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByMobile
	 *
	 */
	public Set<Config> findConfigByMobile(String mobile_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCopyrightContaining
	 *
	 */
	public Set<Config> findConfigByCopyrightContaining(String copyright_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCopyrightContaining
	 *
	 */
	public Set<Config> findConfigByCopyrightContaining(String copyright_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByEmailContaining
	 *
	 */
	public Set<Config> findConfigByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByEmailContaining
	 *
	 */
	public Set<Config> findConfigByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTemplateContaining
	 *
	 */
	public Set<Config> findConfigByTemplateContaining(String template_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTemplateContaining
	 *
	 */
	public Set<Config> findConfigByTemplateContaining(String template_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByFullNameContaining
	 *
	 */
	public Set<Config> findConfigByFullNameContaining(String fullName) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByFullNameContaining
	 *
	 */
	public Set<Config> findConfigByFullNameContaining(String fullName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigBySysDate
	 *
	 */
	public Set<Config> findConfigBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findConfigBySysDate
	 *
	 */
	public Set<Config> findConfigBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDescriptionContaining
	 *
	 */
	public Set<Config> findConfigByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDescriptionContaining
	 *
	 */
	public Set<Config> findConfigByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIntroduceContaining
	 *
	 */
	public Set<Config> findConfigByIntroduceContaining(String introduce_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByIntroduceContaining
	 *
	 */
	public Set<Config> findConfigByIntroduceContaining(String introduce_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByUuidContaining
	 *
	 */
	public Set<Config> findConfigByUuidContaining(String uuid_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByUuidContaining
	 *
	 */
	public Set<Config> findConfigByUuidContaining(String uuid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByFullName
	 *
	 */
	public Set<Config> findConfigByFullName(String fullName_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByFullName
	 *
	 */
	public Set<Config> findConfigByFullName(String fullName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTel
	 *
	 */
	public Set<Config> findConfigByTel(String tel_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByTel
	 *
	 */
	public Set<Config> findConfigByTel(String tel_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByStatistics
	 *
	 */
	public Set<Config> findConfigByStatistics(String statistics_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByStatistics
	 *
	 */
	public Set<Config> findConfigByStatistics(String statistics_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByNameContaining
	 *
	 */
	public Set<Config> findConfigByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByNameContaining
	 *
	 */
	public Set<Config> findConfigByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCompanyContaining
	 *
	 */
	public Set<Config> findConfigByCompanyContaining(String company_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByCompanyContaining
	 *
	 */
	public Set<Config> findConfigByCompanyContaining(String company_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByVersionContaining
	 *
	 */
	public Set<Config> findConfigByVersionContaining(String version_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByVersionContaining
	 *
	 */
	public Set<Config> findConfigByVersionContaining(String version_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDomainContaining
	 *
	 */
	public Set<Config> findConfigByDomainContaining(String domain_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigByDomainContaining
	 *
	 */
	public Set<Config> findConfigByDomainContaining(String domain_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigById
	 *
	 */
	public Config findConfigById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigById
	 *
	 */
	public Config findConfigById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}