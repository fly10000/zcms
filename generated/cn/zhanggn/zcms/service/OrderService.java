package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */
public interface OrderService {

	/**
	 * Return all Order entity
	 * 
	 */
	public List<Order> findAllOrders(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public void deleteOrder(Order order);

	/**
	 */
	public Order findOrderByPrimaryKey(Integer id);

	/**
	 * Save an existing Channel entity
	 * 
	 */
	public Order saveOrderChannel(Integer id_1, Channel related_channel);

	/**
	 * Load an existing Order entity
	 * 
	 */
	public Set<Order> loadOrders();

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	public Order deleteOrderChannel(Integer order_id, Integer related_channel_id);

	/**
	 * Return a count of all Order entity
	 * 
	 */
	public Integer countOrders();

	/**
	 * Save an existing Order entity
	 * 
	 */
	public void saveOrder(Order order_1);
}