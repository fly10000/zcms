package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Article;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Article entities.
 * 
 */
public interface ArticleDAO extends JpaDao<Article> {

	/**
	 * JPQL Query - findArticleByAuthorContaining
	 *
	 */
	public Set<Article> findArticleByAuthorContaining(String author) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByAuthorContaining
	 *
	 */
	public Set<Article> findArticleByAuthorContaining(String author, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySysDate
	 *
	 */
	public Set<Article> findArticleBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySysDate
	 *
	 */
	public Set<Article> findArticleBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllArticles
	 *
	 */
	public Set<Article> findAllArticles() throws DataAccessException;

	/**
	 * JPQL Query - findAllArticles
	 *
	 */
	public Set<Article> findAllArticles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByChannelId
	 *
	 */
	public Set<Article> findArticleByChannelId(Integer channelId) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByChannelId
	 *
	 */
	public Set<Article> findArticleByChannelId(Integer channelId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByUserId
	 *
	 */
	public Set<Article> findArticleByUserId(Integer userId) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByUserId
	 *
	 */
	public Set<Article> findArticleByUserId(Integer userId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByPrimaryKey
	 *
	 */
	public Article findArticleByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByPrimaryKey
	 *
	 */
	public Article findArticleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRecommendLevel
	 *
	 */
	public Set<Article> findArticleByRecommendLevel(Integer recommendLevel) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRecommendLevel
	 *
	 */
	public Set<Article> findArticleByRecommendLevel(Integer recommendLevel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseDate
	 *
	 */
	public Set<Article> findArticleByReleaseDate(String releaseDate) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseDate
	 *
	 */
	public Set<Article> findArticleByReleaseDate(String releaseDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseDateContaining
	 *
	 */
	public Set<Article> findArticleByReleaseDateContaining(String releaseDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseDateContaining
	 *
	 */
	public Set<Article> findArticleByReleaseDateContaining(String releaseDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByGroupId
	 *
	 */
	public Set<Article> findArticleByGroupId(Integer groupId) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByGroupId
	 *
	 */
	public Set<Article> findArticleByGroupId(Integer groupId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCheckDate
	 *
	 */
	public Set<Article> findArticleByCheckDate(java.util.Calendar checkDate) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCheckDate
	 *
	 */
	public Set<Article> findArticleByCheckDate(Calendar checkDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitle
	 *
	 */
	public Set<Article> findArticleByTitle(String title) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitle
	 *
	 */
	public Set<Article> findArticleByTitle(String title, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentStateContaining
	 *
	 */
	public Set<Article> findArticleByCommentStateContaining(String commentState) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentStateContaining
	 *
	 */
	public Set<Article> findArticleByCommentStateContaining(String commentState, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRelatedIdContaining
	 *
	 */
	public Set<Article> findArticleByRelatedIdContaining(String relatedId) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRelatedIdContaining
	 *
	 */
	public Set<Article> findArticleByRelatedIdContaining(String relatedId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByAuthor
	 *
	 */
	public Set<Article> findArticleByAuthor(String author_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByAuthor
	 *
	 */
	public Set<Article> findArticleByAuthor(String author_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCheckState
	 *
	 */
	public Set<Article> findArticleByCheckState(Integer checkState) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCheckState
	 *
	 */
	public Set<Article> findArticleByCheckState(Integer checkState, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContentImgContaining
	 *
	 */
	public Set<Article> findArticleByContentImgContaining(String contentImg) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContentImgContaining
	 *
	 */
	public Set<Article> findArticleByContentImgContaining(String contentImg, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentCount
	 *
	 */
	public Set<Article> findArticleByCommentCount(Integer commentCount) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentCount
	 *
	 */
	public Set<Article> findArticleByCommentCount(Integer commentCount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySummary
	 *
	 */
	public Set<Article> findArticleBySummary(String summary) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySummary
	 *
	 */
	public Set<Article> findArticleBySummary(String summary, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTagsContaining
	 *
	 */
	public Set<Article> findArticleByTagsContaining(String tags) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTagsContaining
	 *
	 */
	public Set<Article> findArticleByTagsContaining(String tags, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleContaining
	 *
	 */
	public Set<Article> findArticleByTitleContaining(String title_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleContaining
	 *
	 */
	public Set<Article> findArticleByTitleContaining(String title_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByOrigin
	 *
	 */
	public Set<Article> findArticleByOrigin(String origin) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByOrigin
	 *
	 */
	public Set<Article> findArticleByOrigin(String origin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseSysDate
	 *
	 */
	public Set<Article> findArticleByReleaseSysDate(java.util.Calendar releaseSysDate) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByReleaseSysDate
	 *
	 */
	public Set<Article> findArticleByReleaseSysDate(Calendar releaseSysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByDisableDate
	 *
	 */
	public Set<Article> findArticleByDisableDate(java.util.Calendar disableDate) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByDisableDate
	 *
	 */
	public Set<Article> findArticleByDisableDate(Calendar disableDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByOriginContaining
	 *
	 */
	public Set<Article> findArticleByOriginContaining(String origin_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByOriginContaining
	 *
	 */
	public Set<Article> findArticleByOriginContaining(String origin_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContent
	 *
	 */
	public Set<Article> findArticleByContent(String content) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContent
	 *
	 */
	public Set<Article> findArticleByContent(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleImgContaining
	 *
	 */
	public Set<Article> findArticleByTitleImgContaining(String titleImg) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleImgContaining
	 *
	 */
	public Set<Article> findArticleByTitleImgContaining(String titleImg, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentState
	 *
	 */
	public Set<Article> findArticleByCommentState(String commentState_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByCommentState
	 *
	 */
	public Set<Article> findArticleByCommentState(String commentState_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRelatedId
	 *
	 */
	public Set<Article> findArticleByRelatedId(String relatedId_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByRelatedId
	 *
	 */
	public Set<Article> findArticleByRelatedId(String relatedId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySummaryContaining
	 *
	 */
	public Set<Article> findArticleBySummaryContaining(String summary_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleBySummaryContaining
	 *
	 */
	public Set<Article> findArticleBySummaryContaining(String summary_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleById
	 *
	 */
	public Article findArticleById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleById
	 *
	 */
	public Article findArticleById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByVisitTotal
	 *
	 */
	public Set<Article> findArticleByVisitTotal(Integer visitTotal) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByVisitTotal
	 *
	 */
	public Set<Article> findArticleByVisitTotal(Integer visitTotal, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTags
	 *
	 */
	public Set<Article> findArticleByTags(String tags_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTags
	 *
	 */
	public Set<Article> findArticleByTags(String tags_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContentImg
	 *
	 */
	public Set<Article> findArticleByContentImg(String contentImg_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByContentImg
	 *
	 */
	public Set<Article> findArticleByContentImg(String contentImg_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleImg
	 *
	 */
	public Set<Article> findArticleByTitleImg(String titleImg_1) throws DataAccessException;

	/**
	 * JPQL Query - findArticleByTitleImg
	 *
	 */
	public Set<Article> findArticleByTitleImg(String titleImg_1, int startResult, int maxRows) throws DataAccessException;

}