package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Config;

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
public class ConfigServiceTest {

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
	protected ConfigService service;

	/**
	 * Instantiates a new ConfigServiceTest.
	 *
	 */
	public ConfigServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Config entity
	 * 
	 */
	@Test
	public void deleteConfig() {
		// TODO: JUnit - Populate test inputs for operation: deleteConfig 
		Config config = new cn.zhanggn.zcms.domain.Config();
		service.deleteConfig(config);
	}

	/**
	 * Operation Unit Test
	 * Return all Config entity
	 * 
	 */
	@Test
	public void findAllConfigs() {
		// TODO: JUnit - Populate test inputs for operation: findAllConfigs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Config> response = null;
		response = service.findAllConfigs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllConfigs
	}

	/**
	 * Operation Unit Test
	 * Save an existing Config entity
	 * 
	 */
	@Test
	public void saveConfig() {
		// TODO: JUnit - Populate test inputs for operation: saveConfig 
		Config config_1 = new cn.zhanggn.zcms.domain.Config();
		service.saveConfig(config_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findConfigByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findConfigByPrimaryKey 
		Integer id = 0;
		Config response = null;
		response = service.findConfigByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findConfigByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Config entity
	 * 
	 */
	@Test
	public void countConfigs() {
		Integer response = null;
		response = service.countConfigs();
		// TODO: JUnit - Add assertions to test outputs of operation: countConfigs
	}

	/**
	 * Operation Unit Test
	 * Load an existing Config entity
	 * 
	 */
	@Test
	public void loadConfigs() {
		Set<Config> response = null;
		response = service.loadConfigs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadConfigs
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
