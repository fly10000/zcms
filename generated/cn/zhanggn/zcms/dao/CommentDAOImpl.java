package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Comment;

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
 * DAO to manage Comment entities.
 * 
 */
@Repository("CommentDAO")
@Transactional
public class CommentDAOImpl extends AbstractJpaDao<Comment> implements
		CommentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Comment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CommentDAOImpl
	 *
	 */
	public CommentDAOImpl() {
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
	 * JPQL Query - findCommentBySysDate
	 *
	 */
	@Transactional
	public Set<Comment> findCommentBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findCommentBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByContent
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByContent(String content) throws DataAccessException {

		return findCommentByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByContent", startResult, maxRows, content);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentById
	 *
	 */
	@Transactional
	public Comment findCommentById(Integer id) throws DataAccessException {

		return findCommentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCommentById
	 *
	 */

	@Transactional
	public Comment findCommentById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Comment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCommentByState
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByState(String state) throws DataAccessException {

		return findCommentByState(state, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByState(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByState", startResult, maxRows, state);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	@Transactional
	public Comment findCommentByPrimaryKey(Integer id) throws DataAccessException {

		return findCommentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */

	@Transactional
	public Comment findCommentByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Comment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCommentByUserId
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByUserId(Integer userId) throws DataAccessException {

		return findCommentByUserId(userId, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByUserId", startResult, maxRows, userId);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	@Transactional
	public Set<Comment> findAllComments() throws DataAccessException {

		return findAllComments(-1, -1);
	}

	/**
	 * JPQL Query - findAllComments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findAllComments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllComments", startResult, maxRows);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByArticleId
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByArticleId(Integer articleId) throws DataAccessException {

		return findCommentByArticleId(articleId, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByArticleId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByArticleId(Integer articleId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByArticleId", startResult, maxRows, articleId);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByReleaseDate
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByReleaseDate(java.util.Calendar releaseDate) throws DataAccessException {

		return findCommentByReleaseDate(releaseDate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByReleaseDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByReleaseDate(java.util.Calendar releaseDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByReleaseDate", startResult, maxRows, releaseDate);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByStateContaining
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByStateContaining(String state) throws DataAccessException {

		return findCommentByStateContaining(state, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByStateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByStateContaining(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByStateContaining", startResult, maxRows, state);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByCheckState
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCheckState(Integer checkState) throws DataAccessException {

		return findCommentByCheckState(checkState, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCheckState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCheckState", startResult, maxRows, checkState);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Comment entity) {
		return true;
	}
}
