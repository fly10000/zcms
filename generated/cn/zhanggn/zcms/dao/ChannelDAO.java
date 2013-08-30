package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Channel;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Channel entities.
 * 
 */
public interface ChannelDAO extends JpaDao<Channel> {

	/**
	 * JPQL Query - findChannelBySingleContaining
	 *
	 */
	public Set<Channel> findChannelBySingleContaining(String single) throws DataAccessException;

	/**
	 * JPQL Query - findChannelBySingleContaining
	 *
	 */
	public Set<Channel> findChannelBySingleContaining(String single, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByFatherId
	 *
	 */
	public Set<Channel> findChannelByFatherId(Integer fatherId) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByFatherId
	 *
	 */
	public Set<Channel> findChannelByFatherId(Integer fatherId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByName
	 *
	 */
	public Set<Channel> findChannelByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByName
	 *
	 */
	public Set<Channel> findChannelByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelBySingle
	 *
	 */
	public Set<Channel> findChannelBySingle(String single_1) throws DataAccessException;

	/**
	 * JPQL Query - findChannelBySingle
	 *
	 */
	public Set<Channel> findChannelBySingle(String single_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByNameContaining
	 *
	 */
	public Set<Channel> findChannelByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByNameContaining
	 *
	 */
	public Set<Channel> findChannelByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByVisitTotal
	 *
	 */
	public Set<Channel> findChannelByVisitTotal(Integer visitTotal) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByVisitTotal
	 *
	 */
	public Set<Channel> findChannelByVisitTotal(Integer visitTotal, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByCheckState
	 *
	 */
	public Set<Channel> findChannelByCheckState(Integer checkState) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByCheckState
	 *
	 */
	public Set<Channel> findChannelByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByInfo
	 *
	 */
	public Set<Channel> findChannelByInfo(String info) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByInfo
	 *
	 */
	public Set<Channel> findChannelByInfo(String info, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplay
	 *
	 */
	public Set<Channel> findChannelByDisplay(String display) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplay
	 *
	 */
	public Set<Channel> findChannelByDisplay(String display, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelById
	 *
	 */
	public Channel findChannelById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findChannelById
	 *
	 */
	public Channel findChannelById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayInIndex
	 *
	 */
	public Set<Channel> findChannelByDisplayInIndex(String displayInIndex) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayInIndex
	 *
	 */
	public Set<Channel> findChannelByDisplayInIndex(String displayInIndex, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllChannels
	 *
	 */
	public Set<Channel> findAllChannels() throws DataAccessException;

	/**
	 * JPQL Query - findAllChannels
	 *
	 */
	public Set<Channel> findAllChannels(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayContaining
	 *
	 */
	public Set<Channel> findChannelByDisplayContaining(String display_1) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayContaining
	 *
	 */
	public Set<Channel> findChannelByDisplayContaining(String display_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayInIndexContaining
	 *
	 */
	public Set<Channel> findChannelByDisplayInIndexContaining(String displayInIndex_1) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByDisplayInIndexContaining
	 *
	 */
	public Set<Channel> findChannelByDisplayInIndexContaining(String displayInIndex_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByPrimaryKey
	 *
	 */
	public Channel findChannelByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByPrimaryKey
	 *
	 */
	public Channel findChannelByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelBySysDate
	 *
	 */
	public Set<Channel> findChannelBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findChannelBySysDate
	 *
	 */
	public Set<Channel> findChannelBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByRankId
	 *
	 */
	public Set<Channel> findChannelByRankId(Integer rankId) throws DataAccessException;

	/**
	 * JPQL Query - findChannelByRankId
	 *
	 */
	public Set<Channel> findChannelByRankId(Integer rankId, int startResult, int maxRows) throws DataAccessException;

}