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
 * Unit test for the <code>GroupController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.GroupController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class GroupControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGroup()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGroup() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGroup");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>groupControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetgroupControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/groupController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GroupController controller = (GroupController) context.getBean("GroupController");

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