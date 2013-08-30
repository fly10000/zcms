package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Channel entities
 * 
 */
public interface ChannelService {

	/**
	 * Return all Channel entity
	 * 
	 */
	public List<Channel> findAllChannels(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Channel entity
	 * 
	 */
	public Integer countChannels();

	/**
	 * Save an existing Channel entity
	 * 
	 */
	public void saveChannel(Channel channel);

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	public void deleteChannel(Channel channel_1);

	/**
	 */
	public Channel findChannelByPrimaryKey(Integer id);

	/**
	 * Save an existing Order entity
	 * 
	 */
	public Channel saveChannelOrders(Integer id_1, Order related_orders);

	/**
	 * Delete an existing Order entity
	 * 
	 */
	public Channel deleteChannelOrders(Integer channel_id, Integer related_orders_id);

	/**
	 * Load an existing Channel entity
	 * 
	 */
	public Set<Channel> loadChannels();
}