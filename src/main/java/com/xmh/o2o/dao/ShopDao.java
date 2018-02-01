package com.xmh.o2o.dao;

import com.xmh.o2o.pojo.Shop;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
public interface ShopDao {

	Shop queryByShopId(Integer shopId);
	
	/**
	 * 新增店铺
	*@param
	*@reutrn
	 */
	int insertShop(Shop shop);
	
	
	int updateShop(Shop shop);
}
