package com.xmh.o2o.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xmh.o2o.BaseTest;
import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.pojo.PersonInfo;
import com.xmh.o2o.pojo.Shop;
import com.xmh.o2o.pojo.ShopCategory;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
public class ShopDaoTest extends BaseTest{

	@Autowired
	private ShopDao shopDao;
	
	
	@Test
	public void testQueryById() {
		Shop shop = shopDao.queryByShopId(1);
		System.out.println(shop.getArea().getAreaName());
		System.out.println(shop.getArea().getAreaId());
	}
	
	
	@Test
	@Ignore
	public void testInsertShop() {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		shopCategory.setShopCategoryId(1);
		owner.setUserId(1);
		area.setAreaId(2);
		shop.setArea(area);
		shop.setOwner(owner);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试的店铺");
		shop.setShopAddr("test222");
		shop.setPhone("test222");
		shop.setEnableStatus(0);
		int n = shopDao.insertShop(shop);
		assertEquals(1, n);
		
	}
	
	@Test
	@Ignore
	public void testUpdateShop() {
		Shop shop = new Shop();
		Area area =  new  Area();
		area.setAreaId(3);
		shop.setShopName("test");
		shop.setShopDesc("wwwww");
		shop.setShopAddr("wwww");
		shop.setPhone("wwww");
		shop.setShopImg("/upload/item/shop/21/2018013009302173453.png(String)");
		//shop.setEnableStatus(1);
		ShopCategory shopcategory = new ShopCategory();
		shopcategory.setShopCategoryId(1);
		shop.setShopCategory(shopcategory);
		shop.setShopId(21);
		shop.setArea(area);
		shopDao.updateShop(shop);
	}
}
