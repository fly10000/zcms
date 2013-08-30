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
 * Unit test for the <code>TestController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.TestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class TestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>testControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettestControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/testController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TestController controller = (TestController) context.getBean("TestController");

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