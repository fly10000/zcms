package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.User;

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
public class UserServiceTest {

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
	protected UserService service;

	/**
	 * Instantiates a new UserServiceTest.
	 *
	 */
	public UserServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUserByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUserByPrimaryKey 
		Integer id = 0;
		User response = null;
		response = service.findUserByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findUserByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all User entity
	 * 
	 */
	@Test
	public void countUsers() {
		Integer response = null;
		response = service.countUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsers
	}

	/**
	 * Operation Unit Test
	 * Load an existing User entity
	 * 
	 */
	@Test
	public void loadUsers() {
		Set<User> response = null;
		response = service.loadUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsers
	}

	/**
	 * Operation Unit Test
	 * Return all User entity
	 * 
	 */
	@Test
	public void findAllUsers() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<User> response = null;
		response = service.findAllUsers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing User entity
	 * 
	 */
	@Test
	public void deleteUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteUser 
		User user = new cn.zhanggn.zcms.domain.User();
		service.deleteUser(user);
	}

	/**
	 * Operation Unit Test
	 * Save an existing User entity
	 * 
	 */
	@Test
	public void saveUser() {
		// TODO: JUnit - Populate test inputs for operation: saveUser 
		User user_1 = new cn.zhanggn.zcms.domain.User();
		service.saveUser(user_1);
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
