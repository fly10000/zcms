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
		@NamedQuery(name = "findAllUsers", query = "select myUser from User myUser"),
		@NamedQuery(name = "findUserByAddress", query = "select myUser from User myUser where myUser.address = ?1"),
		@NamedQuery(name = "findUserByAddressContaining", query = "select myUser from User myUser where myUser.address like ?1"),
		@NamedQuery(name = "findUserByBirthday", query = "select myUser from User myUser where myUser.birthday = ?1"),
		@NamedQuery(name = "findUserByBirthdayAfter", query = "select myUser from User myUser where myUser.birthday > ?1"),
		@NamedQuery(name = "findUserByBirthdayBefore", query = "select myUser from User myUser where myUser.birthday < ?1"),
		@NamedQuery(name = "findUserByCheckState", query = "select myUser from User myUser where myUser.checkState = ?1"),
		@NamedQuery(name = "findUserByCreateTime", query = "select myUser from User myUser where myUser.createTime = ?1"),
		@NamedQuery(name = "findUserByEmail", query = "select myUser from User myUser where myUser.email = ?1"),
		@NamedQuery(name = "findUserByEmailContaining", query = "select myUser from User myUser where myUser.email like ?1"),
		@NamedQuery(name = "findUserByGender", query = "select myUser from User myUser where myUser.gender = ?1"),
		@NamedQuery(name = "findUserByGroupId", query = "select myUser from User myUser where myUser.groupId = ?1"),
		@NamedQuery(name = "findUserById", query = "select myUser from User myUser where myUser.id = ?1"),
		@NamedQuery(name = "findUserByInfo", query = "select myUser from User myUser where myUser.info = ?1"),
		@NamedQuery(name = "findUserByJ2cmsPassWord", query = "select myUser from User myUser where myUser.j2cmsPassWord = ?1"),
		@NamedQuery(name = "findUserByJ2cmsPassWordContaining", query = "select myUser from User myUser where myUser.j2cmsPassWord like ?1"),
		@NamedQuery(name = "findUserByJ2cmsUserName", query = "select myUser from User myUser where myUser.j2cmsUserName = ?1"),
		@NamedQuery(name = "findUserByJ2cmsUserNameContaining", query = "select myUser from User myUser where myUser.j2cmsUserName like ?1"),
		@NamedQuery(name = "findUserByLastLoginIp", query = "select myUser from User myUser where myUser.lastLoginIp = ?1"),
		@NamedQuery(name = "findUserByLastLoginIpContaining", query = "select myUser from User myUser where myUser.lastLoginIp like ?1"),
		@NamedQuery(name = "findUserByLastLoginTime", query = "select myUser from User myUser where myUser.lastLoginTime = ?1"),
		@NamedQuery(name = "findUserByLoginNumber", query = "select myUser from User myUser where myUser.loginNumber = ?1"),
		@NamedQuery(name = "findUserByPrimaryKey", query = "select myUser from User myUser where myUser.id = ?1"),
		@NamedQuery(name = "findUserByQq", query = "select myUser from User myUser where myUser.qq = ?1"),
		@NamedQuery(name = "findUserByQqContaining", query = "select myUser from User myUser where myUser.qq like ?1"),
		@NamedQuery(name = "findUserByRealName", query = "select myUser from User myUser where myUser.realName = ?1"),
		@NamedQuery(name = "findUserByRealNameContaining", query = "select myUser from User myUser where myUser.realName like ?1"),
		@NamedQuery(name = "findUserBySysDate", query = "select myUser from User myUser where myUser.sysDate = ?1"),
		@NamedQuery(name = "findUserByTelephone", query = "select myUser from User myUser where myUser.telephone = ?1"),
		@NamedQuery(name = "findUserByTelephoneContaining", query = "select myUser from User myUser where myUser.telephone like ?1"),
		@NamedQuery(name = "findUserByZipCode", query = "select myUser from User myUser where myUser.zipCode = ?1"),
		@NamedQuery(name = "findUserByZipCodeContaining", query = "select myUser from User myUser where myUser.zipCode like ?1") })
@Table(catalog = "zcms", name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "User")
public class User implements Serializable {
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

