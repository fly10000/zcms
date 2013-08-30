package cn.zhanggn.zcms.service;

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
public class TestServiceTest {

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
	protected TestService service;

	/**
	 * Instantiates a new TestServiceTest.
	 *
	 */
	public TestServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Test entity
	 * 
	 */
	@Test
	public void findAllTests() {
		// TODO: JUnit - Populate test inputs for operation: findAllTests 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<cn.zhanggn.zcms.domain.Test> response = null;
		response = service.findAllTests(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTests
	}

	/**
	 * Operation Unit Test
	 * Save an existing Test entity
	 * 
	 */
	@Test
	public void saveTest() {
		// TODO: JUnit - Populate test inputs for operation: saveTest 
		cn.zhanggn.zcms.domain.Test test = new cn.zhanggn.zcms.domain.Test();
		service.saveTest(test);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Test entity
	 * 
	 */
	@Test
	public void countTests() {
		Integer response = null;
		response = service.countTests();
		// TODO: JUnit - Add assertions to test outputs of operation: countTests
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTestByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTestByPrimaryKey 
		Integer id = 0;
		cn.zhanggn.zcms.domain.Test response = null;
		response = service.findTestByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findTestByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Test entity
	 * 
	 */
	@Test
	public void deleteTest() {
		// TODO: JUnit - Populate test inputs for operation: deleteTest 
		cn.zhanggn.zcms.domain.Test test_1 = new cn.zhanggn.zcms.domain.Test();
		service.deleteTest(test_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Test entity
	 * 
	 */
	@Test
	public void loadTests() {
		Set<cn.zhanggn.zcms.domain.Test> response = null;
		response = service.loadTests();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTests
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
