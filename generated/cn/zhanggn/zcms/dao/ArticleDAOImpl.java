package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Article;

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
 * DAO to manage Article entities.
 * 
 */
@Repository("ArticleDAO")
@Transactional
public class ArticleDAOImpl extends AbstractJpaDao<Article> implements
		ArticleDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Article.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_jdbc_Driver
	 *
	 */
	@PersistenceContext(unitName = "com_mysql_jdbc_Driver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ArticleDAOImpl
	 *
	 */
	public ArticleDAOImpl() {
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
	 * JPQL Query - findArticleByAuthorContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByAuthorContaining(String author) throws DataAccessException {

		return findArticleByAuthorContaining(author, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByAuthorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByAuthorContaining(String author, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByAuthorContaining", startResult, maxRows, author);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleBySysDate
	 *
	 */
	@Transactional
	public Set<Article> findArticleBySysDate(java.util.Calendar sysDate) throws DataAccessException {

		return findArticleBySysDate(sysDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleBySysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleBySysDate(java.util.Calendar sysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleBySysDate", startResult, maxRows, sysDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllArticles
	 *
	 */
	@Transactional
	public Set<Article> findAllArticles() throws DataAccessException {

		return findAllArticles(-1, -1);
	}

	/**
	 * JPQL Query - findAllArticles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findAllArticles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllArticles", startResult, maxRows);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByChannelId
	 *
	 */
	@Transactional
	public Set<Article> findArticleByChannelId(Integer channelId) throws DataAccessException {

		return findArticleByChannelId(channelId, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByChannelId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByChannelId(Integer channelId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByChannelId", startResult, maxRows, channelId);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByUserId
	 *
	 */
	@Transactional
	public Set<Article> findArticleByUserId(Integer userId) throws DataAccessException {

		return findArticleByUserId(userId, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByUserId", startResult, maxRows, userId);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByPrimaryKey
	 *
	 */
	@Transactional
	public Article findArticleByPrimaryKey(Integer id) throws DataAccessException {

		return findArticleByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByPrimaryKey
	 *
	 */

	@Transactional
	public Article findArticleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArticleByPrimaryKey", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Article) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArticleByRecommendLevel
	 *
	 */
	@Transactional
	public Set<Article> findArticleByRecommendLevel(Integer recommendLevel) throws DataAccessException {

		return findArticleByRecommendLevel(recommendLevel, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByRecommendLevel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByRecommendLevel(Integer recommendLevel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByRecommendLevel", startResult, maxRows, recommendLevel);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByReleaseDate
	 *
	 */
	@Transactional
	public Set<Article> findArticleByReleaseDate(String releaseDate) throws DataAccessException {

		return findArticleByReleaseDate(releaseDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByReleaseDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByReleaseDate(String releaseDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByReleaseDate", startResult, maxRows, releaseDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByReleaseDateContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByReleaseDateContaining(String releaseDate) throws DataAccessException {

		return findArticleByReleaseDateContaining(releaseDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByReleaseDateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByReleaseDateContaining(String releaseDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByReleaseDateContaining", startResult, maxRows, releaseDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByGroupId
	 *
	 */
	@Transactional
	public Set<Article> findArticleByGroupId(Integer groupId) throws DataAccessException {

		return findArticleByGroupId(groupId, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByGroupId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByGroupId(Integer groupId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByGroupId", startResult, maxRows, groupId);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByCheckDate
	 *
	 */
	@Transactional
	public Set<Article> findArticleByCheckDate(java.util.Calendar checkDate) throws DataAccessException {

		return findArticleByCheckDate(checkDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByCheckDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByCheckDate(java.util.Calendar checkDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByCheckDate", startResult, maxRows, checkDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTitle
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTitle(String title) throws DataAccessException {

		return findArticleByTitle(title, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTitle(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTitle", startResult, maxRows, title);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByCommentStateContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByCommentStateContaining(String commentState) throws DataAccessException {

		return findArticleByCommentStateContaining(commentState, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByCommentStateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByCommentStateContaining(String commentState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByCommentStateContaining", startResult, maxRows, commentState);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByRelatedIdContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByRelatedIdContaining(String relatedId) throws DataAccessException {

		return findArticleByRelatedIdContaining(relatedId, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByRelatedIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByRelatedIdContaining(String relatedId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByRelatedIdContaining", startResult, maxRows, relatedId);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByAuthor
	 *
	 */
	@Transactional
	public Set<Article> findArticleByAuthor(String author) throws DataAccessException {

		return findArticleByAuthor(author, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByAuthor
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByAuthor(String author, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByAuthor", startResult, maxRows, author);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByCheckState
	 *
	 */
	@Transactional
	public Set<Article> findArticleByCheckState(Integer checkState) throws DataAccessException {

		return findArticleByCheckState(checkState, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByCheckState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByCheckState", startResult, maxRows, checkState);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByContentImgContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByContentImgContaining(String contentImg) throws DataAccessException {

		return findArticleByContentImgContaining(contentImg, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByContentImgContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByContentImgContaining(String contentImg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByContentImgContaining", startResult, maxRows, contentImg);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByCommentCount
	 *
	 */
	@Transactional
	public Set<Article> findArticleByCommentCount(Integer commentCount) throws DataAccessException {

		return findArticleByCommentCount(commentCount, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByCommentCount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByCommentCount(Integer commentCount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByCommentCount", startResult, maxRows, commentCount);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleBySummary
	 *
	 */
	@Transactional
	public Set<Article> findArticleBySummary(String summary) throws DataAccessException {

		return findArticleBySummary(summary, -1, -1);
	}

	/**
	 * JPQL Query - findArticleBySummary
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleBySummary(String summary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleBySummary", startResult, maxRows, summary);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTagsContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTagsContaining(String tags) throws DataAccessException {

		return findArticleByTagsContaining(tags, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTagsContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTagsContaining(String tags, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTagsContaining", startResult, maxRows, tags);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTitleContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTitleContaining(String title) throws DataAccessException {

		return findArticleByTitleContaining(title, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTitleContaining(String title, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTitleContaining", startResult, maxRows, title);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByOrigin
	 *
	 */
	@Transactional
	public Set<Article> findArticleByOrigin(String origin) throws DataAccessException {

		return findArticleByOrigin(origin, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByOrigin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByOrigin(String origin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByOrigin", startResult, maxRows, origin);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByReleaseSysDate
	 *
	 */
	@Transactional
	public Set<Article> findArticleByReleaseSysDate(java.util.Calendar releaseSysDate) throws DataAccessException {

		return findArticleByReleaseSysDate(releaseSysDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByReleaseSysDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByReleaseSysDate(java.util.Calendar releaseSysDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByReleaseSysDate", startResult, maxRows, releaseSysDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByDisableDate
	 *
	 */
	@Transactional
	public Set<Article> findArticleByDisableDate(java.util.Calendar disableDate) throws DataAccessException {

		return findArticleByDisableDate(disableDate, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByDisableDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByDisableDate(java.util.Calendar disableDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByDisableDate", startResult, maxRows, disableDate);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByOriginContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByOriginContaining(String origin) throws DataAccessException {

		return findArticleByOriginContaining(origin, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByOriginContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByOriginContaining(String origin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByOriginContaining", startResult, maxRows, origin);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByContent
	 *
	 */
	@Transactional
	public Set<Article> findArticleByContent(String content) throws DataAccessException {

		return findArticleByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByContent", startResult, maxRows, content);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTitleImgContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTitleImgContaining(String titleImg) throws DataAccessException {

		return findArticleByTitleImgContaining(titleImg, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTitleImgContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTitleImgContaining(String titleImg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTitleImgContaining", startResult, maxRows, titleImg);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByCommentState
	 *
	 */
	@Transactional
	public Set<Article> findArticleByCommentState(String commentState) throws DataAccessException {

		return findArticleByCommentState(commentState, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByCommentState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByCommentState(String commentState, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByCommentState", startResult, maxRows, commentState);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByRelatedId
	 *
	 */
	@Transactional
	public Set<Article> findArticleByRelatedId(String relatedId) throws DataAccessException {

		return findArticleByRelatedId(relatedId, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByRelatedId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByRelatedId(String relatedId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByRelatedId", startResult, maxRows, relatedId);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleBySummaryContaining
	 *
	 */
	@Transactional
	public Set<Article> findArticleBySummaryContaining(String summary) throws DataAccessException {

		return findArticleBySummaryContaining(summary, -1, -1);
	}

	/**
	 * JPQL Query - findArticleBySummaryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleBySummaryContaining(String summary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleBySummaryContaining", startResult, maxRows, summary);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleById
	 *
	 */
	@Transactional
	public Article findArticleById(Integer id) throws DataAccessException {

		return findArticleById(id, -1, -1);
	}

	/**
	 * JPQL Query - findArticleById
	 *
	 */

	@Transactional
	public Article findArticleById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArticleById", startResult, maxRows, id);
			return (cn.zhanggn.zcms.domain.Article) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArticleByVisitTotal
	 *
	 */
	@Transactional
	public Set<Article> findArticleByVisitTotal(Integer visitTotal) throws DataAccessException {

		return findArticleByVisitTotal(visitTotal, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByVisitTotal
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByVisitTotal(Integer visitTotal, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByVisitTotal", startResult, maxRows, visitTotal);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTags
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTags(String tags) throws DataAccessException {

		return findArticleByTags(tags, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTags
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTags(String tags, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTags", startResult, maxRows, tags);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByContentImg
	 *
	 */
	@Transactional
	public Set<Article> findArticleByContentImg(String contentImg) throws DataAccessException {

		return findArticleByContentImg(contentImg, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByContentImg
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByContentImg(String contentImg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByContentImg", startResult, maxRows, contentImg);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * JPQL Query - findArticleByTitleImg
	 *
	 */
	@Transactional
	public Set<Article> findArticleByTitleImg(String titleImg) throws DataAccessException {

		return findArticleByTitleImg(titleImg, -1, -1);
	}

	/**
	 * JPQL Query - findArticleByTitleImg
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Article> findArticleByTitleImg(String titleImg, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArticleByTitleImg", startResult, maxRows, titleImg);
		return new LinkedHashSet<Article>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Article entity) {
		return true;
	}
}
