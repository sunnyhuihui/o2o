package com.xmh.o2o.service;

import java.util.List;

import com.xmh.o2o.pojo.ShopCategory;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
public interface ShopCategoryService {

	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
