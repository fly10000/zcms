package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.User;

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
 * DAO to manage User entities.
 * 
 */
@Repository("UserDAO")
@Transactional
public class UserDAOImpl extends AbstractJpaDao<User> implements UserDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { User.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UserDAOImpl
	 *
	 */
	public UserDAOImpl() {
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
	 * JPQL Query - findUserByBirthday
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthday(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthday(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthday
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthday(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthday", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByQqContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByQqContaining(String qq) throws DataAccessException {

		return findUserByQqContaining(qq, -1, -1);
	}

	/**
	 * JPQL Query - findUserByQqContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByQqContaining(String qq, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByQqContaining", startResult, maxRows, qq);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */
	@Transactional
	public Set<User> findUserByEmail(String email) throws DataAccessException {

		return findUserByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByEmail", startResult, maxRows, email);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByTelephoneContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByTelephoneContaining(String telephone) throws DataAccessException {

		return findUserByTelephoneContaining(telephone, -1, -1);
	}

	/**
	 * JPQL Query - findUserByTelephoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByTelephoneContaining(String telephone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByTelephoneContaining", startResult, maxRows, telephone);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByLastLoginIp
	 *
	 */
	@Transactional
	public Set<User> findUserByLastLoginIp(String lastLoginIp) throws DataAccessException {

		return findUserByLastLoginIp(lastLoginIp, -1, -1);
	}

	/**
	 * JPQL Query - findUserByLastLoginIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByLastLoginIp(String lastLoginIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByLastLoginIp", startResult, maxRows, lastLoginIp);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByJ2cmsPassWord
	 *
	 */
	@Transactional
	public Set<User> findUserByJ2cmsPassWord(String j2cmsPassWord) throws DataAccessException {

		return findUserByJ2cmsPassWord(j2cmsPassWord, -1, -1);
	}

	/**
	 * JPQL Query - findUserByJ2cmsPassWord
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByJ2cmsPassWord(String j2cmsPassWord, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByJ2cmsPassWord", startResult, maxRows, j2cmsPassWord);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByZipCode
	 *
	 */
	@Transactional
	public Set<User> findUserByZipCode(String zipCode) throws DataAccessException {

		return findUserByZipCode(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findUserByZipCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByZipCode(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByZipCode", startResult, maxRows, zipCode);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByCheckState
	 *
	 */
	@Transactional
	public Set<User> findUserByCheckState(Integer checkState) throws DataAccessException {

		return findUserByCheckState(checkState, -1, -1);
	}

	/**
	 * JPQL Query - findUserByCheckState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByCheckState", startResult, maxRows, checkState);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByGroupId
	 *
	 */
	@Transactional
	public Set<User> findUserByGroupId(Integer groupId) throws DataAccessException {

		return findUserByGroupId(groupId, -1, -1);
	}

	/**
	 * JPQL Query - findUserByGroupId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByGroupId(Integer groupId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByGroupId", startResult, maxRows, groupId);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByLastLoginTime
	 *
	 */
	@Transactional
	public Set<User> findUserByLastLoginTime(java.util.Calendar lastLoginTime) throws DataAccessException {

		return findUserByLastLoginTime(lastLoginTime, -1, -1);
	}

	/**
	 * JPQL Query - findUserByLastLoginTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByLastLoginTime(java.util.Calendar lastLoginTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByLastLoginTime", startResult, maxRows, lastLoginTime);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserById
	 *
	 */
	@Transactional
	public User findUserById(Integer id) throws DataAccessException {

		return findUserById(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserById
	 *
	 */

	@Transactional
	public User findUserById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.User) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthdayAfter(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthdayAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthdayAfter(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthdayAfter", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByQq
	 *
	 */
	@Transactional
	public Set<User> findUserByQq(String qq) throws DataAccessException {

		return findUserByQq(qq, -1, -1);
	}

	/**
	 * JPQL Query - findUserByQq
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByQq(String qq, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByQq", startResult, maxRows, qq);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByAddress
	 *
	 */
	@Transactional
	public Set<User> findUserByAddress(String address) throws DataAccessException {

		return findUserByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findUserByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByAddress", startResult, maxRows, address);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByRealNameContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByRealNameContaining(String realName) throws DataAccessException {

		return findUserByRealNameContaining(realName, -1, -1);
	}

	/**
	 * JPQL Query - findUserByRealNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByRealNameContaining(String realName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByRealNameContaining", startResult, maxRows, realName);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByRealName
	 *
	 */
	@Transactional
	public Set<User> findUserByRealName(String realName) throws DataAccessException {

		return findUserByRealName(realName, -1, -1);
	}

	/**
	 * JPQL Query - findUserByRealName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByRealName(String realName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByRealName", startResult, maxRows, realName);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsers
	 *
	 */
	@Transactional
	public Set<User> findAllUsers() throws DataAccessException {

		return findAllUsers(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findAllUsers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsers", startResult, maxRows);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByZipCodeContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByZipCodeContaining(String zipCode) throws DataAccessException {

		return findUserByZipCodeContaining(zipCode, -1, -1);
	}

	/**
	 * JPQL Query - findUserByZipCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByZipCodeContaining(String zipCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByZipCodeContaining", startResult, maxRows, zipCode);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */
	@Transactional
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday) throws DataAccessException {

		return findUserByBirthdayBefore(birthday, -1, -1);
	}

	/**
	 * JPQL Query - findUserByBirthdayBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByBirthdayBefore(java.util.Calendar birthday, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByBirthdayBefore", startResult, maxRows, birthday);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByInfo
	 *
	 */
	@Transactional
	public Set<User> findUserByInfo(String info) throws DataAccessException {

		return findUserByInfo(info, -1, -1);
	}

	/**
	 * JPQL Query - findUserByInfo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByInfo(String info, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByInfo", startResult, maxRows, info);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByEmailContaining(String email) throws DataAccessException {

		return findUserByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findUserByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByTelephone
	 *
	 */
	@Transactional
	public Set<User> findUserByTelephone(String telephone) throws DataAccessException {

		return findUserByTelephone(telephone, -1, -1);
	}

	/**
	 * JPQL Query - findUserByTelephone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByTelephone(String telephone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByTelephone", startResult, maxRows, telephone);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByLoginNumber
	 *
	 */
	@Transactional
	public Set<User> findUserByLoginNumber(Integer loginNumber) throws DataAccessException {

		return findUserByLoginNumber(loginNumber, -1, -1);
	}

	/**
	 * JPQL Query - findUserByLoginNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByLoginNumber(Integer loginNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByLoginNumber", startResult, maxRows, loginNumber);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByCreateTime
	 *
	 */
	@Transactional
	public Set<User> findUserByCreateTime(java.util.Calendar createTime) throws DataAccessException {

		return findUserByCreateTime(createTime, -1, -1);
	}

	/**
	 * JPQL Query - findUserByCreateTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByCreateTime(java.util.Calendar createTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByCreateTime", startResult, maxRows, createTime);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByAddressContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByAddressContaining(String address) throws DataAccessException {

		return findUserByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findUserByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByJ2cmsUserName
	 *
	 */
	@Transactional
	public Set<User> findUserByJ2cmsUserName(String j2cmsUserName) throws DataAccessException {

		return findUserByJ2cmsUserName(j2cmsUserName, -1, -1);
	}

	/**
	 * JPQL Query - findUserByJ2cmsUserName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByJ2cmsUserName(String j2cmsUserName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByJ2cmsUserName", startResult, maxRows, j2cmsUserName);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByJ2cmsUserNameContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByJ2cmsUserNameContaining(String j2cmsUserName) throws DataAccessException {

		return findUserByJ2cmsUserNameContaining(j2cmsUserName, -1, -1);
	}

	/**
	 * JPQL Query - findUserByJ2cmsUserNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByJ2cmsUserNameContaining(String j2cmsUserName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByJ2cmsUserNameContaining", startResult, maxRows, j2cmsUserName);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserBySysDate
	 *
	 */
	@Transactional
	public Set<User> findUserBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findUserBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findUserBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByJ2cmsPassWordContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByJ2cmsPassWordContaining(String j2cmsPassWord) throws DataAccessException {

		return findUserByJ2cmsPassWordContaining(j2cmsPassWord, -1, -1);
	}

	/**
	 * JPQL Query - findUserByJ2cmsPassWordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByJ2cmsPassWordContaining(String j2cmsPassWord, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByJ2cmsPassWordContaining", startResult, maxRows, j2cmsPassWord);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByLastLoginIpContaining
	 *
	 */
	@Transactional
	public Set<User> findUserByLastLoginIpContaining(String lastLoginIp) throws DataAccessException {

		return findUserByLastLoginIpContaining(lastLoginIp, -1, -1);
	}

	/**
	 * JPQL Query - findUserByLastLoginIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByLastLoginIpContaining(String lastLoginIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByLastLoginIpContaining", startResult, maxRows, lastLoginIp);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByGender
	 *
	 */
	@Transactional
	public Set<User> findUserByGender(Integer gender) throws DataAccessException {

		return findUserByGender(gender, -1, -1);
	}

	/**
	 * JPQL Query - findUserByGender
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<User> findUserByGender(Integer gender, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUserByGender", startResult, maxRows, gender);
		return new LinkedHashSet<User>(query.getResultList());
	}

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */
	@Transactional
	public User findUserByPrimaryKey(Integer id) throws DataAccessException {

		return findUserByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findUserByPrimaryKey
	 *
	 */

	@Transactional
	public User findUserByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUserByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.User) query.getSingleResult();
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
	public boolean canBeMerged(User entity) {
		return true;
	}
}
