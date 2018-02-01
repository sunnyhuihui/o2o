package com.xmh.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmh.o2o.dao.AreaDao;
import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.service.AreaService;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月27日
 * DESC:
 * version: 1.1
 */
@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areaDao;
	
	
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}

	
}
