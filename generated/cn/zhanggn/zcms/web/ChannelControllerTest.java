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
 * Unit test for the <code>ChannelController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.ChannelController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class ChannelControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listChannelOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistChannelOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listChannelOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>channelControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetchannelControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/channelController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ChannelController controller = (ChannelController) context.getBean("ChannelController");

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