package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

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
public class OrderServiceTest {

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
	protected OrderService service;

	/**
	 * Instantiates a new OrderServiceTest.
	 *
	 */
	public OrderServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Order entity
	 * 
	 */
	@Test
	public void findAllOrders() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrders 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Order> response = null;
		response = service.findAllOrders(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity
	 * 
	 */
	@Test
	public void deleteOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrder 
		Order order = new cn.zhanggn.zcms.domain.Order();
		service.deleteOrder(order);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderByPrimaryKey 
		Integer id = 0;
		Order response = null;
		response = service.findOrderByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Channel entity
	 * 
	 */
	@Test
	public void saveOrderChannel() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderChannel 
		Integer id_1 = 0;
		Channel related_channel = new cn.zhanggn.zcms.domain.Channel();
		Order response = null;
		response = service.saveOrderChannel(id_1, related_channel);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderChannel
	}

	/**
	 * Operation Unit Test
	 * Load an existing Order entity
	 * 
	 */
	@Test
	public void loadOrders() {
		Set<Order> response = null;
		response = service.loadOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Channel entity
	 * 
	 */
	@Test
	public void deleteOrderChannel() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderChannel 
		Integer order_id = 0;
		Integer related_channel_id = 0;
		Order response = null;
		response = service.deleteOrderChannel(order_id, related_channel_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderChannel
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Order entity
	 * 
	 */
	@Test
	public void countOrders() {
		Integer response = null;
		response = service.countOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrders
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity
	 * 
	 */
	@Test
	public void saveOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveOrder 
		Order order_1 = new cn.zhanggn.zcms.domain.Order();
		service.saveOrder(order_1);
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
