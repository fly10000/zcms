package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.GroupDAO;

import cn.zhanggn.zcms.domain.Group;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Group entities
 * 
 */

@Service("GroupService")
@Transactional
public class GroupServiceImpl implements GroupService {

	/**
	 * DAO injected by Spring that manages Group entities
	 * 
	 */
	@Autowired
	private GroupDAO groupDAO;

	/**
	 * Instantiates a new GroupServiceImpl.
	 *
	 */
	public GroupServiceImpl() {
	}

	/**
	 * Return all Group entity
	 * 
	 */
	@Transactional
	public List<Group> findAllGroups(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Group>(groupDAO.findAllGroups(startResult, maxRows));
	}

	/**
	 * Save an existing Group entity
	 * 
	 */
	@Transactional
	public void saveGroup(Group group) {
		Group existingGroup = groupDAO.findGroupByPrimaryKey(group.getId());

		if (existingGroup != null) {
			if (existingGroup != group) {
				existingGroup.setId(group.getId());
				existingGroup.setInfo(group.getInfo());
				existingGroup.setManagerArticle(group.getManagerArticle());
				existingGroup.setManageChannel(group.getManageChannel());
				existingGroup.setManageComment(group.getManageComment());
				existingGroup.setManageConfig(group.getManageConfig());
				existingGroup.setManageGroup(group.getManageGroup());
				existingGroup.setManagerLog(group.getManagerLog());
				existingGroup.setManagerUser(group.getManagerUser());
				existingGroup.setName(group.getName());
				existingGroup.setCheckState(group.getCheckState());
				existingGroup.setSysDate(group.getSysDate());
			}
			group = groupDAO.store(existingGroup);
		} else {
			group = groupDAO.store(group);
		}
		groupDAO.flush();
	}

	/**
	 * Delete an existing Group entity
	 * 
	 */
	@Transactional
	public void deleteGroup(Group group) {
		groupDAO.remove(group);
		groupDAO.flush();
	}

	/**
	 */
	@Transactional
	public Group findGroupByPrimaryKey(Integer id) {
		return groupDAO.findGroupByPrimaryKey(id);
	}

	/**
	 * Return a count of all Group entity
	 * 
	 */
	@Transactional
	public Integer countGroups() {
		return ((Long) groupDAO.createQuerySingleResult("select count(o) from Group o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Group entity
	 * 
	 */
	@Transactional
	public Set<Group> loadGroups() {
		return groupDAO.findAllGroups();
	}
}
