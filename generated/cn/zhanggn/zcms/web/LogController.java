package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.LogDAO;

import cn.zhanggn.zcms.domain.Log;

import cn.zhanggn.zcms.service.LogService;

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
 * Spring MVC controller that handles CRUD requests for Log entities
 * 
 */

@Controller("LogController")
public class LogController {

	/**
	 * DAO injected by Spring that manages Log entities
	 * 
	 */
	@Autowired
	private LogDAO logDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Log entities
	 * 
	 */
	@Autowired
	private LogService logService;

	/**
	 * Show all Log entities
	 * 
	 */
	@RequestMapping("/indexLog")
	public ModelAndView listLogs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("logs", logService.loadLogs());

		mav.setViewName("log/listLogs.jsp");

		return mav;
	}

	/**
	 * Create a new Log entity
	 * 
	 */
	@RequestMapping("/newLog")
	public ModelAndView newLog() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("log", new Log());
		mav.addObject("newFlag", true);
		mav.setViewName("log/editLog.jsp");

		return mav;
	}

	/**
	 * Select an existing Log entity
	 * 
	 */
	@RequestMapping("/selectLog")
	public ModelAndView selectLog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("log", logDAO.findLogByPrimaryKey(idKey));
		mav.setViewName("log/viewLog.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/logController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Log entities
	 * 
	 */
	public String indexLog() {
		return "redirect:/indexLog";
	}

	/**
	 * Save an existing Log entity
	 * 
	 */
	@RequestMapping("/saveLog")
	public String saveLog(@ModelAttribute Log log) {
		logService.saveLog(log);
		return "forward:/indexLog";
	}

	/**
	 * Delete an existing Log entity
	 * 
	 */
	@RequestMapping("/deleteLog")
	public String deleteLog(@RequestParam Integer idKey) {
		Log log = logDAO.findLogByPrimaryKey(idKey);
		logService.deleteLog(log);
		return "forward:/indexLog";
	}

	/**
	 * Edit an existing Log entity
	 * 
	 */
	@RequestMapping("/editLog")
	public ModelAndView editLog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("log", logDAO.findLogByPrimaryKey(idKey));
		mav.setViewName("log/editLog.jsp");

		return mav;
	}

	/**
	 * Select the Log entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteLog")
	public ModelAndView confirmDeleteLog(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("log", logDAO.findLogByPrimaryKey(idKey));
		mav.setViewName("log/deleteLog.jsp");

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
}