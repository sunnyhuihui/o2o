package com.xmh.o2o.service;


import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xmh.o2o.dto.ShopExecution;
import com.xmh.o2o.pojo.Shop;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
public interface ShopService {
	
	ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);
}
