package com.xmh.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmh.o2o.dao.ShopCategoryDao;
import com.xmh.o2o.pojo.ShopCategory;
import com.xmh.o2o.service.ShopCategoryService;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
@Service
public class ShopCategoryImpl implements ShopCategoryService{

	@Autowired
	private ShopCategoryDao categoryDao;
	
	public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
		// TODO Auto-generated method stub
		return categoryDao.queryShopCategoryList(shopCategoryCondition);
	}

	
	
}
