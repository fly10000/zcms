package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.TestDAO;

import cn.zhanggn.zcms.domain.Test;

import cn.zhanggn.zcms.service.TestService;

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
 * Spring MVC controller that handles CRUD requests for Test entities
 * 
 */

@Controller("TestController")
public class TestController {

	/**
	 * DAO injected by Spring that manages Test entities
	 * 
	 */
	@Autowired
	private TestDAO testDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Test entities
	 * 
	 */
	@Autowired
	private TestService testService;

	/**
	 * Save an existing Test entity
	 * 
	 */
	@RequestMapping("/saveTest")
	public String saveTest(@ModelAttribute Test test) {
		testService.saveTest(test);
		return "forward:/indexTest";
	}

	/**
	 * Create a new Test entity
	 * 
	 */
	@RequestMapping("/newTest")
	public ModelAndView newTest() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("test", new Test());
		mav.addObject("newFlag", true);
		mav.setViewName("test/editTest.jsp");

		return mav;
	}

	/**
	 * Edit an existing Test entity
	 * 
	 */
	@RequestMapping("/editTest")
	public ModelAndView editTest(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("test", testDAO.findTestByPrimaryKey(idKey));
		mav.setViewName("test/editTest.jsp");

		return mav;
	}

	/**
	 * Delete an existing Test entity
	 * 
	 */
	@RequestMapping("/deleteTest")
	public String deleteTest(@RequestParam Integer idKey) {
		Test test = testDAO.findTestByPrimaryKey(idKey);
		testService.deleteTest(test);
		return "forward:/indexTest";
	}

	/**
	 * Show all Test entities
	 * 
	 */
	@RequestMapping("/indexTest")
	public ModelAndView listTests() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tests", testService.loadTests());

		mav.setViewName("test/listTests.jsp");

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
	 * Select the Test entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTest")
	public ModelAndView confirmDeleteTest(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("test", testDAO.findTestByPrimaryKey(idKey));
		mav.setViewName("test/deleteTest.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/testController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Test entity
	 * 
	 */
	@RequestMapping("/selectTest")
	public ModelAndView selectTest(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("test", testDAO.findTestByPrimaryKey(idKey));
		mav.setViewName("test/viewTest.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Test entities
	 * 
	 */
	public String indexTest() {
		return "redirect:/indexTest";
	}
}