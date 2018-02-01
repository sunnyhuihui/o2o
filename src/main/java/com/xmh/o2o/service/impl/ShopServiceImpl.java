package com.xmh.o2o.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xmh.o2o.dao.ShopDao;
import com.xmh.o2o.dto.ShopExecution;
import com.xmh.o2o.enums.ShopStateEnum;
import com.xmh.o2o.exceptions.ShopException;
import com.xmh.o2o.pojo.Shop;
import com.xmh.o2o.service.ShopService;
import com.xmh.o2o.util.ImageUtil;
import com.xmh.o2o.util.PathUtil;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao shopDao;
	

	//@Transactional
	public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
		if(shop==null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		try {
			shop.setEnableStatus(1);
			shop.setCreateTime(new Date());
			shop.setUpdateTime(new Date());
			int n= shopDao.insertShop(shop);
			if(n<=0) {
				throw new ShopException("店铺创建失败");
			}else { 
				if(shopImg!=null) {
					//存储图片,把地址加入到shop对象里面
					try{
						addShopImg(shop,shopImg);
					}catch(Exception e) {
						throw new ShopException("addShopImge :error"+e.getMessage());
					}
					}
		}
		}catch(Exception e){
			throw new ShopException("addShop error"+e.getMessage());
		}	
		return new ShopExecution(ShopStateEnum.CHECK,shop);
	}

	
	/**
	*
	*@param
	*@reutrn
	*/
	private void addShopImg(Shop shop, CommonsMultipartFile shopImg) {
		//获取输出shop图片目录的相对值路径
		String dest = PathUtil.getShopImagePath(shop.getShopId());
		String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
		shop.setShopImg(shopImgAddr);
		//更新店铺的图片地址
		int n=shopDao.updateShop(shop);
		if(n<=0) {
			throw new ShopException("更新图片地址失败 :error");
		}
	}

		

}	

