package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.domain.Test;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Test entities
 * 
 */
public interface TestService {

	/**
	 * Return all Test entity
	 * 
	 */
	public List<Test> findAllTests(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Test entity
	 * 
	 */
	public void saveTest(Test test);

	/**
	 * Return a count of all Test entity
	 * 
	 */
	public Integer countTests();

	/**
	 */
	public Test findTestByPrimaryKey(Integer id);

	/**
	 * Delete an existing Test entity
	 * 
	 */
	public void deleteTest(Test test_1);

	/**
	 * Load an existing Test entity
	 * 
	 */
	public Set<Test> loadTests();
}