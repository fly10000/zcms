package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Group;

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
public class GroupServiceTest {

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
	protected GroupService service;

	/**
	 * Instantiates a new GroupServiceTest.
	 *
	 */
	public GroupServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Group entity
	 * 
	 */
	@Test
	public void findAllGroups() {
		// TODO: JUnit - Populate test inputs for operation: findAllGroups 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Group> response = null;
		response = service.findAllGroups(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGroups
	}

	/**
	 * Operation Unit Test
	 * Save an existing Group entity
	 * 
	 */
	@Test
	public void saveGroup() {
		// TODO: JUnit - Populate test inputs for operation: saveGroup 
		Group group = new cn.zhanggn.zcms.domain.Group();
		service.saveGroup(group);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Group entity
	 * 
	 */
	@Test
	public void deleteGroup() {
		// TODO: JUnit - Populate test inputs for operation: deleteGroup 
		Group group_1 = new cn.zhanggn.zcms.domain.Group();
		service.deleteGroup(group_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGroupByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGroupByPrimaryKey 
		Integer id = 0;
		Group response = null;
		response = service.findGroupByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findGroupByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Group entity
	 * 
	 */
	@Test
	public void countGroups() {
		Integer response = null;
		response = service.countGroups();
		// TODO: JUnit - Add assertions to test outputs of operation: countGroups
	}

	/**
	 * Operation Unit Test
	 * Load an existing Group entity
	 * 
	 */
	@Test
	public void loadGroups() {
		Set<Group> response = null;
		response = service.loadGroups();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGroups
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
