package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Article;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Article entities
 * 
 */
public interface ArticleService {

	/**
	 */
	public Article findArticleByPrimaryKey(Integer id);

	/**
	 * Return a count of all Article entity
	 * 
	 */
	public Integer countArticles();

	/**
	 * Return all Article entity
	 * 
	 */
	public List<Article> findAllArticles(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Article entity
	 * 
	 */
	public void deleteArticle(Article article);

	/**
	 * Load an existing Article entity
	 * 
	 */
	public Set<Article> loadArticles();

	/**
	 * Save an existing Article entity
	 * 
	 */
	public void saveArticle(Article article_1);
}