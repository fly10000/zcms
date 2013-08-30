package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.ConfigDAO;

import cn.zhanggn.zcms.domain.Config;

import cn.zhanggn.zcms.service.ConfigService;

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
 * Spring MVC controller that handles CRUD requests for Config entities
 * 
 */

@Controller("ConfigController")
public class ConfigController {

	/**
	 * DAO injected by Spring that manages Config entities
	 * 
	 */
	@Autowired
	private ConfigDAO configDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Config entities
	 * 
	 */
	@Autowired
	private ConfigService configService;

	/**
	 * Delete an existing Config entity
	 * 
	 */
	@RequestMapping("/deleteConfig")
	public String deleteConfig(@RequestParam Integer idKey) {
		Config config = configDAO.findConfigByPrimaryKey(idKey);
		configService.deleteConfig(config);
		return "forward:/indexConfig";
	}

	/**
	 * Select an existing Config entity
	 * 
	 */
	@RequestMapping("/selectConfig")
	public ModelAndView selectConfig(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("config", configDAO.findConfigByPrimaryKey(idKey));
		mav.setViewName("config/viewConfig.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/configController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Config entity
	 * 
	 */
	@RequestMapping("/editConfig")
	public ModelAndView editConfig(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("config", configDAO.findConfigByPrimaryKey(idKey));
		mav.setViewName("config/editConfig.jsp");

		return mav;
	}

	/**
	 * Save an existing Config entity
	 * 
	 */
	@RequestMapping("/saveConfig")
	public String saveConfig(@ModelAttribute Config config) {
		configService.saveConfig(config);
		return "forward:/indexConfig";
	}

	/**
	 * Select the Config entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteConfig")
	public ModelAndView confirmDeleteConfig(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("config", configDAO.findConfigByPrimaryKey(idKey));
		mav.setViewName("config/deleteConfig.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Config entities
	 * 
	 */
	public String indexConfig() {
		return "redirect:/indexConfig";
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
	 * Show all Config entities
	 * 
	 */
	@RequestMapping("/indexConfig")
	public ModelAndView listConfigs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configs", configService.loadConfigs());

		mav.setViewName("config/listConfigs.jsp");

		return mav;
	}

	/**
	 * Create a new Config entity
	 * 
	 */
	@RequestMapping("/newConfig")
	public ModelAndView newConfig() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("config", new Config());
		mav.addObject("newFlag", true);
		mav.setViewName("config/editConfig.jsp");

		return mav;
	}
}