package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Test;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Test entities.
 * 
 */
public interface TestDAO extends JpaDao<Test> {

	/**
	 * JPQL Query - findAllTests
	 *
	 */
	public Set<Test> findAllTests() throws DataAccessException;

	/**
	 * JPQL Query - findAllTests
	 *
	 */
	public Set<Test> findAllTests(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestById
	 *
	 */
	public Test findTestById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTestById
	 *
	 */
	public Test findTestById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestByContentContaining
	 *
	 */
	public Set<Test> findTestByContentContaining(String content) throws DataAccessException;

	/**
	 * JPQL Query - findTestByContentContaining
	 *
	 */
	public Set<Test> findTestByContentContaining(String content, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestByNameContaining
	 *
	 */
	public Set<Test> findTestByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTestByNameContaining
	 *
	 */
	public Set<Test> findTestByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestByPrimaryKey
	 *
	 */
	public Test findTestByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTestByPrimaryKey
	 *
	 */
	public Test findTestByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestByName
	 *
	 */
	public Set<Test> findTestByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTestByName
	 *
	 */
	public Set<Test> findTestByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestByContent
	 *
	 */
	public Set<Test> findTestByContent(String content_1) throws DataAccessException;

	/**
	 * JPQL Query - findTestByContent
	 *
	 */
	public Set<Test> findTestByContent(String content_1, int startResult, int maxRows) throws DataAccessException;

}