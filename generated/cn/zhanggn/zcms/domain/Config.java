package cn.zhanggn.zcms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllConfigs", query = "select myConfig from Config myConfig"),
		@NamedQuery(name = "findConfigByCeo", query = "select myConfig from Config myConfig where myConfig.ceo = ?1"),
		@NamedQuery(name = "findConfigByCeoContaining", query = "select myConfig from Config myConfig where myConfig.ceo like ?1"),
		@NamedQuery(name = "findConfigByCompany", query = "select myConfig from Config myConfig where myConfig.company = ?1"),
		@NamedQuery(name = "findConfigByCompanyContaining", query = "select myConfig from Config myConfig where myConfig.company like ?1"),
		@NamedQuery(name = "findConfigByCopyright", query = "select myConfig from Config myConfig where myConfig.copyright = ?1"),
		@NamedQuery(name = "findConfigByCopyrightContaining", query = "select myConfig from Config myConfig where myConfig.copyright like ?1"),
		@NamedQuery(name = "findConfigByCtp", query = "select myConfig from Config myConfig where myConfig.ctp = ?1"),
		@NamedQuery(name = "findConfigByCtpContaining", query = "select myConfig from Config myConfig where myConfig.ctp like ?1"),
		@NamedQuery(name = "findConfigByDescription", query = "select myConfig from Config myConfig where myConfig.description = ?1"),
		@NamedQuery(name = "findConfigByDescriptionContaining", query = "select myConfig from Config myConfig where myConfig.description like ?1"),
		@NamedQuery(name = "findConfigByDomain", query = "select myConfig from Config myConfig where myConfig.domain = ?1"),
		@NamedQuery(name = "findConfigByDomainContaining", query = "select myConfig from Config myConfig where myConfig.domain like ?1"),
		@NamedQuery(name = "findConfigByEmail", query = "select myConfig from Config myConfig where myConfig.email = ?1"),
		@NamedQuery(name = "findConfigByEmailContaining", query = "select myConfig from Config myConfig where myConfig.email like ?1"),
		@NamedQuery(name = "findConfigByFullName", query = "select myConfig from Config myConfig where myConfig.fullName = ?1"),
		@NamedQuery(name = "findConfigByFullNameContaining", query = "select myConfig from Config myConfig where myConfig.fullName like ?1"),
		@NamedQuery(name = "findConfigById", query = "select myConfig from Config myConfig where myConfig.id = ?1"),
		@NamedQuery(name = "findConfigByIntroduce", query = "select myConfig from Config myConfig where myConfig.introduce = ?1"),
		@NamedQuery(name = "findConfigByIntroduceContaining", query = "select myConfig from Config myConfig where myConfig.introduce like ?1"),
		@NamedQuery(name = "findConfigByIp", query = "select myConfig from Config myConfig where myConfig.ip = ?1"),
		@NamedQuery(name = "findConfigByIpContaining", query = "select myConfig from Config myConfig where myConfig.ip like ?1"),
		@NamedQuery(name = "findConfigByKeywords", query = "select myConfig from Config myConfig where myConfig.keywords = ?1"),
		@NamedQuery(name = "findConfigByKeywordsContaining", query = "select myConfig from Config myConfig where myConfig.keywords like ?1"),
		@NamedQuery(name = "findConfigByMobile", query = "select myConfig from Config myConfig where myConfig.mobile = ?1"),
		@NamedQuery(name = "findConfigByMobileContaining", query = "select myConfig from Config myConfig where myConfig.mobile like ?1"),
		@NamedQuery(name = "findConfigByName", query = "select myConfig from Config myConfig where myConfig.name = ?1"),
		@NamedQuery(name = "findConfigByNameContaining", query = "select myConfig from Config myConfig where myConfig.name like ?1"),
		@NamedQuery(name = "findConfigByPrimaryKey", query = "select myConfig from Config myConfig where myConfig.id = ?1"),
		@NamedQuery(name = "findConfigByQq", query = "select myConfig from Config myConfig where myConfig.qq = ?1"),
		@NamedQuery(name = "findConfigByQqContaining", query = "select myConfig from Config myConfig where myConfig.qq like ?1"),
		@NamedQuery(name = "findConfigByRecordCode", query = "select myConfig from Config myConfig where myConfig.recordCode = ?1"),
		@NamedQuery(name = "findConfigByRecordCodeContaining", query = "select myConfig from Config myConfig where myConfig.recordCode like ?1"),
		@NamedQuery(name = "findConfigByStatistics", query = "select myConfig from Config myConfig where myConfig.statistics = ?1"),
		@NamedQuery(name = "findConfigByStatisticsContaining", query = "select myConfig from Config myConfig where myConfig.statistics like ?1"),
		@NamedQuery(name = "findConfigBySysDate", query = "select myConfig from Config myConfig where myConfig.sysDate = ?1"),
		@NamedQuery(name = "findConfigByTel", query = "select myConfig from Config myConfig where myConfig.tel = ?1"),
		@NamedQuery(name = "findConfigByTelContaining", query = "select myConfig from Config myConfig where myConfig.tel like ?1"),
		@NamedQuery(name = "findConfigByTemplate", query = "select myConfig from Config myConfig where myConfig.template = ?1"),
		@NamedQuery(name = "findConfigByTemplateContaining", query = "select myConfig from Config myConfig where myConfig.template like ?1"),
		@NamedQuery(name = "findConfigByUuid", query = "select myConfig from Config myConfig where myConfig.uuid = ?1"),
		@NamedQuery(name = "findConfigByUuidContaining", query = "select myConfig from Config myConfig where myConfig.uuid like ?1"),
		@NamedQuery(name = "findConfigByVersion", query = "select myConfig from Config myConfig where myConfig.version = ?1"),
		@NamedQuery(name = "findConfigByVersionContaining", query = "select myConfig from Config myConfig where myConfig.version like ?1") })
