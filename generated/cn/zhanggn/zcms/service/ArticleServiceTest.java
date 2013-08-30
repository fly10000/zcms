package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Article;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
@Transactional
public class ArticleServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ArticleService service;

	/**
	 * Instantiates a new ArticleServiceTest.
	 *
	 */
	public ArticleServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findArticleByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findArticleByPrimaryKey 
		Integer id = 0;
		Article response = null;
		response = service.findArticleByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findArticleByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Article entity
	 * 
	 */
	@Test
	public void countArticles() {
		Integer response = null;
		response = service.countArticles();
		// TODO: JUnit - Add assertions to test outputs of operation: countArticles
	}

	/**
	 * Operation Unit Test
	 * Return all Article entity
	 * 
	 */
	@Test
	public void findAllArticles() {
		// TODO: JUnit - Populate test inputs for operation: findAllArticles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Article> response = null;
		response = service.findAllArticles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllArticles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Article entity
	 * 
	 */
	@Test
	public void deleteArticle() {
		// TODO: JUnit - Populate test inputs for operation: deleteArticle 
		Article article = new cn.zhanggn.zcms.domain.Article();
		service.deleteArticle(article);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Article entity
	 * 
	 */
	@Test
	public void loadArticles() {
		Set<Article> response = null;
		response = service.loadArticles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadArticles
	}

	/**
	 * Operation Unit Test
	 * Save an existing Article entity
	 * 
	 */
	@Test
	public void saveArticle() {
		// TODO: JUnit - Populate test inputs for operation: saveArticle 
		Article article_1 = new cn.zhanggn.zcms.domain.Article();
		service.saveArticle(article_1);
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
