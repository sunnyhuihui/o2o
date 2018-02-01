package com.xmh.o2o.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.pojo.PersonInfo;
import com.xmh.o2o.pojo.Shop;
import com.xmh.o2o.pojo.ShopCategory;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
public class ShopServiceTest {

	@Autowired
	ShopService shopService;
	
	@Test
	public void testAddShop() throws IOException {
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
		shop.setShopName("测试的店铺11");
		shop.setShopAddr("test11");
		shop.setPhone("test11");
		shop.setEnableStatus(0);
		File file =  new File("/Users/xieminghui/Downloads/baiduyun_download/images/item/shopcategory/2017060420464594520.png");
		FileInputStream input = new FileInputStream(file); 
		MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));
		CommonsMultipartFile cf= (CommonsMultipartFile)multipartFile; 
		shopService.addShop(shop, cf);
		
	}
}