@Table(catalog = "zcms", name = "config")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Config")
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "version", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String version;
	/**
	 */

	@Column(name = "company", length = 40)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String company;
	/**
	 */

	@Column(name = "copyright", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String copyright;
	/**
	 */

	@Column(name = "domain", length = 30)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String domain;
	/**
	 */

	@Column(name = "email", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "record_code", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String recordCode;
	/**
	 */

	@Column(name = "template", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String template;
	/**
	 */

	@Column(name = "full_name", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String fullName;
	/**
	 */

	@Column(name = "QQ", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String qq;
	/**
	 */

	@Column(name = "ceo", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ceo;
	/**
	 */

	@Column(name = "description", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;
	/**
	 */

	@Column(name = "introduce", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String introduce;
	/**
	 */

	@Column(name = "keywords", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String keywords;
	/**
	 */

	@Column(name = "mobile", length = 13)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobile;
	/**
	 */

	@Column(name = "statistics", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String statistics;
	/**
	 */

	@Column(name = "tel", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String tel;
	/**
	 */

	@Column(name = "ip", length = 30)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ip;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar sysDate;
	/**
	 */

	@Column(name = "uuid", length = 36)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String uuid;
	/**
	 */

	@Column(name = "ctp", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ctp;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 */
	public String getCompany() {
		return this.company;
	}

	/**
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 */
	public String getCopyright() {
		return this.copyright;
	}

	/**
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 */
	public String getDomain() {
		return this.domain;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}

	/**
	 */
	public String getRecordCode() {
		return this.recordCode;
	}

	/**
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 */
	public String getTemplate() {
		return this.template;
	}

	/**
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 */
	public String getFullName() {
		return this.fullName;
	}

	/**
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 */
	public String getQq() {
		return this.qq;
	}

	/**
	 */
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	/**
	 */
	public String getCeo() {
		return this.ceo;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 */
	public String getIntroduce() {
		return this.introduce;
	}

	/**
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 */
	public String getKeywords() {
		return this.keywords;
	}

	/**
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 */
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	/**
	 */
	public String getStatistics() {
		return this.statistics;
	}

	/**
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 */
	public String getTel() {
		return this.tel;
	}

	/**
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 */
	public String getIp() {
		return this.ip;
	}

	/**
	 */
	public void setSysDate(Calendar sysDate) {
		this.sysDate = sysDate;
	}

	/**
	 */
	public Calendar getSysDate() {
		return this.sysDate;
	}

	/**
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 */
	public String getUuid() {
		return this.uuid;
	}

	/**
	 */
	public void setCtp(String ctp) {
		this.ctp = ctp;
	}

	/**
	 */
	public String getCtp() {
		return this.ctp;
	}

	/**
	 */
	public Config() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Config that) {
		setId(that.getId());
		setVersion(that.getVersion());
		setCompany(that.getCompany());
		setCopyright(that.getCopyright());
		setDomain(that.getDomain());
		setEmail(that.getEmail());
		setName(that.getName());
		setRecordCode(that.getRecordCode());
		setTemplate(that.getTemplate());
		setFullName(that.getFullName());
		setQq(that.getQq());
		setCeo(that.getCeo());
		setDescription(that.getDescription());
		setIntroduce(that.getIntroduce());
		setKeywords(that.getKeywords());
		setMobile(that.getMobile());
		setStatistics(that.getStatistics());
		setTel(that.getTel());
		setIp(that.getIp());
		setSysDate(that.getSysDate());
		setUuid(that.getUuid());
		setCtp(that.getCtp());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("version=[").append(version).append("] ");
		buffer.append("company=[").append(company).append("] ");
		buffer.append("copyright=[").append(copyright).append("] ");
		buffer.append("domain=[").append(domain).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("recordCode=[").append(recordCode).append("] ");
		buffer.append("template=[").append(template).append("] ");
		buffer.append("fullName=[").append(fullName).append("] ");
		buffer.append("qq=[").append(qq).append("] ");
		buffer.append("ceo=[").append(ceo).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("introduce=[").append(introduce).append("] ");
		buffer.append("keywords=[").append(keywords).append("] ");
		buffer.append("mobile=[").append(mobile).append("] ");
		buffer.append("statistics=[").append(statistics).append("] ");
		buffer.append("tel=[").append(tel).append("] ");
		buffer.append("ip=[").append(ip).append("] ");
		buffer.append("sysDate=[").append(sysDate).append("] ");
		buffer.append("uuid=[").append(uuid).append("] ");
		buffer.append("ctp=[").append(ctp).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Config))
			return false;
		Config equalCheck = (Config) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
