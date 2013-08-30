package cn.zhanggn.zcms.dao;

import cn.zhanggn.zcms.domain.Order;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Order entities.
 * 
 */
public interface OrderDAO extends JpaDao<Order> {

	/**
	 * JPQL Query - findOrderByOtherContaining
	 *
	 */
	public Set<Order> findOrderByOtherContaining(String other) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOtherContaining
	 *
	 */
	public Set<Order> findOrderByOtherContaining(String other, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTelContaining
	 *
	 */
	public Set<Order> findOrderByTelContaining(String tel) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTelContaining
	 *
	 */
	public Set<Order> findOrderByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySysDate
	 *
	 */
	public Set<Order> findOrderBySysDate(java.util.Calendar sysDate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderBySysDate
	 *
	 */
	public Set<Order> findOrderBySysDate(Calendar sysDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDanweiContaining
	 *
	 */
	public Set<Order> findOrderByDanweiContaining(String danwei) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDanweiContaining
	 *
	 */
	public Set<Order> findOrderByDanweiContaining(String danwei, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByReleaseDate
	 *
	 */
	public Set<Order> findOrderByReleaseDate(String releaseDate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByReleaseDate
	 *
	 */
	public Set<Order> findOrderByReleaseDate(String releaseDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTel
	 *
	 */
	public Set<Order> findOrderByTel(String tel_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTel
	 *
	 */
	public Set<Order> findOrderByTel(String tel_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByReleaseDateContaining
	 *
	 */
	public Set<Order> findOrderByReleaseDateContaining(String releaseDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByReleaseDateContaining
	 *
	 */
	public Set<Order> findOrderByReleaseDateContaining(String releaseDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOther
	 *
	 */
	public Set<Order> findOrderByOther(String other_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOther
	 *
	 */
	public Set<Order> findOrderByOther(String other_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findOrderById
	 *
	 */
	public Order findOrderById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	public Set<Order> findOrderByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNameContaining
	 *
	 */
	public Set<Order> findOrderByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDanwei
	 *
	 */
	public Set<Order> findOrderByDanwei(String danwei_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByDanwei
	 *
	 */
	public Set<Order> findOrderByDanwei(String danwei_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTimeContaining
	 *
	 */
	public Set<Order> findOrderByTimeContaining(String time) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTimeContaining
	 *
	 */
	public Set<Order> findOrderByTimeContaining(String time, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	public Set<Order> findOrderByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByName
	 *
	 */
	public Set<Order> findOrderByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNumContaining
	 *
	 */
	public Set<Order> findOrderByNumContaining(String num) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNumContaining
	 *
	 */
	public Set<Order> findOrderByNumContaining(String num, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddressContaining
	 *
	 */
	public Set<Order> findOrderByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTime
	 *
	 */
	public Set<Order> findOrderByTime(String time_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByTime
	 *
	 */
	public Set<Order> findOrderByTime(String time_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNum
	 *
	 */
	public Set<Order> findOrderByNum(String num_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByNum
	 *
	 */
	public Set<Order> findOrderByNum(String num_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByAddress
	 *
	 */
	public Set<Order> findOrderByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

}