package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Group;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Group entities.
 * 
 */
public interface GroupDAO extends JpaDao<Group> {

	/**
	 * JPQL Query - findGroupById
	 *
	 */
	public Group findGroupById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findGroupById
	 *
	 */
	public Group findGroupById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageComment
	 *
	 */
	public Set<Group> findGroupByManageComment(String manageComment) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageComment
	 *
	 */
	public Set<Group> findGroupByManageComment(String manageComment, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageChannel
	 *
	 */
	public Set<Group> findGroupByManageChannel(String manageChannel) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageChannel
	 *
	 */
	public Set<Group> findGroupByManageChannel(String manageChannel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageCommentContaining
	 *
	 */
	public Set<Group> findGroupByManageCommentContaining(String manageComment_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageCommentContaining
	 *
	 */
	public Set<Group> findGroupByManageCommentContaining(String manageComment_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupBySysDate
	 *
	 */
	public Set<Group> findGroupBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findGroupBySysDate
	 *
	 */
	public Set<Group> findGroupBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerArticleContaining
	 *
	 */
	public Set<Group> findGroupByManagerArticleContaining(String managerArticle) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerArticleContaining
	 *
	 */
	public Set<Group> findGroupByManagerArticleContaining(String managerArticle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByName
	 *
	 */
	public Set<Group> findGroupByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByName
	 *
	 */
	public Set<Group> findGroupByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByInfoContaining
	 *
	 */
	public Set<Group> findGroupByInfoContaining(String info) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByInfoContaining
	 *
	 */
	public Set<Group> findGroupByInfoContaining(String info, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerLogContaining
	 *
	 */
	public Set<Group> findGroupByManagerLogContaining(String managerLog) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerLogContaining
	 *
	 */
	public Set<Group> findGroupByManagerLogContaining(String managerLog, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerLog
	 *
	 */
	public Set<Group> findGroupByManagerLog(String managerLog_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerLog
	 *
	 */
	public Set<Group> findGroupByManagerLog(String managerLog_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageChannelContaining
	 *
	 */
	public Set<Group> findGroupByManageChannelContaining(String manageChannel_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageChannelContaining
	 *
	 */
	public Set<Group> findGroupByManageChannelContaining(String manageChannel_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageGroup
	 *
	 */
	public Set<Group> findGroupByManageGroup(String manageGroup) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageGroup
	 *
	 */
	public Set<Group> findGroupByManageGroup(String manageGroup, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerUserContaining
	 *
	 */
	public Set<Group> findGroupByManagerUserContaining(String managerUser) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerUserContaining
	 *
	 */
	public Set<Group> findGroupByManagerUserContaining(String managerUser, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByInfo
	 *
	 */
	public Set<Group> findGroupByInfo(String info_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByInfo
	 *
	 */
	public Set<Group> findGroupByInfo(String info_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGroups
	 *
	 */
	public Set<Group> findAllGroups() throws DataAccessException;

	/**
	 * JPQL Query - findAllGroups
	 *
	 */
	public Set<Group> findAllGroups(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerUser
	 *
	 */
	public Set<Group> findGroupByManagerUser(String managerUser_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerUser
	 *
	 */
	public Set<Group> findGroupByManagerUser(String managerUser_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageGroupContaining
	 *
	 */
	public Set<Group> findGroupByManageGroupContaining(String manageGroup_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageGroupContaining
	 *
	 */
	public Set<Group> findGroupByManageGroupContaining(String manageGroup_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerArticle
	 *
	 */
	public Set<Group> findGroupByManagerArticle(String managerArticle_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManagerArticle
	 *
	 */
	public Set<Group> findGroupByManagerArticle(String managerArticle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByPrimaryKey
	 *
	 */
	public Group findGroupByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByPrimaryKey
	 *
	 */
	public Group findGroupByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByCheckState
	 *
	 */
	public Set<Group> findGroupByCheckState(Integer checkState) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByCheckState
	 *
	 */
	public Set<Group> findGroupByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageConfig
	 *
	 */
	public Set<Group> findGroupByManageConfig(String manageConfig) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageConfig
	 *
	 */
	public Set<Group> findGroupByManageConfig(String manageConfig, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageConfigContaining
	 *
	 */
	public Set<Group> findGroupByManageConfigContaining(String manageConfig_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByManageConfigContaining
	 *
	 */
	public Set<Group> findGroupByManageConfigContaining(String manageConfig_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByNameContaining
	 *
	 */
	public Set<Group> findGroupByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findGroupByNameContaining
	 *
	 */
	public Set<Group> findGroupByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

}