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
		@NamedQuery(name = "findAllGroups", query = "select myGroup from Group myGroup"),
		@NamedQuery(name = "findGroupByCheckState", query = "select myGroup from Group myGroup where myGroup.checkState = ?1"),
		@NamedQuery(name = "findGroupById", query = "select myGroup from Group myGroup where myGroup.id = ?1"),
		@NamedQuery(name = "findGroupByInfo", query = "select myGroup from Group myGroup where myGroup.info = ?1"),
		@NamedQuery(name = "findGroupByInfoContaining", query = "select myGroup from Group myGroup where myGroup.info like ?1"),
		@NamedQuery(name = "findGroupByManageChannel", query = "select myGroup from Group myGroup where myGroup.manageChannel = ?1"),
		@NamedQuery(name = "findGroupByManageChannelContaining", query = "select myGroup from Group myGroup where myGroup.manageChannel like ?1"),
		@NamedQuery(name = "findGroupByManageComment", query = "select myGroup from Group myGroup where myGroup.manageComment = ?1"),
		@NamedQuery(name = "findGroupByManageCommentContaining", query = "select myGroup from Group myGroup where myGroup.manageComment like ?1"),
		@NamedQuery(name = "findGroupByManageConfig", query = "select myGroup from Group myGroup where myGroup.manageConfig = ?1"),
		@NamedQuery(name = "findGroupByManageConfigContaining", query = "select myGroup from Group myGroup where myGroup.manageConfig like ?1"),
		@NamedQuery(name = "findGroupByManageGroup", query = "select myGroup from Group myGroup where myGroup.manageGroup = ?1"),
		@NamedQuery(name = "findGroupByManageGroupContaining", query = "select myGroup from Group myGroup where myGroup.manageGroup like ?1"),
		@NamedQuery(name = "findGroupByManagerArticle", query = "select myGroup from Group myGroup where myGroup.managerArticle = ?1"),
		@NamedQuery(name = "findGroupByManagerArticleContaining", query = "select myGroup from Group myGroup where myGroup.managerArticle like ?1"),
		@NamedQuery(name = "findGroupByManagerLog", query = "select myGroup from Group myGroup where myGroup.managerLog = ?1"),
		@NamedQuery(name = "findGroupByManagerLogContaining", query = "select myGroup from Group myGroup where myGroup.managerLog like ?1"),
		@NamedQuery(name = "findGroupByManagerUser", query = "select myGroup from Group myGroup where myGroup.managerUser = ?1"),
		@NamedQuery(name = "findGroupByManagerUserContaining", query = "select myGroup from Group myGroup where myGroup.managerUser like ?1"),
		@NamedQuery(name = "findGroupByName", query = "select myGroup from Group myGroup where myGroup.name = ?1"),
		@NamedQuery(name = "findGroupByNameContaining", query = "select myGroup from Group myGroup where myGroup.name like ?1"),
		@NamedQuery(name = "findGroupByPrimaryKey", query = "select myGroup from Group myGroup where myGroup.id = ?1"),
		@NamedQuery(name = "findGroupBySysDate", query = "select myGroup from Group myGroup where myGroup.sysDate = ?1") })
@Table(catalog = "zcms", name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Group")
public class Group implements Serializable {
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

	@Column(name = "info")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String info;
	/**
	 */

	@Column(name = "manager_article", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String managerArticle;
	/**
	 */

	@Column(name = "manage_channel", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String manageChannel;
	/**
	 */

	@Column(name = "manage_comment", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String manageComment;
	/**
	 */

	@Column(name = "manage_config", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String manageConfig;
	/**
	 */

	@Column(name = "manage_group", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String manageGroup;
	/**
	 */

	@Column(name = "manager_log", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String managerLog;
	/**
	 */

	@Column(name = "manager_user", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String managerUser;
	/**
	 */

	@Column(name = "name", length = 16)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "check_state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer checkState;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar sysDate;

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
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 */
	public String getInfo() {
		return this.info;
	}

	/**
	 */
	public void setManagerArticle(String managerArticle) {
		this.managerArticle = managerArticle;
	}

	/**
	 */
	public String getManagerArticle() {
		return this.managerArticle;
	}

	/**
	 */
	public void setManageChannel(String manageChannel) {
		this.manageChannel = manageChannel;
	}

	/**
	 */
	public String getManageChannel() {
		return this.manageChannel;
	}

	/**
	 */
	public void setManageComment(String manageComment) {
		this.manageComment = manageComment;
	}

	/**
	 */
	public String getManageComment() {
		return this.manageComment;
	}

	/**
	 */
	public void setManageConfig(String manageConfig) {
		this.manageConfig = manageConfig;
	}

	/**
	 */
	public String getManageConfig() {
		return this.manageConfig;
	}

	/**
	 */
	public void setManageGroup(String manageGroup) {
		this.manageGroup = manageGroup;
	}

	/**
	 */
	public String getManageGroup() {
		return this.manageGroup;
	}

	/**
	 */
	public void setManagerLog(String managerLog) {
		this.managerLog = managerLog;
	}

	/**
	 */
	public String getManagerLog() {
		return this.managerLog;
	}

	/**
	 */
	public void setManagerUser(String managerUser) {
		this.managerUser = managerUser;
	}

	/**
	 */
	public String getManagerUser() {
		return this.managerUser;
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
	public void setCheckState(Integer checkState) {
		this.checkState = checkState;
	}

	/**
	 */
	public Integer getCheckState() {
		return this.checkState;
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
	public Group() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Group that) {
		setId(that.getId());
		setInfo(that.getInfo());
		setManagerArticle(that.getManagerArticle());
		setManageChannel(that.getManageChannel());
		setManageComment(that.getManageComment());
		setManageConfig(that.getManageConfig());
		setManageGroup(that.getManageGroup());
		setManagerLog(that.getManagerLog());
		setManagerUser(that.getManagerUser());
		setName(that.getName());
		setCheckState(that.getCheckState());
		setSysDate(that.getSysDate());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("info=[").append(info).append("] ");
		buffer.append("managerArticle=[").append(managerArticle).append("] ");
		buffer.append("manageChannel=[").append(manageChannel).append("] ");
		buffer.append("manageComment=[").append(manageComment).append("] ");
		buffer.append("manageConfig=[").append(manageConfig).append("] ");
		buffer.append("manageGroup=[").append(manageGroup).append("] ");
		buffer.append("managerLog=[").append(managerLog).append("] ");
		buffer.append("managerUser=[").append(managerUser).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("checkState=[").append(checkState).append("] ");
		buffer.append("sysDate=[").append(sysDate).append("] ");

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
		if (!(obj instanceof Group))
			return false;
		Group equalCheck = (Group) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
