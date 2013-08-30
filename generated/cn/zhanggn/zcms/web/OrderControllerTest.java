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
 * Unit test for the <code>OrderController</code> controller.
 *
 * @see cn.zhanggn.zcms.web.OrderController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/zcms3-security-context.xml",
		"file:./resources/zcms3-service-context.xml",
		"file:./resources/zcms3-dao-context.xml",
		"file:./resources/zcms3-web-context.xml" })
public class OrderControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderChannel()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderChannel() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderChannel");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

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