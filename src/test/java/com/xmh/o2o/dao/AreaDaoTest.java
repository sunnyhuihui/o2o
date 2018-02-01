/**
 * @author minghui
 */
package com.xmh.o2o.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xmh.o2o.BaseTest;
import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.dao.AreaDao;

/**
 * @author minghui
 * wechat: xmh594603296
 * @date:2018年1月27日
 * version: 1.1
 */
public class AreaDaoTest extends BaseTest{

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List<Area> list = areaDao.queryArea();
		System.out.println(list);
	}
}