	@Column(name = "QQ", length = 12)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String qq;
	/**
	 */

	@Column(name = "address", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar birthday;
	/**
	 */

	@Column(name = "check_state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer checkState;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createTime")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar createTime;
	/**
	 */

	@Column(name = "email", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "gender")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer gender;
	/**
	 */

	@Column(name = "info")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String info;
	/**
	 */

	@Column(name = "last_login_ip", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastLoginIp;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login_time")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar lastLoginTime;
	/**
	 */

	@Column(name = "login_number")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer loginNumber;
	/**
	 */

	@Column(name = "j2cms_pass_word", length = 32)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String j2cmsPassWord;
	/**
	 */

	@Column(name = "real_name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String realName;
	/**
	 */

	@Column(name = "telephone", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String telephone;
	/**
	 */

	@Column(name = "j2cms_user_name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String j2cmsUserName;
	/**
	 */

	@Column(name = "zipCode", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zipCode;
	/**
	 */

	@Column(name = "group_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer groupId;
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
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	/**
	 */
	public Calendar getBirthday() {
		return this.birthday;
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
	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}

	/**
	 */
	public Calendar getCreateTime() {
		return this.createTime;
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
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 */
	public Integer getGender() {
		return this.gender;
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
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 */
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	/**
	 */
	public void setLastLoginTime(Calendar lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 */
	public Calendar getLastLoginTime() {
		return this.lastLoginTime;
	}

	/**
	 */
	public void setLoginNumber(Integer loginNumber) {
		this.loginNumber = loginNumber;
	}

	/**
	 */
	public Integer getLoginNumber() {
		return this.loginNumber;
	}

	/**
	 */
	public void setJ2cmsPassWord(String j2cmsPassWord) {
		this.j2cmsPassWord = j2cmsPassWord;
	}

	/**
	 */
	public String getJ2cmsPassWord() {
		return this.j2cmsPassWord;
	}

	/**
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 */
	public String getRealName() {
		return this.realName;
	}

	/**
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 */
	public void setJ2cmsUserName(String j2cmsUserName) {
		this.j2cmsUserName = j2cmsUserName;
	}

	/**
	 */
	public String getJ2cmsUserName() {
		return this.j2cmsUserName;
	}

	/**
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	/**
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 */
	public Integer getGroupId() {
		return this.groupId;
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
	public User() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(User that) {
		setId(that.getId());
		setQq(that.getQq());
		setAddress(that.getAddress());
		setBirthday(that.getBirthday());
		setCheckState(that.getCheckState());
		setCreateTime(that.getCreateTime());
		setEmail(that.getEmail());
		setGender(that.getGender());
		setInfo(that.getInfo());
		setLastLoginIp(that.getLastLoginIp());
		setLastLoginTime(that.getLastLoginTime());
		setLoginNumber(that.getLoginNumber());
		setJ2cmsPassWord(that.getJ2cmsPassWord());
		setRealName(that.getRealName());
		setTelephone(that.getTelephone());
		setJ2cmsUserName(that.getJ2cmsUserName());
		setZipCode(that.getZipCode());
		setGroupId(that.getGroupId());
		setSysDate(that.getSysDate());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("qq=[").append(qq).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("birthday=[").append(birthday).append("] ");
		buffer.append("checkState=[").append(checkState).append("] ");
		buffer.append("createTime=[").append(createTime).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("gender=[").append(gender).append("] ");
		buffer.append("info=[").append(info).append("] ");
		buffer.append("lastLoginIp=[").append(lastLoginIp).append("] ");
		buffer.append("lastLoginTime=[").append(lastLoginTime).append("] ");
		buffer.append("loginNumber=[").append(loginNumber).append("] ");
		buffer.append("j2cmsPassWord=[").append(j2cmsPassWord).append("] ");
		buffer.append("realName=[").append(realName).append("] ");
		buffer.append("telephone=[").append(telephone).append("] ");
		buffer.append("j2cmsUserName=[").append(j2cmsUserName).append("] ");
		buffer.append("zipCode=[").append(zipCode).append("] ");
		buffer.append("groupId=[").append(groupId).append("] ");
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
		if (!(obj instanceof User))
			return false;
		User equalCheck = (User) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
