package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.ChannelDAO;
import cn.zhanggn.zcms.dao.OrderDAO;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

import cn.zhanggn.zcms.service.ChannelService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Channel entities
 * 
 */

@Controller("ChannelController")
public class ChannelController {

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
	 * Service injected by Spring that provides CRUD operations for Channel entities
	 * 
	 */
	@Autowired
	private ChannelService channelService;

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editChannelOrders")
	public ModelAndView editChannelOrders(@RequestParam Integer channel_id, @RequestParam Integer orders_id) {
		Order order = orderDAO.findOrderByPrimaryKey(orders_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("channel_id", channel_id);
		mav.addObject("order", order);
		mav.setViewName("channel/orders/editOrders.jsp");

		return mav;
	}

	/**
	 * Show all Channel entities
	 * 
	 */
	@RequestMapping("/indexChannel")
	public ModelAndView listChannels() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channels", channelService.loadChannels());

		mav.setViewName("channel/listChannels.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newChannelOrders")
	public ModelAndView newChannelOrders(@RequestParam Integer channel_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("channel_id", channel_id);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("channel/orders/editOrders.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Edit an existing Channel entity
	 * 
	 */
	@RequestMapping("/editChannel")
	public ModelAndView editChannel(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", channelDAO.findChannelByPrimaryKey(idKey));
		mav.setViewName("channel/editChannel.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/channelController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Channel entity
	 * 
	 */
	@RequestMapping("/saveChannel")
	public String saveChannel(@ModelAttribute Channel channel) {
		channelService.saveChannel(channel);
		return "forward:/indexChannel";
	}

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	@RequestMapping("/deleteChannel")
	public String deleteChannel(@RequestParam Integer idKey) {
		Channel channel = channelDAO.findChannelByPrimaryKey(idKey);
		channelService.deleteChannel(channel);
		return "forward:/indexChannel";
	}

	/**
	 * Show all Order entities by Channel
	 * 
	 */
	@RequestMapping("/listChannelOrders")
	public ModelAndView listChannelOrders(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", channelDAO.findChannelByPrimaryKey(idKey));
		mav.setViewName("channel/orders/listOrders.jsp");

		return mav;
	}

	/**
	 * Select an existing Channel entity
	 * 
	 */
	@RequestMapping("/selectChannel")
	public ModelAndView selectChannel(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", channelDAO.findChannelByPrimaryKey(idKey));
		mav.setViewName("channel/viewChannel.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteChannelOrders")
	public ModelAndView deleteChannelOrders(@RequestParam Integer channel_id, @RequestParam Integer related_orders_id) {
		ModelAndView mav = new ModelAndView();

		Channel channel = channelService.deleteChannelOrders(channel_id, related_orders_id);

		mav.addObject("channel_id", channel_id);
		mav.addObject("channel", channel);
		mav.setViewName("channel/viewChannel.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Channel entities
	 * 
	 */
	public String indexChannel() {
		return "redirect:/indexChannel";
	}

	/**
	 * Select the Channel entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteChannel")
	public ModelAndView confirmDeleteChannel(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", channelDAO.findChannelByPrimaryKey(idKey));
		mav.setViewName("channel/deleteChannel.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping("/selectChannelOrders")
	public ModelAndView selectChannelOrders(@RequestParam Integer channel_id, @RequestParam Integer orders_id) {
		Order order = orderDAO.findOrderByPrimaryKey(orders_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("channel_id", channel_id);
		mav.addObject("order", order);
		mav.setViewName("channel/orders/viewOrders.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveChannelOrders")
	public ModelAndView saveChannelOrders(@RequestParam Integer channel_id, @ModelAttribute Order orders) {
		Channel parent_channel = channelService.saveChannelOrders(channel_id, orders);

		ModelAndView mav = new ModelAndView();
		mav.addObject("channel_id", channel_id);
		mav.addObject("channel", parent_channel);
		mav.setViewName("channel/viewChannel.jsp");

		return mav;
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteChannelOrders")
	public ModelAndView confirmDeleteChannelOrders(@RequestParam Integer channel_id, @RequestParam Integer related_orders_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_orders_id));
		mav.addObject("channel_id", channel_id);
		mav.setViewName("channel/orders/deleteOrders.jsp");

		return mav;
	}

	/**
	 * Create a new Channel entity
	 * 
	 */
	@RequestMapping("/newChannel")
	public ModelAndView newChannel() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", new Channel());
		mav.addObject("newFlag", true);
		mav.setViewName("channel/editChannel.jsp");

		return mav;
	}
}