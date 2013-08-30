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
 * Unit test for the <code>LogController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.LogController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class LogControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLog()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLog() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLog");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>logControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlogControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/logController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LogController controller = (LogController) context.getBean("LogController");

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