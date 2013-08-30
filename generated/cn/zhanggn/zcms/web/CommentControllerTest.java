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
 * Unit test for the <code>CommentController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.CommentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class CommentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>commentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcommentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/commentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

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