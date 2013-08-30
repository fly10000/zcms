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
 * Unit test for the <code>ConfigController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.ConfigController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class ConfigControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteConfig()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteConfig() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteConfig");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>configControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfigControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/configController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigController controller = (ConfigController) context.getBean("ConfigController");

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