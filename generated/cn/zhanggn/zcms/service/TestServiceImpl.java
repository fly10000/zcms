package cn.zhanggn.zcms.service;

import cn.zhanggn.zcms.dao.TestDAO;

import cn.zhanggn.zcms.domain.Test;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Test entities
 * 
 */

@Service("TestService")
@Transactional
public class TestServiceImpl implements TestService {

	/**
	 * DAO injected by Spring that manages Test entities
	 * 
	 */
	@Autowired
	private TestDAO testDAO;

	/**
	 * Instantiates a new TestServiceImpl.
	 *
	 */
	public TestServiceImpl() {
	}

	/**
	 * Return all Test entity
	 * 
	 */
	@Transactional
	public List<Test> findAllTests(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Test>(testDAO.findAllTests(startResult, maxRows));
	}

	/**
	 * Save an existing Test entity
	 * 
	 */
	@Transactional
	public void saveTest(Test test) {
		Test existingTest = testDAO.findTestByPrimaryKey(test.getId());

		if (existingTest != null) {
			if (existingTest != test) {
				existingTest.setId(test.getId());
				existingTest.setName(test.getName());
				existingTest.setContent(test.getContent());
			}
			test = testDAO.store(existingTest);
		} else {
			test = testDAO.store(test);
		}
		testDAO.flush();
	}

	/**
	 * Return a count of all Test entity
	 * 
	 */
	@Transactional
	public Integer countTests() {
		return ((Long) testDAO.createQuerySingleResult("select count(o) from Test o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Test findTestByPrimaryKey(Integer id) {
		return testDAO.findTestByPrimaryKey(id);
	}

	/**
	 * Delete an existing Test entity
	 * 
	 */
	@Transactional
	public void deleteTest(Test test) {
		testDAO.remove(test);
		testDAO.flush();
	}

	/**
	 * Load an existing Test entity
	 * 
	 */
	@Transactional
	public Set<Test> loadTests() {
		return testDAO.findAllTests();
	}
}
