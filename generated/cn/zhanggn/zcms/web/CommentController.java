package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.CommentDAO;

import cn.zhanggn.zcms.domain.Comment;

import cn.zhanggn.zcms.service.CommentService;

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
 * Spring MVC controller that handles CRUD requests for Comment entities
 * 
 */

@Controller("CommentController")
public class CommentController {

	/**
	 * DAO injected by Spring that manages Comment entities
	 * 
	 */
	@Autowired
	private CommentDAO commentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Comment entities
	 * 
	 */
	@Autowired
	private CommentService commentService;

	/**
	 */
	@RequestMapping("/commentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Comment entity
	 * 
	 */
	@RequestMapping("/newComment")
	public ModelAndView newComment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("comment/editComment.jsp");

		return mav;
	}

	/**
	 * Select an existing Comment entity
	 * 
	 */
	@RequestMapping("/selectComment")
	public ModelAndView selectComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(idKey));
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Save an existing Comment entity
	 * 
	 */
	@RequestMapping("/saveComment")
	public String saveComment(@ModelAttribute Comment comment) {
		commentService.saveComment(comment);
		return "forward:/indexComment";
	}

	/**
	 * Entry point to show all Comment entities
	 * 
	 */
	public String indexComment() {
		return "redirect:/indexComment";
	}

	/**
	 * Edit an existing Comment entity
	 * 
	 */
	@RequestMapping("/editComment")
	public ModelAndView editComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(idKey));
		mav.setViewName("comment/editComment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Comment entity
	 * 
	 */
	@RequestMapping("/deleteComment")
	public String deleteComment(@RequestParam Integer idKey) {
		Comment comment = commentDAO.findCommentByPrimaryKey(idKey);
		commentService.deleteComment(comment);
		return "forward:/indexComment";
	}

	/**
	 * Show all Comment entities
	 * 
	 */
	@RequestMapping("/indexComment")
	public ModelAndView listComments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comments", commentService.loadComments());

		mav.setViewName("comment/listComments.jsp");

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
	 * Select the Comment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteComment")
	public ModelAndView confirmDeleteComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(idKey));
		mav.setViewName("comment/deleteComment.jsp");

		return mav;
	}
}