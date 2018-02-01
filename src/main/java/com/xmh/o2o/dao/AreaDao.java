/**
 * @author minghui
 */
package com.xmh.o2o.dao;

import java.util.List;

import com.xmh.o2o.pojo.Area;

/**
 * @author minghui
 * wechat: xmh594603296
 * @date:2018年1月27日
 * version: 1.1
 */
public interface AreaDao {

	/**
	 * 列出区域列表
	 * 返回list集合的区域列表
	 */
	List<Area> queryArea();
}
