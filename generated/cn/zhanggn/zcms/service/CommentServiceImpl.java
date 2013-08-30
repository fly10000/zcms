package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.CommentDAO;

import cn.zhanggn.zcms.domain.Comment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Comment entities
 * 
 */

@Service("CommentService")
@Transactional
public class CommentServiceImpl implements CommentService {

	/**
	 * DAO injected by Spring that manages Comment entities
	 * 
	 */
	@Autowired
	private CommentDAO commentDAO;

	/**
	 * Instantiates a new CommentServiceImpl.
	 *
	 */
	public CommentServiceImpl() {
	}

	/**
	 * Delete an existing Comment entity
	 * 
	 */
	@Transactional
	public void deleteComment(Comment comment) {
		commentDAO.remove(comment);
		commentDAO.flush();
	}

	/**
	 * Return a count of all Comment entity
	 * 
	 */
	@Transactional
	public Integer countComments() {
		return ((Long) commentDAO.createQuerySingleResult("select count(o) from Comment o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Comment entity
	 * 
	 */
	@Transactional
	public void saveComment(Comment comment) {
		Comment existingComment = commentDAO.findCommentByPrimaryKey(comment.getId());

		if (existingComment != null) {
			if (existingComment != comment) {
				existingComment.setId(comment.getId());
				existingComment.setContent(comment.getContent());
				existingComment.setReleaseDate(comment.getReleaseDate());
				existingComment.setArticleId(comment.getArticleId());
				existingComment.setUserId(comment.getUserId());
				existingComment.setState(comment.getState());
				existingComment.setSysDate(comment.getSysDate());
				existingComment.setCheckState(comment.getCheckState());
			}
			comment = commentDAO.store(existingComment);
		} else {
			comment = commentDAO.store(comment);
		}
		commentDAO.flush();
	}

	/**
	 * Return all Comment entity
	 * 
	 */
	@Transactional
	public List<Comment> findAllComments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Comment>(commentDAO.findAllComments(startResult, maxRows));
	}

	/**
	 * Load an existing Comment entity
	 * 
	 */
	@Transactional
	public Set<Comment> loadComments() {
		return commentDAO.findAllComments();
	}

	/**
	 */
	@Transactional
	public Comment findCommentByPrimaryKey(Integer id) {
		return commentDAO.findCommentByPrimaryKey(id);
	}
}
