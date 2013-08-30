package cn.zhanggn.zcms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
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
		@NamedQuery(name = "findAllOrders", query = "select myOrder from Order myOrder"),
		@NamedQuery(name = "findOrderByAddress", query = "select myOrder from Order myOrder where myOrder.address = ?1"),
		@NamedQuery(name = "findOrderByAddressContaining", query = "select myOrder from Order myOrder where myOrder.address like ?1"),
		@NamedQuery(name = "findOrderByDanwei", query = "select myOrder from Order myOrder where myOrder.danwei = ?1"),
		@NamedQuery(name = "findOrderByDanweiContaining", query = "select myOrder from Order myOrder where myOrder.danwei like ?1"),
		@NamedQuery(name = "findOrderById", query = "select myOrder from Order myOrder where myOrder.id = ?1"),
		@NamedQuery(name = "findOrderByName", query = "select myOrder from Order myOrder where myOrder.name = ?1"),
		@NamedQuery(name = "findOrderByNameContaining", query = "select myOrder from Order myOrder where myOrder.name like ?1"),
		@NamedQuery(name = "findOrderByNum", query = "select myOrder from Order myOrder where myOrder.num = ?1"),
		@NamedQuery(name = "findOrderByNumContaining", query = "select myOrder from Order myOrder where myOrder.num like ?1"),
		@NamedQuery(name = "findOrderByOther", query = "select myOrder from Order myOrder where myOrder.other = ?1"),
		@NamedQuery(name = "findOrderByOtherContaining", query = "select myOrder from Order myOrder where myOrder.other like ?1"),
		@NamedQuery(name = "findOrderByPrimaryKey", query = "select myOrder from Order myOrder where myOrder.id = ?1"),
		@NamedQuery(name = "findOrderByReleaseDate", query = "select myOrder from Order myOrder where myOrder.releaseDate = ?1"),
		@NamedQuery(name = "findOrderByReleaseDateContaining", query = "select myOrder from Order myOrder where myOrder.releaseDate like ?1"),
		@NamedQuery(name = "findOrderBySysDate", query = "select myOrder from Order myOrder where myOrder.sysDate = ?1"),
		@NamedQuery(name = "findOrderByTel", query = "select myOrder from Order myOrder where myOrder.tel = ?1"),
		@NamedQuery(name = "findOrderByTelContaining", query = "select myOrder from Order myOrder where myOrder.tel like ?1"),
		@NamedQuery(name = "findOrderByTime", query = "select myOrder from Order myOrder where myOrder.time = ?1"),
		@NamedQuery(name = "findOrderByTimeContaining", query = "select myOrder from Order myOrder where myOrder.time like ?1") })
@Table(catalog = "zcms", name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Order")
public class Order implements Serializable {
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

	@Column(name = "address", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "danwei", length = 2)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String danwei;
	/**
	 */

	@Column(name = "name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "num", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String num;
	/**
	 */

	@Column(name = "other", length = 500)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String other;
	/**
	 */

	@Column(name = "release_date", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String releaseDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar sysDate;
	/**
	 */

	@Column(name = "tel", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String tel;
	/**
	 */

	@Column(name = "time", length = 2)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String time;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "channel_id", referencedColumnName = "id") })
	@XmlTransient
	Channel channel;

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
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}

	/**
	 */
	public String getDanwei() {
		return this.danwei;
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
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 */
	public String getNum() {
		return this.num;
	}

	/**
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/**
	 */
	public String getOther() {
		return this.other;
	}

	/**
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 */
	public String getReleaseDate() {
		return this.releaseDate;
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
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	/**
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 */
	public Order() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Order that) {
		setId(that.getId());
		setAddress(that.getAddress());
		setDanwei(that.getDanwei());
		setName(that.getName());
		setNum(that.getNum());
		setOther(that.getOther());
		setReleaseDate(that.getReleaseDate());
		setSysDate(that.getSysDate());
		setTel(that.getTel());
		setTime(that.getTime());
		setChannel(that.getChannel());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("danwei=[").append(danwei).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("num=[").append(num).append("] ");
		buffer.append("other=[").append(other).append("] ");
		buffer.append("releaseDate=[").append(releaseDate).append("] ");
		buffer.append("sysDate=[").append(sysDate).append("] ");
		buffer.append("tel=[").append(tel).append("] ");
		buffer.append("time=[").append(time).append("] ");

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
		if (!(obj instanceof Order))
			return false;
		Order equalCheck = (Order) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
