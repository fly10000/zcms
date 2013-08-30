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
		@NamedQuery(name = "findAllLogs", query = "select myLog from Log myLog"),
		@NamedQuery(name = "findLogById", query = "select myLog from Log myLog where myLog.id = ?1"),
		@NamedQuery(name = "findLogByIp", query = "select myLog from Log myLog where myLog.ip = ?1"),
		@NamedQuery(name = "findLogByIpContaining", query = "select myLog from Log myLog where myLog.ip like ?1"),
		@NamedQuery(name = "findLogByLogResult", query = "select myLog from Log myLog where myLog.logResult = ?1"),
		@NamedQuery(name = "findLogByLogResultContaining", query = "select myLog from Log myLog where myLog.logResult like ?1"),
		@NamedQuery(name = "findLogByLogType", query = "select myLog from Log myLog where myLog.logType = ?1"),
		@NamedQuery(name = "findLogByLogTypeContaining", query = "select myLog from Log myLog where myLog.logType like ?1"),
		@NamedQuery(name = "findLogByPrimaryKey", query = "select myLog from Log myLog where myLog.id = ?1"),
		@NamedQuery(name = "findLogBySysDate", query = "select myLog from Log myLog where myLog.sysDate = ?1"),
		@NamedQuery(name = "findLogByTime", query = "select myLog from Log myLog where myLog.time = ?1"),
		@NamedQuery(name = "findLogByUserName", query = "select myLog from Log myLog where myLog.userName = ?1"),
		@NamedQuery(name = "findLogByUserNameContaining", query = "select myLog from Log myLog where myLog.userName like ?1") })
@Table(catalog = "zcms", name = "log")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Log")
public class Log implements Serializable {
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

	@Column(name = "ip", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ip;
	/**
	 */

	@Column(name = "log_result", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String logResult;
	/**
	 */

	@Column(name = "log_type", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String logType;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar time;
	/**
	 */

	@Column(name = "user_name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String userName;
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
	public void setLogResult(String logResult) {
		this.logResult = logResult;
	}

	/**
	 */
	public String getLogResult() {
		return this.logResult;
	}

	/**
	 */
	public void setLogType(String logType) {
		this.logType = logType;
	}

	/**
	 */
	public String getLogType() {
		return this.logType;
	}

	/**
	 */
	public void setTime(Calendar time) {
		this.time = time;
	}

	/**
	 */
	public Calendar getTime() {
		return this.time;
	}

	/**
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 */
	public String getUserName() {
		return this.userName;
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
	public Log() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Log that) {
		setId(that.getId());
		setIp(that.getIp());
		setLogResult(that.getLogResult());
		setLogType(that.getLogType());
		setTime(that.getTime());
		setUserName(that.getUserName());
		setSysDate(that.getSysDate());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("ip=[").append(ip).append("] ");
		buffer.append("logResult=[").append(logResult).append("] ");
		buffer.append("logType=[").append(logType).append("] ");
		buffer.append("time=[").append(time).append("] ");
		buffer.append("userName=[").append(userName).append("] ");
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
		if (!(obj instanceof Log))
			return false;
		Log equalCheck = (Log) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
