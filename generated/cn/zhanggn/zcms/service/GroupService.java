package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Group;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Group entities
 * 
 */
public interface GroupService {

	/**
	 * Return all Group entity
	 * 
	 */
	public List<Group> findAllGroups(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Group entity
	 * 
	 */
	public void saveGroup(Group group);

	/**
	 * Delete an existing Group entity
	 * 
	 */
	public void deleteGroup(Group group_1);

	/**
	 */
	public Group findGroupByPrimaryKey(Integer id);

	/**
	 * Return a count of all Group entity
	 * 
	 */
	public Integer countGroups();

	/**
	 * Load an existing Group entity
	 * 
	 */
	public Set<Group> loadGroups();
}