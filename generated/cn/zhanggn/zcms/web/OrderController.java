package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.ChannelDAO;
import cn.zhanggn.zcms.dao.OrderDAO;

import cn.zhanggn.zcms.domain.Channel;
import cn.zhanggn.zcms.domain.Order;

import cn.zhanggn.zcms.service.OrderService;

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
 * Spring MVC controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderController")
public class OrderController {

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
	 * Service injected by Spring that provides CRUD operations for Order entities
	 * 
	 */
	@Autowired
	private OrderService orderService;

	/**
	 * Select the child Channel entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderChannel")
	public ModelAndView confirmDeleteOrderChannel(@RequestParam Integer order_id, @RequestParam Integer related_channel_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("channel", channelDAO.findChannelByPrimaryKey(related_channel_id));
		mav.addObject("order_id", order_id);
		mav.setViewName("order/channel/deleteChannel.jsp");

		return mav;
	}

	/**
	 * Show all Channel entities by Order
	 * 
	 */
	@RequestMapping("/listOrderChannel")
	public ModelAndView listOrderChannel(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/channel/listChannel.jsp");

		return mav;
	}

	/**
	 * Select an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrder")
	public ModelAndView selectOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Save an existing Channel entity
	 * 
	 */
	@RequestMapping("/saveOrderChannel")
	public ModelAndView saveOrderChannel(@RequestParam Integer order_id, @ModelAttribute Channel channel) {
		Order parent_order = orderService.saveOrderChannel(order_id, channel);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Show all Order entities
	 * 
	 */
	@RequestMapping("/indexOrder")
	public ModelAndView listOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orders", orderService.loadOrders());

		mav.setViewName("order/listOrders.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrder")
	public ModelAndView newOrder() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing Channel entity
	 * 
	 */
	@RequestMapping("/deleteOrderChannel")
	public ModelAndView deleteOrderChannel(@RequestParam Integer order_id, @RequestParam Integer related_channel_id) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderChannel(order_id, related_channel_id);

		mav.addObject("order_id", order_id);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Create a new Channel entity
	 * 
	 */
	@RequestMapping("/newOrderChannel")
	public ModelAndView newOrderChannel(@RequestParam Integer order_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("channel", new Channel());
		mav.addObject("newFlag", true);
		mav.setViewName("order/channel/editChannel.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Order entities
	 * 
	 */
	public String indexOrder() {
		return "redirect:/indexOrder";
	}

	/**
	 * View an existing Channel entity
	 * 
	 */
	@RequestMapping("/selectOrderChannel")
	public ModelAndView selectOrderChannel(@RequestParam Integer order_id, @RequestParam Integer channel_id) {
		Channel channel = channelDAO.findChannelByPrimaryKey(channel_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("channel", channel);
		mav.setViewName("order/channel/viewChannel.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrder")
	public String saveOrder(@ModelAttribute Order order) {
		orderService.saveOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrder")
	public ModelAndView editOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Edit an existing Channel entity
	 * 
	 */
	@RequestMapping("/editOrderChannel")
	public ModelAndView editOrderChannel(@RequestParam Integer order_id, @RequestParam Integer channel_id) {
		Channel channel = channelDAO.findChannelByPrimaryKey(channel_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("channel", channel);
		mav.setViewName("order/channel/editChannel.jsp");

		return mav;
	}

	/**
	 * Select the Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrder")
	public ModelAndView confirmDeleteOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Integer idKey) {
		Order order = orderDAO.findOrderByPrimaryKey(idKey);
		orderService.deleteOrder(order);
		return "forward:/indexOrder";
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
	 */
	@RequestMapping("/orderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}