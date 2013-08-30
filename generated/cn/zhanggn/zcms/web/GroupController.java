package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.GroupDAO;

import cn.zhanggn.zcms.domain.Group;

import cn.zhanggn.zcms.service.GroupService;

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
 * Spring MVC controller that handles CRUD requests for Group entities
 * 
 */

@Controller("GroupController")
public class GroupController {

	/**
	 * DAO injected by Spring that manages Group entities
	 * 
	 */
	@Autowired
	private GroupDAO groupDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Group entities
	 * 
	 */
	@Autowired
	private GroupService groupService;

	/**
	 * Select an existing Group entity
	 * 
	 */
	@RequestMapping("/selectGroup")
	public ModelAndView selectGroup(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("group", groupDAO.findGroupByPrimaryKey(idKey));
		mav.setViewName("group/viewGroup.jsp");

		return mav;
	}

	/**
	 * Edit an existing Group entity
	 * 
	 */
	@RequestMapping("/editGroup")
	public ModelAndView editGroup(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("group", groupDAO.findGroupByPrimaryKey(idKey));
		mav.setViewName("group/editGroup.jsp");

		return mav;
	}

	/**
	 * Select the Group entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGroup")
	public ModelAndView confirmDeleteGroup(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("group", groupDAO.findGroupByPrimaryKey(idKey));
		mav.setViewName("group/deleteGroup.jsp");

		return mav;
	}

	/**
	 * Show all Group entities
	 * 
	 */
	@RequestMapping("/indexGroup")
	public ModelAndView listGroups() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("groups", groupService.loadGroups());

		mav.setViewName("group/listGroups.jsp");

		return mav;
	}

	/**
	 * Delete an existing Group entity
	 * 
	 */
	@RequestMapping("/deleteGroup")
	public String deleteGroup(@RequestParam Integer idKey) {
		Group group = groupDAO.findGroupByPrimaryKey(idKey);
		groupService.deleteGroup(group);
		return "forward:/indexGroup";
	}

	/**
	 * Create a new Group entity
	 * 
	 */
	@RequestMapping("/newGroup")
	public ModelAndView newGroup() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("group", new Group());
		mav.addObject("newFlag", true);
		mav.setViewName("group/editGroup.jsp");

		return mav;
	}

	/**
	 * Save an existing Group entity
	 * 
	 */
	@RequestMapping("/saveGroup")
	public String saveGroup(@ModelAttribute Group group) {
		groupService.saveGroup(group);
		return "forward:/indexGroup";
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
	@RequestMapping("/groupController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Group entities
	 * 
	 */
	public String indexGroup() {
		return "redirect:/indexGroup";
	}
}