package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Comment;

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
public class CommentServiceTest {

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
	protected CommentService service;

	/**
	 * Instantiates a new CommentServiceTest.
	 *
	 */
	public CommentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comment entity
	 * 
	 */
	@Test
	public void deleteComment() {
		// TODO: JUnit - Populate test inputs for operation: deleteComment 
		Comment comment = new cn.zhanggn.zcms.domain.Comment();
		service.deleteComment(comment);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Comment entity
	 * 
	 */
	@Test
	public void countComments() {
		Integer response = null;
		response = service.countComments();
		// TODO: JUnit - Add assertions to test outputs of operation: countComments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comment entity
	 * 
	 */
	@Test
	public void saveComment() {
		// TODO: JUnit - Populate test inputs for operation: saveComment 
		Comment comment_1 = new cn.zhanggn.zcms.domain.Comment();
		service.saveComment(comment_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Comment entity
	 * 
	 */
	@Test
	public void findAllComments() {
		// TODO: JUnit - Populate test inputs for operation: findAllComments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Comment> response = null;
		response = service.findAllComments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllComments
	}

	/**
	 * Operation Unit Test
	 * Load an existing Comment entity
	 * 
	 */
	@Test
	public void loadComments() {
		Set<Comment> response = null;
		response = service.loadComments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadComments
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCommentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCommentByPrimaryKey 
		Integer id = 0;
		Comment response = null;
		response = service.findCommentByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findCommentByPrimaryKey
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
