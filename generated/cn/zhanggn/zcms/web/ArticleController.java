package cn.zhanggn.zcms.web;

import cn.zhanggn.zcms.dao.ArticleDAO;

import cn.zhanggn.zcms.domain.Article;

import cn.zhanggn.zcms.service.ArticleService;

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
 * Spring MVC controller that handles CRUD requests for Article entities
 * 
 */

@Controller("ArticleController")
public class ArticleController {

	/**
	 * DAO injected by Spring that manages Article entities
	 * 
	 */
	@Autowired
	private ArticleDAO articleDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Article entities
	 * 
	 */
	@Autowired
	private ArticleService articleService;

	/**
	 * Show all Article entities
	 * 
	 */
	@RequestMapping("/indexArticle")
	public ModelAndView listArticles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("articles", articleService.loadArticles());

		mav.setViewName("article/listArticles.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Article entities
	 * 
	 */
	public String indexArticle() {
		return "redirect:/indexArticle";
	}

	/**
	 */
	@RequestMapping("/articleController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Article entity
	 * 
	 */
	@RequestMapping("/saveArticle")
	public String saveArticle(@ModelAttribute Article article) {
		articleService.saveArticle(article);
		return "forward:/indexArticle";
	}

	/**
	 * Edit an existing Article entity
	 * 
	 */
	@RequestMapping("/editArticle")
	public ModelAndView editArticle(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("article", articleDAO.findArticleByPrimaryKey(idKey));
		mav.setViewName("article/editArticle.jsp");

		return mav;
	}

	/**
	 * Create a new Article entity
	 * 
	 */
	@RequestMapping("/newArticle")
	public ModelAndView newArticle() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("article", new Article());
		mav.addObject("newFlag", true);
		mav.setViewName("article/editArticle.jsp");

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
	 * Delete an existing Article entity
	 * 
	 */
	@RequestMapping("/deleteArticle")
	public String deleteArticle(@RequestParam Integer idKey) {
		Article article = articleDAO.findArticleByPrimaryKey(idKey);
		articleService.deleteArticle(article);
		return "forward:/indexArticle";
	}

	/**
	 * Select the Article entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteArticle")
	public ModelAndView confirmDeleteArticle(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("article", articleDAO.findArticleByPrimaryKey(idKey));
		mav.setViewName("article/deleteArticle.jsp");

		return mav;
	}

	/**
	 * Select an existing Article entity
	 * 
	 */
	@RequestMapping("/selectArticle")
	public ModelAndView selectArticle(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("article", articleDAO.findArticleByPrimaryKey(idKey));
		mav.setViewName("article/viewArticle.jsp");

		return mav;
	}
}