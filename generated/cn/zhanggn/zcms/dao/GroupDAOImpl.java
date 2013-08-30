package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Group;

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
 * DAO to manage Group entities.
 * 
 */
@Repository("GroupDAO")
@Transactional
public class GroupDAOImpl extends AbstractJpaDao<Group> implements GroupDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Group.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GroupDAOImpl
	 *
	 */
	public GroupDAOImpl() {
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
	 * JPQL Query - findGroupById
	 *
	 */
	@Transactional
	public Group findGroupById(Integer id) throws DataAccessException {

		return findGroupById(id, -1, -1);
	}

	/**
	 * JPQL Query - findGroupById
	 *
	 */

	@Transactional
	public Group findGroupById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGroupById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Group) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGroupByManageComment
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageComment(String manageComment) throws DataAccessException {

		return findGroupByManageComment(manageComment, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageComment
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageComment(String manageComment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageComment", startResult, maxRows, manageComment);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageChannel
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageChannel(String manageChannel) throws DataAccessException {

		return findGroupByManageChannel(manageChannel, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageChannel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageChannel(String manageChannel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageChannel", startResult, maxRows, manageChannel);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageCommentContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageCommentContaining(String manageComment) throws DataAccessException {

		return findGroupByManageCommentContaining(manageComment, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageCommentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageCommentContaining(String manageComment, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageCommentContaining", startResult, maxRows, manageComment);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupBySysDate
	 *
	 */
	@Transactional
	public Set<Group> findGroupBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findGroupBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findGroupBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerArticleContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerArticleContaining(String managerArticle) throws DataAccessException {

		return findGroupByManagerArticleContaining(managerArticle, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerArticleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerArticleContaining(String managerArticle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerArticleContaining", startResult, maxRows, managerArticle);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByName
	 *
	 */
	@Transactional
	public Set<Group> findGroupByName(String name) throws DataAccessException {

		return findGroupByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByName", startResult, maxRows, name);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByInfoContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByInfoContaining(String info) throws DataAccessException {

		return findGroupByInfoContaining(info, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByInfoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByInfoContaining(String info, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByInfoContaining", startResult, maxRows, info);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerLogContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerLogContaining(String managerLog) throws DataAccessException {

		return findGroupByManagerLogContaining(managerLog, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerLogContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerLogContaining(String managerLog, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerLogContaining", startResult, maxRows, managerLog);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerLog
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerLog(String managerLog) throws DataAccessException {

		return findGroupByManagerLog(managerLog, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerLog
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerLog(String managerLog, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerLog", startResult, maxRows, managerLog);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageChannelContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageChannelContaining(String manageChannel) throws DataAccessException {

		return findGroupByManageChannelContaining(manageChannel, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageChannelContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageChannelContaining(String manageChannel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageChannelContaining", startResult, maxRows, manageChannel);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageGroup
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageGroup(String manageGroup) throws DataAccessException {

		return findGroupByManageGroup(manageGroup, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageGroup
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageGroup(String manageGroup, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageGroup", startResult, maxRows, manageGroup);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerUserContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerUserContaining(String managerUser) throws DataAccessException {

		return findGroupByManagerUserContaining(managerUser, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerUserContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerUserContaining(String managerUser, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerUserContaining", startResult, maxRows, managerUser);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByInfo
	 *
	 */
	@Transactional
	public Set<Group> findGroupByInfo(String info) throws DataAccessException {

		return findGroupByInfo(info, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByInfo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByInfo(String info, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByInfo", startResult, maxRows, info);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllGroups
	 *
	 */
	@Transactional
	public Set<Group> findAllGroups() throws DataAccessException {

		return findAllGroups(-1, -1);
	}

	/**
	 * JPQL Query - findAllGroups
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findAllGroups(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGroups", startResult, maxRows);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerUser
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerUser(String managerUser) throws DataAccessException {

		return findGroupByManagerUser(managerUser, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerUser
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerUser(String managerUser, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerUser", startResult, maxRows, managerUser);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageGroupContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageGroupContaining(String manageGroup) throws DataAccessException {

		return findGroupByManageGroupContaining(manageGroup, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageGroupContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageGroupContaining(String manageGroup, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageGroupContaining", startResult, maxRows, manageGroup);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManagerArticle
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManagerArticle(String managerArticle) throws DataAccessException {

		return findGroupByManagerArticle(managerArticle, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManagerArticle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManagerArticle(String managerArticle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManagerArticle", startResult, maxRows, managerArticle);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByPrimaryKey
	 *
	 */
	@Transactional
	public Group findGroupByPrimaryKey(Integer id) throws DataAccessException {

		return findGroupByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByPrimaryKey
	 *
	 */

	@Transactional
	public Group findGroupByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGroupByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Group) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGroupByCheckState
	 *
	 */
	@Transactional
	public Set<Group> findGroupByCheckState(Integer checkState) throws DataAccessException {

		return findGroupByCheckState(checkState, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByCheckState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByCheckState", startResult, maxRows, checkState);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageConfig
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageConfig(String manageConfig) throws DataAccessException {

		return findGroupByManageConfig(manageConfig, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageConfig
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageConfig(String manageConfig, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageConfig", startResult, maxRows, manageConfig);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByManageConfigContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByManageConfigContaining(String manageConfig) throws DataAccessException {

		return findGroupByManageConfigContaining(manageConfig, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByManageConfigContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByManageConfigContaining(String manageConfig, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByManageConfigContaining", startResult, maxRows, manageConfig);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * JPQL Query - findGroupByNameContaining
	 *
	 */
	@Transactional
	public Set<Group> findGroupByNameContaining(String name) throws DataAccessException {

		return findGroupByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findGroupByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Group> findGroupByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGroupByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Group>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Group entity) {
		return true;
	}
}
