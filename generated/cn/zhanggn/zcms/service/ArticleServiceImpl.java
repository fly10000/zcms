package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.ArticleDAO;

import cn.zhanggn.zcms.domain.Article;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Article entities
 * 
 */

@Service("ArticleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {

	/**
	 * DAO injected by Spring that manages Article entities
	 * 
	 */
	@Autowired
	private ArticleDAO articleDAO;

	/**
	 * Instantiates a new ArticleServiceImpl.
	 *
	 */
	public ArticleServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Article findArticleByPrimaryKey(Integer id) {
		return articleDAO.findArticleByPrimaryKey(id);
	}

	/**
	 * Return a count of all Article entity
	 * 
	 */
	@Transactional
	public Integer countArticles() {
		return ((Long) articleDAO.createQuerySingleResult("select count(o) from Article o").getSingleResult()).intValue();
	}

	/**
	 * Return all Article entity
	 * 
	 */
	@Transactional
	public List<Article> findAllArticles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Article>(articleDAO.findAllArticles(startResult, maxRows));
	}

	/**
	 * Delete an existing Article entity
	 * 
	 */
	@Transactional
	public void deleteArticle(Article article) {
		articleDAO.remove(article);
		articleDAO.flush();
	}

	/**
	 * Load an existing Article entity
	 * 
	 */
	@Transactional
	public Set<Article> loadArticles() {
		return articleDAO.findAllArticles();
	}

	/**
	 * Save an existing Article entity
	 * 
	 */
	@Transactional
	public void saveArticle(Article article) {
		Article existingArticle = articleDAO.findArticleByPrimaryKey(article.getId());

		if (existingArticle != null) {
			if (existingArticle != article) {
				existingArticle.setId(article.getId());
				existingArticle.setAuthor(article.getAuthor());
				existingArticle.setCheckDate(article.getCheckDate());
				existingArticle.setCheckState(article.getCheckState());
				existingArticle.setCommentCount(article.getCommentCount());
				existingArticle.setCommentState(article.getCommentState());
				existingArticle.setContent(article.getContent());
				existingArticle.setContentImg(article.getContentImg());
				existingArticle.setDisableDate(article.getDisableDate());
				existingArticle.setOrigin(article.getOrigin());
				existingArticle.setRecommendLevel(article.getRecommendLevel());
				existingArticle.setRelatedId(article.getRelatedId());
				existingArticle.setReleaseDate(article.getReleaseDate());
				existingArticle.setReleaseSysDate(article.getReleaseSysDate());
				existingArticle.setSummary(article.getSummary());
				existingArticle.setTags(article.getTags());
				existingArticle.setTitle(article.getTitle());
				existingArticle.setTitleImg(article.getTitleImg());
				existingArticle.setVisitTotal(article.getVisitTotal());
				existingArticle.setChannelId(article.getChannelId());
				existingArticle.setGroupId(article.getGroupId());
				existingArticle.setUserId(article.getUserId());
				existingArticle.setSysDate(article.getSysDate());
			}
			article = articleDAO.store(existingArticle);
		} else {
			article = articleDAO.store(article);
		}
		articleDAO.flush();
	}
}
