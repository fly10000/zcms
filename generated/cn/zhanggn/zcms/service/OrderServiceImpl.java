package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.ChannelDAO;
import cn.zhanggn.zcms.dao.OrderDAO;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */

@Service("OrderService")
@Transactional
public class OrderServiceImpl implements OrderService {

	/**
	 * DAO injected by Spring that manages Channel entities
	 * 
	 */
	@Autowired
	private ChannelDAO channelDAO;

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * Instantiates a new OrderServiceImpl.
	 *
	 */
	public OrderServiceImpl() {
	}

	/**
	 * Return all Order entity
	 * 
	 */
	@Transactional
	public List<Order> findAllOrders(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Order>(orderDAO.findAllOrders(startResult, maxRows));
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public void deleteOrder(Order order) {
		orderDAO.remove(order);
		orderDAO.flush();
	}

	/**
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer id) {
		return orderDAO.findOrderByPrimaryKey(id);
	}

	/**
	 * Save an existing Channel entity
	 * 
	 */
	@Transactional
	public Order saveOrderChannel(Integer id, Channel related_channel) {
		Order order = orderDAO.findOrderByPrimaryKey(id, -1, -1);
		Channel existingchannel = channelDAO.findChannelByPrimaryKey(related_channel.getId());

		// copy into the existing record to preserve existing relationships
		if (existingchannel != null) {
			existingchannel.setId(related_channel.getId());
			existingchannel.setDisplay(related_channel.getDisplay());
			existingchannel.setDisplayInIndex(related_channel.getDisplayInIndex());
			existingchannel.setInfo(related_channel.getInfo());
			existingchannel.setName(related_channel.getName());
			existingchannel.setRankId(related_channel.getRankId());
			existingchannel.setSingle(related_channel.getSingle());
			existingchannel.setVisitTotal(related_channel.getVisitTotal());
			existingchannel.setFatherId(related_channel.getFatherId());
			existingchannel.setCheckState(related_channel.getCheckState());
			existingchannel.setSysDate(related_channel.getSysDate());
			related_channel = existingchannel;
		} else {
			related_channel = channelDAO.store(related_channel);
			channelDAO.flush();
		}

		order.setChannel(related_channel);
		related_channel.getOrders().add(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_channel = channelDAO.store(related_channel);
		channelDAO.flush();

		return order;
	}

	/**
	 * Load an existing Order entity
	 * 
	 */
	@Transactional
	public Set<Order> loadOrders() {
		return orderDAO.findAllOrders();
	}

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	@Transactional
	public Order deleteOrderChannel(Integer order_id, Integer related_channel_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);
		Channel related_channel = channelDAO.findChannelByPrimaryKey(related_channel_id, -1, -1);

		order.setChannel(null);
		related_channel.getOrders().remove(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_channel = channelDAO.store(related_channel);
		channelDAO.flush();

		channelDAO.remove(related_channel);
		channelDAO.flush();

		return order;
	}

	/**
	 * Return a count of all Order entity
	 * 
	 */
	@Transactional
	public Integer countOrders() {
		return ((Long) orderDAO.createQuerySingleResult("select count(o) from Order o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public void saveOrder(Order order) {
		Order existingOrder = orderDAO.findOrderByPrimaryKey(order.getId());

		if (existingOrder != null) {
			if (existingOrder != order) {
				existingOrder.setId(order.getId());
				existingOrder.setAddress(order.getAddress());
				existingOrder.setDanwei(order.getDanwei());
				existingOrder.setName(order.getName());
				existingOrder.setNum(order.getNum());
				existingOrder.setOther(order.getOther());
				existingOrder.setReleaseDate(order.getReleaseDate());
				existingOrder.setSysDate(order.getSysDate());
				existingOrder.setTel(order.getTel());
				existingOrder.setTime(order.getTime());
			}
			order = orderDAO.store(existingOrder);
		} else {
			order = orderDAO.store(order);
		}
		orderDAO.flush();
	}
}
