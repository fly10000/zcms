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
public class ChannelServiceTest {

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
	protected ChannelService service;

	/**
	 * Instantiates a new ChannelServiceTest.
	 *
	 */
	public ChannelServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Channel entity
	 * 
	 */
	@Test
	public void findAllChannels() {
		// TODO: JUnit - Populate test inputs for operation: findAllChannels 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Channel> response = null;
		response = service.findAllChannels(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllChannels
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Channel entity
	 * 
	 */
	@Test
	public void countChannels() {
		Integer response = null;
		response = service.countChannels();
		// TODO: JUnit - Add assertions to test outputs of operation: countChannels
	}

	/**
	 * Operation Unit Test
	 * Save an existing Channel entity
	 * 
	 */
	@Test
	public void saveChannel() {
		// TODO: JUnit - Populate test inputs for operation: saveChannel 
		Channel channel = new cn.zhanggn.zcms.domain.Channel();
		service.saveChannel(channel);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Channel entity
	 * 
	 */
	@Test
	public void deleteChannel() {
		// TODO: JUnit - Populate test inputs for operation: deleteChannel 
		Channel channel_1 = new cn.zhanggn.zcms.domain.Channel();
		service.deleteChannel(channel_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findChannelByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findChannelByPrimaryKey 
		Integer id = 0;
		Channel response = null;
		response = service.findChannelByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findChannelByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity
	 * 
	 */
	@Test
	public void saveChannelOrders() {
		// TODO: JUnit - Populate test inputs for operation: saveChannelOrders 
		Integer id_1 = 0;
		Order related_orders = new cn.zhanggn.zcms.domain.Order();
		Channel response = null;
		response = service.saveChannelOrders(id_1, related_orders);
		// TODO: JUnit - Add assertions to test outputs of operation: saveChannelOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity
	 * 
	 */
	@Test
	public void deleteChannelOrders() {
		// TODO: JUnit - Populate test inputs for operation: deleteChannelOrders 
		Integer channel_id = 0;
		Integer related_orders_id = 0;
		Channel response = null;
		response = service.deleteChannelOrders(channel_id, related_orders_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteChannelOrders
	}

	/**
	 * Operation Unit Test
	 * Load an existing Channel entity
	 * 
	 */
	@Test
	public void loadChannels() {
		Set<Channel> response = null;
		response = service.loadChannels();
		// TODO: JUnit - Add assertions to test outputs of operation: loadChannels
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
