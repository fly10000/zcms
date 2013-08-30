package cn.zhanggn.zcms.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>ArticleController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.ArticleController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class ArticleControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteArticle()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteArticle() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteArticle");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>articleControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetarticleControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/articleController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArticleController controller = (ArticleController) context.getBean("ArticleController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}