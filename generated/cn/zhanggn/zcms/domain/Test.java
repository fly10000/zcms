package cn.zhanggn.zcms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTests", query = "select myTest from Test myTest"),
		@NamedQuery(name = "findTestByContent", query = "select myTest from Test myTest where myTest.content = ?1"),
		@NamedQuery(name = "findTestByContentContaining", query = "select myTest from Test myTest where myTest.content like ?1"),
		@NamedQuery(name = "findTestById", query = "select myTest from Test myTest where myTest.id = ?1"),
		@NamedQuery(name = "findTestByName", query = "select myTest from Test myTest where myTest.name = ?1"),
		@NamedQuery(name = "findTestByNameContaining", query = "select myTest from Test myTest where myTest.name like ?1"),
		@NamedQuery(name = "findTestByPrimaryKey", query = "select myTest from Test myTest where myTest.id = ?1") })
@Table(catalog = "zcms", name = "test")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Test")
public class Test implements Serializable {
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

	@Column(name = "name", length = 30)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "content", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String content;

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
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 */
	public Test() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Test that) {
		setId(that.getId());
		setName(that.getName());
		setContent(that.getContent());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("content=[").append(content).append("] ");

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
		if (!(obj instanceof Test))
			return false;
		Test equalCheck = (Test) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
