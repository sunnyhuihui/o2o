package com.xmh.o2o.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xmh.o2o.BaseTest;
import com.xmh.o2o.pojo.ShopCategory;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
public class ShopCategoryDaoTest extends BaseTest{

	@Autowired
	private ShopCategoryDao shopCategoryDao;
	
	@Test
	public void testQueryShopCategory() {
		
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategoryList(new ShopCategory());
		//System.out.println(shopCategoryList.size());
		
		ShopCategory testCategory =  new ShopCategory();
		ShopCategory parentCategory =  new ShopCategory();
		parentCategory.setShopCategoryId(1);
		testCategory.setParentId(parentCategory);
		shopCategoryDao.queryShopCategoryList(testCategory);
		System.out.println(shopCategoryDao.queryShopCategoryList(testCategory).size());
		
	}
}
