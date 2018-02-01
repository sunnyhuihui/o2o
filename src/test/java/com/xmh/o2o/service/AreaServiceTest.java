package com.xmh.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xmh.o2o.BaseTest;
import com.xmh.o2o.pojo.Area;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月27日
 * DESC:
 * version: 1.1
 */
public class AreaServiceTest extends BaseTest{

	@Autowired
	private AreaService areaService;
	
	@Test
	public void getAreaList() {
		List<Area> list  = areaService.getAreaList();
		System.out.println(list);
	}
}
