package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.UserDAO;

import cn.zhanggn.zcms.domain.User;

import cn.zhanggn.zcms.service.UserService;

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
 * Spring MVC controller that handles CRUD requests for User entities
 * 
 */

@Controller("UserController")
public class UserController {

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for User entities
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * Show all User entities
	 * 
	 */
	@RequestMapping("/indexUser")
	public ModelAndView listUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("users", userService.loadUsers());

		mav.setViewName("user/listUsers.jsp");

		return mav;
	}

	/**
	 * Edit an existing User entity
	 * 
	 */
	@RequestMapping("/editUser")
	public ModelAndView editUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/editUser.jsp");

		return mav;
	}

	/**
	 * Select an existing User entity
	 * 
	 */
	@RequestMapping("/selectUser")
	public ModelAndView selectUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/viewUser.jsp");

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
	 * Select the User entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUser")
	public ModelAndView confirmDeleteUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", userDAO.findUserByPrimaryKey(idKey));
		mav.setViewName("user/deleteUser.jsp");

		return mav;
	}

	/**
	 * Entry point to show all User entities
	 * 
	 */
	public String indexUser() {
		return "redirect:/indexUser";
	}

	/**
	 */
	@RequestMapping("/userController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "forward:/indexUser";
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam Integer idKey) {
		User user = userDAO.findUserByPrimaryKey(idKey);
		userService.deleteUser(user);
		return "forward:/indexUser";
	}

	/**
	 * Create a new User entity
	 * 
	 */
	@RequestMapping("/newUser")
	public ModelAndView newUser() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("user", new User());
		mav.addObject("newFlag", true);
		mav.setViewName("user/editUser.jsp");

		return mav;
	}
}