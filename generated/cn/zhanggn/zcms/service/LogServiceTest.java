package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Log;

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
public class LogServiceTest {

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
	protected LogService service;

	/**
	 * Instantiates a new LogServiceTest.
	 *
	 */
	public LogServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Log entity
	 * 
	 */
	@Test
	public void findAllLogs() {
		// TODO: JUnit - Populate test inputs for operation: findAllLogs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Log> response = null;
		response = service.findAllLogs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllLogs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findLogByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findLogByPrimaryKey 
		Integer id = 0;
		Log response = null;
		response = service.findLogByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findLogByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Log entity
	 * 
	 */
	@Test
	public void loadLogs() {
		Set<Log> response = null;
		response = service.loadLogs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadLogs
	}

	/**
	 * Operation Unit Test
	 * Save an existing Log entity
	 * 
	 */
	@Test
	public void saveLog() {
		// TODO: JUnit - Populate test inputs for operation: saveLog 
		Log log = new cn.zhanggn.zcms.domain.Log();
		service.saveLog(log);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Log entity
	 * 
	 */
	@Test
	public void deleteLog() {
		// TODO: JUnit - Populate test inputs for operation: deleteLog 
		Log log_1 = new cn.zhanggn.zcms.domain.Log();
		service.deleteLog(log_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Log entity
	 * 
	 */
	@Test
	public void countLogs() {
		Integer response = null;
		response = service.countLogs();
		// TODO: JUnit - Add assertions to test outputs of operation: countLogs
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
