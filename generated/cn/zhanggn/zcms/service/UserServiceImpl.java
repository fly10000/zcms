package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.UserDAO;

import cn.zhanggn.zcms.domain.User;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for User entities
 * 
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

	/**
	 * DAO injected by Spring that manages User entities
	 * 
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * Instantiates a new UserServiceImpl.
	 *
	 */
	public UserServiceImpl() {
	}

	/**
	 */
	@Transactional
	public User findUserByPrimaryKey(Integer id) {
		return userDAO.findUserByPrimaryKey(id);
	}

	/**
	 * Return a count of all User entity
	 * 
	 */
	@Transactional
	public Integer countUsers() {
		return ((Long) userDAO.createQuerySingleResult("select count(o) from User o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing User entity
	 * 
	 */
	@Transactional
	public Set<User> loadUsers() {
		return userDAO.findAllUsers();
	}

	/**
	 * Return all User entity
	 * 
	 */
	@Transactional
	public List<User> findAllUsers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<User>(userDAO.findAllUsers(startResult, maxRows));
	}

	/**
	 * Delete an existing User entity
	 * 
	 */
	@Transactional
	public void deleteUser(User user) {
		userDAO.remove(user);
		userDAO.flush();
	}

	/**
	 * Save an existing User entity
	 * 
	 */
	@Transactional
	public void saveUser(User user) {
		User existingUser = userDAO.findUserByPrimaryKey(user.getId());

		if (existingUser != null) {
			if (existingUser != user) {
				existingUser.setId(user.getId());
				existingUser.setQq(user.getQq());
				existingUser.setAddress(user.getAddress());
				existingUser.setBirthday(user.getBirthday());
				existingUser.setCheckState(user.getCheckState());
				existingUser.setCreateTime(user.getCreateTime());
				existingUser.setEmail(user.getEmail());
				existingUser.setGender(user.getGender());
				existingUser.setInfo(user.getInfo());
				existingUser.setLastLoginIp(user.getLastLoginIp());
				existingUser.setLastLoginTime(user.getLastLoginTime());
				existingUser.setLoginNumber(user.getLoginNumber());
				existingUser.setJ2cmsPassWord(user.getJ2cmsPassWord());
				existingUser.setRealName(user.getRealName());
				existingUser.setTelephone(user.getTelephone());
				existingUser.setJ2cmsUserName(user.getJ2cmsUserName());
				existingUser.setZipCode(user.getZipCode());
				existingUser.setGroupId(user.getGroupId());
				existingUser.setSysDate(user.getSysDate());
			}
			user = userDAO.store(existingUser);
		} else {
			user = userDAO.store(user);
		}
		userDAO.flush();
	}
}
