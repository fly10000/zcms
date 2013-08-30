package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Comment;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Comment entities.
 * 
 */
public interface CommentDAO extends JpaDao<Comment> {

	/**
	 * JPQL Query - findCommentBySysDate
	 *
	 */
	public Set<Comment> findCommentBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findCommentBySysDate
	 *
	 */
	public Set<Comment> findCommentBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByContent
	 *
	 */
	public Set<Comment> findCommentByContent(String content) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByContent
	 *
	 */
	public Set<Comment> findCommentByContent(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentById
	 *
	 */
	public Comment findCommentById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findCommentById
	 *
	 */
	public Comment findCommentById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByState
	 *
	 */
	public Set<Comment> findCommentByState(String state) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByState
	 *
	 */
	public Set<Comment> findCommentByState(String state, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	public Comment findCommentByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	public Comment findCommentByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByUserId
	 *
	 */
	public Set<Comment> findCommentByUserId(Integer userId) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByUserId
	 *
	 */
	public Set<Comment> findCommentByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	public Set<Comment> findAllComments() throws DataAccessException;

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	public Set<Comment> findAllComments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByArticleId
	 *
	 */
	public Set<Comment> findCommentByArticleId(Integer articleId) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByArticleId
	 *
	 */
	public Set<Comment> findCommentByArticleId(Integer articleId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByReleaseDate
	 *
	 */
	public Set<Comment> findCommentByReleaseDate(java.util.Calendar releaseDate) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByReleaseDate
	 *
	 */
	public Set<Comment> findCommentByReleaseDate(Calendar releaseDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByStateContaining
	 *
	 */
	public Set<Comment> findCommentByStateContaining(String state_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByStateContaining
	 *
	 */
	public Set<Comment> findCommentByStateContaining(String state_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCheckState
	 *
	 */
	public Set<Comment> findCommentByCheckState(Integer checkState) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCheckState
	 *
	 */
	public Set<Comment> findCommentByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException;

}