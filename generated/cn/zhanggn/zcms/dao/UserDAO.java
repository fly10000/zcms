package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.User;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage User entities.
 * 
 */
public interface UserDAO extends JpaDao<User> {

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */
	public Set<User> findUserByBirthday(java.util.Calendar birthday) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */
	public Set<User> findUserByBirthday(Calendar birthday, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByQqContaining
	 *
	 */
	public Set<User> findUserByQqContaining(String qq) throws DataAccessException;

	/**
	 * JPQL Query - findUserByQqContaining
	 *
	 */
	public Set<User> findUserByQqContaining(String qq, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	public Set<User> findUserByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	public Set<User> findUserByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByTelephoneContaining
	 *
	 */
	public Set<User> findUserByTelephoneContaining(String telephone) throws DataAccessException;

	/**
	 * JPQL Query - findUserByTelephoneContaining
	 *
	 */
	public Set<User> findUserByTelephoneContaining(String telephone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginIp
	 *
	 */
	public Set<User> findUserByLastLoginIp(String lastLoginIp) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginIp
	 *
	 */
	public Set<User> findUserByLastLoginIp(String lastLoginIp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsPassWord
	 *
	 */
	public Set<User> findUserByJ2cmsPassWord(String j2cmsPassWord) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsPassWord
	 *
	 */
	public Set<User> findUserByJ2cmsPassWord(String j2cmsPassWord, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByZipCode
	 *
	 */
	public Set<User> findUserByZipCode(String zipCode) throws DataAccessException;

	/**
	 * JPQL Query - findUserByZipCode
	 *
	 */
	public Set<User> findUserByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCheckState
	 *
	 */
	public Set<User> findUserByCheckState(Integer checkState) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCheckState
	 *
	 */
	public Set<User> findUserByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByGroupId
	 *
	 */
	public Set<User> findUserByGroupId(Integer groupId) throws DataAccessException;

	/**
	 * JPQL Query - findUserByGroupId
	 *
	 */
	public Set<User> findUserByGroupId(Integer groupId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginTime
	 *
	 */
	public Set<User> findUserByLastLoginTime(java.util.Calendar lastLoginTime) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginTime
	 *
	 */
	public Set<User> findUserByLastLoginTime(Calendar lastLoginTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserById
	 *
	 */
	public User findUserById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findUserById
	 *
	 */
	public User findUserById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	public Set<User> findUserByBirthdayAfter(Calendar birthday_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByQq
	 *
	 */
	public Set<User> findUserByQq(String qq_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByQq
	 *
	 */
	public Set<User> findUserByQq(String qq_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByAddress
	 *
	 */
	public Set<User> findUserByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findUserByAddress
	 *
	 */
	public Set<User> findUserByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByRealNameContaining
	 *
	 */
	public Set<User> findUserByRealNameContaining(String realName) throws DataAccessException;

	/**
	 * JPQL Query - findUserByRealNameContaining
	 *
	 */
	public Set<User> findUserByRealNameContaining(String realName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByRealName
	 *
	 */
	public Set<User> findUserByRealName(String realName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByRealName
	 *
	 */
	public Set<User> findUserByRealName(String realName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	public Set<User> findAllUsers() throws DataAccessException;

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	public Set<User> findAllUsers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByZipCodeContaining
	 *
	 */
	public Set<User> findUserByZipCodeContaining(String zipCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByZipCodeContaining
	 *
	 */
	public Set<User> findUserByZipCodeContaining(String zipCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday_2) throws DataAccessException;

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	public Set<User> findUserByBirthdayBefore(Calendar birthday_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInfo
	 *
	 */
	public Set<User> findUserByInfo(String info) throws DataAccessException;

	/**
	 * JPQL Query - findUserByInfo
	 *
	 */
	public Set<User> findUserByInfo(String info, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	public Set<User> findUserByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	public Set<User> findUserByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByTelephone
	 *
	 */
	public Set<User> findUserByTelephone(String telephone_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByTelephone
	 *
	 */
	public Set<User> findUserByTelephone(String telephone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLoginNumber
	 *
	 */
	public Set<User> findUserByLoginNumber(Integer loginNumber) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLoginNumber
	 *
	 */
	public Set<User> findUserByLoginNumber(Integer loginNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCreateTime
	 *
	 */
	public Set<User> findUserByCreateTime(java.util.Calendar createTime) throws DataAccessException;

	/**
	 * JPQL Query - findUserByCreateTime
	 *
	 */
	public Set<User> findUserByCreateTime(Calendar createTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByAddressContaining
	 *
	 */
	public Set<User> findUserByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByAddressContaining
	 *
	 */
	public Set<User> findUserByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsUserName
	 *
	 */
	public Set<User> findUserByJ2cmsUserName(String j2cmsUserName) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsUserName
	 *
	 */
	public Set<User> findUserByJ2cmsUserName(String j2cmsUserName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsUserNameContaining
	 *
	 */
	public Set<User> findUserByJ2cmsUserNameContaining(String j2cmsUserName_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsUserNameContaining
	 *
	 */
	public Set<User> findUserByJ2cmsUserNameContaining(String j2cmsUserName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySysDate
	 *
	 */
	public Set<User> findUserBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findUserBySysDate
	 *
	 */
	public Set<User> findUserBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsPassWordContaining
	 *
	 */
	public Set<User> findUserByJ2cmsPassWordContaining(String j2cmsPassWord_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByJ2cmsPassWordContaining
	 *
	 */
	public Set<User> findUserByJ2cmsPassWordContaining(String j2cmsPassWord_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginIpContaining
	 *
	 */
	public Set<User> findUserByLastLoginIpContaining(String lastLoginIp_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByLastLoginIpContaining
	 *
	 */
	public Set<User> findUserByLastLoginIpContaining(String lastLoginIp_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByGender
	 *
	 */
	public Set<User> findUserByGender(Integer gender) throws DataAccessException;

	/**
	 * JPQL Query - findUserByGender
	 *
	 */
	public Set<User> findUserByGender(Integer gender, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	public User findUserByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	public User findUserByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}