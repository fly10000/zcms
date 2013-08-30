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
 * Spring service that handles CRUD requests for Channel entities
 * 
 */

@Service("ChannelService")
@Transactional
public class ChannelServiceImpl implements ChannelService {

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
	 * Instantiates a new ChannelServiceImpl.
	 *
	 */
	public ChannelServiceImpl() {
	}

	/**
	 * Return all Channel entity
	 * 
	 */
	@Transactional
	public List<Channel> findAllChannels(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Channel>(channelDAO.findAllChannels(startResult, maxRows));
	}

	/**
	 * Return a count of all Channel entity
	 * 
	 */
	@Transactional
	public Integer countChannels() {
		return ((Long) channelDAO.createQuerySingleResult("select count(o) from Channel o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Channel entity
	 * 
	 */
	@Transactional
	public void saveChannel(Channel channel) {
		Channel existingChannel = channelDAO.findChannelByPrimaryKey(channel.getId());

		if (existingChannel != null) {
			if (existingChannel != channel) {
				existingChannel.setId(channel.getId());
				existingChannel.setDisplay(channel.getDisplay());
				existingChannel.setDisplayInIndex(channel.getDisplayInIndex());
				existingChannel.setInfo(channel.getInfo());
				existingChannel.setName(channel.getName());
				existingChannel.setRankId(channel.getRankId());
				existingChannel.setSingle(channel.getSingle());
				existingChannel.setVisitTotal(channel.getVisitTotal());
				existingChannel.setFatherId(channel.getFatherId());
				existingChannel.setCheckState(channel.getCheckState());
				existingChannel.setSysDate(channel.getSysDate());
			}
			channel = channelDAO.store(existingChannel);
		} else {
			channel = channelDAO.store(channel);
		}
		channelDAO.flush();
	}

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	@Transactional
	public void deleteChannel(Channel channel) {
		channelDAO.remove(channel);
		channelDAO.flush();
	}

	/**
	 */
	@Transactional
	public Channel findChannelByPrimaryKey(Integer id) {
		return channelDAO.findChannelByPrimaryKey(id);
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Channel saveChannelOrders(Integer id, Order related_orders) {
		Channel channel = channelDAO.findChannelByPrimaryKey(id, -1, -1);
		Order existingorders = orderDAO.findOrderByPrimaryKey(related_orders.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorders != null) {
			existingorders.setId(related_orders.getId());
			existingorders.setAddress(related_orders.getAddress());
			existingorders.setDanwei(related_orders.getDanwei());
			existingorders.setName(related_orders.getName());
			existingorders.setNum(related_orders.getNum());
			existingorders.setOther(related_orders.getOther());
			existingorders.setReleaseDate(related_orders.getReleaseDate());
			existingorders.setSysDate(related_orders.getSysDate());
			existingorders.setTel(related_orders.getTel());
			existingorders.setTime(related_orders.getTime());
			related_orders = existingorders;
		} else {
			related_orders = orderDAO.store(related_orders);
			orderDAO.flush();
		}

		related_orders.setChannel(channel);
		channel.getOrders().add(related_orders);
		related_orders = orderDAO.store(related_orders);
		orderDAO.flush();

		channel = channelDAO.store(channel);
		channelDAO.flush();

		return channel;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Channel deleteChannelOrders(Integer channel_id, Integer related_orders_id) {
		Order related_orders = orderDAO.findOrderByPrimaryKey(related_orders_id, -1, -1);

		Channel channel = channelDAO.findChannelByPrimaryKey(channel_id, -1, -1);

		related_orders.setChannel(null);
		channel.getOrders().remove(related_orders);

		orderDAO.remove(related_orders);
		orderDAO.flush();

		return channel;
	}

	/**
	 * Load an existing Channel entity
	 * 
	 */
	@Transactional
	public Set<Channel> loadChannels() {
		return channelDAO.findAllChannels();
	}
}
