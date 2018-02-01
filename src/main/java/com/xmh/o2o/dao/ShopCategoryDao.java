package com.xmh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.o2o.pojo.ShopCategory;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
public interface ShopCategoryDao {


	/**
	 * 
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> queryShopCategoryList(
			@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);


}
