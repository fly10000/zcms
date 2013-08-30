package cn.zhanggn.zcms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllChannels", query = "select myChannel from Channel myChannel"),
		@NamedQuery(name = "findChannelByCheckState", query = "select myChannel from Channel myChannel where myChannel.checkState = ?1"),
		@NamedQuery(name = "findChannelByDisplay", query = "select myChannel from Channel myChannel where myChannel.display = ?1"),
		@NamedQuery(name = "findChannelByDisplayContaining", query = "select myChannel from Channel myChannel where myChannel.display like ?1"),
		@NamedQuery(name = "findChannelByDisplayInIndex", query = "select myChannel from Channel myChannel where myChannel.displayInIndex = ?1"),
		@NamedQuery(name = "findChannelByDisplayInIndexContaining", query = "select myChannel from Channel myChannel where myChannel.displayInIndex like ?1"),
		@NamedQuery(name = "findChannelByFatherId", query = "select myChannel from Channel myChannel where myChannel.fatherId = ?1"),
		@NamedQuery(name = "findChannelById", query = "select myChannel from Channel myChannel where myChannel.id = ?1"),
		@NamedQuery(name = "findChannelByInfo", query = "select myChannel from Channel myChannel where myChannel.info = ?1"),
		@NamedQuery(name = "findChannelByName", query = "select myChannel from Channel myChannel where myChannel.name = ?1"),
		@NamedQuery(name = "findChannelByNameContaining", query = "select myChannel from Channel myChannel where myChannel.name like ?1"),
		@NamedQuery(name = "findChannelByPrimaryKey", query = "select myChannel from Channel myChannel where myChannel.id = ?1"),
		@NamedQuery(name = "findChannelByRankId", query = "select myChannel from Channel myChannel where myChannel.rankId = ?1"),
		@NamedQuery(name = "findChannelBySingle", query = "select myChannel from Channel myChannel where myChannel.single = ?1"),
		@NamedQuery(name = "findChannelBySingleContaining", query = "select myChannel from Channel myChannel where myChannel.single like ?1"),
		@NamedQuery(name = "findChannelBySysDate", query = "select myChannel from Channel myChannel where myChannel.sysDate = ?1"),
		@NamedQuery(name = "findChannelByVisitTotal", query = "select myChannel from Channel myChannel where myChannel.visitTotal = ?1") })
@Table(catalog = "zcms", name = "channel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Channel")
@XmlRootElement(namespace = "zcms3/cn/zhanggn/zcms/domain")
public class Channel implements Serializable {
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

	@Column(name = "display", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String display;
	/**
	 */

	@Column(name = "display_in_index", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String displayInIndex;
	/**
	 */

	@Column(name = "info")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String info;
	/**
	 */

	@Column(name = "name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "rank_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer rankId;
	/**
	 */

	@Column(name = "single", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String single;
	/**
	 */

	@Column(name = "visit_total")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer visitTotal;
	/**
	 */

	@Column(name = "father_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer fatherId;
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
	@OneToMany(mappedBy = "channel", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<cn.zhanggn.zcms.domain.Order> orders;

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
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 */
	public String getDisplay() {
		return this.display;
	}

	/**
	 */
	public void setDisplayInIndex(String displayInIndex) {
		this.displayInIndex = displayInIndex;
	}

	/**
	 */
	public String getDisplayInIndex() {
		return this.displayInIndex;
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
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	/**
	 */
	public Integer getRankId() {
		return this.rankId;
	}

	/**
	 */
	public void setSingle(String single) {
		this.single = single;
	}

	/**
	 */
	public String getSingle() {
		return this.single;
	}

	/**
	 */
	public void setVisitTotal(Integer visitTotal) {
		this.visitTotal = visitTotal;
	}

	/**
	 */
	public Integer getVisitTotal() {
		return this.visitTotal;
	}

	/**
	 */
	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}

	/**
	 */
	public Integer getFatherId() {
		return this.fatherId;
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
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	/**
	 */
	public Set<Order> getOrders() {
		if (orders == null) {
			orders = new java.util.LinkedHashSet<cn.zhanggn.zcms.domain.Order>();
		}
		return orders;
	}

	/**
	 */
	public Channel() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Channel that) {
		setId(that.getId());
		setDisplay(that.getDisplay());
		setDisplayInIndex(that.getDisplayInIndex());
		setInfo(that.getInfo());
		setName(that.getName());
		setRankId(that.getRankId());
		setSingle(that.getSingle());
		setVisitTotal(that.getVisitTotal());
		setFatherId(that.getFatherId());
		setCheckState(that.getCheckState());
		setSysDate(that.getSysDate());
		setOrders(new java.util.LinkedHashSet<cn.zhanggn.zcms.domain.Order>(that.getOrders()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("display=[").append(display).append("] ");
		buffer.append("displayInIndex=[").append(displayInIndex).append("] ");
		buffer.append("info=[").append(info).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("rankId=[").append(rankId).append("] ");
		buffer.append("single=[").append(single).append("] ");
		buffer.append("visitTotal=[").append(visitTotal).append("] ");
		buffer.append("fatherId=[").append(fatherId).append("] ");
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
		if (!(obj instanceof Channel))
			return false;
		Channel equalCheck = (Channel) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
