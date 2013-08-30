package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.User;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for User entities
 * 
 */
public interface UserService {

	/**
	 */
	public User findUserByPrimaryKey(Integer id);

	/**
	 * Return a count of all User entity
	 * 
	 */
	public Integer countUsers();

	/**
	 * Load an existing User entity
	 * 
	 */
	public Set<User> loadUsers();

	/**
	 * Return all User entity
	 * 
	 */
	public List<User> findAllUsers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing User entity
	 * 
	 */
	public void deleteUser(User user);

	/**
	 * Save an existing User entity
	 * 
	 */
	public void saveUser(User user_1);
}