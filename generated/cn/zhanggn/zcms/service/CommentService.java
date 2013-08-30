package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Comment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Comment entities
 * 
 */
public interface CommentService {

	/**
	 * Delete an existing Comment entity
	 * 
	 */
	public void deleteComment(Comment comment);

	/**
	 * Return a count of all Comment entity
	 * 
	 */
	public Integer countComments();

	/**
	 * Save an existing Comment entity
	 * 
	 */
	public void saveComment(Comment comment_1);

	/**
	 * Return all Comment entity
	 * 
	 */
	public List<Comment> findAllComments(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Comment entity
	 * 
	 */
	public Set<Comment> loadComments();

	/**
	 */
	public Comment findCommentByPrimaryKey(Integer id);
}