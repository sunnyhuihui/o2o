package com.xmh.o2o.dto;

import java.util.List;

import com.xmh.o2o.enums.ShopStateEnum;
import com.xmh.o2o.pojo.Shop;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
public class ShopExecution {

	
	//返回的结果状态
	private int state;
	
	//返回的信息
	private String msg;
	
	//店铺的数量
	private int count;
	
	//操作的单个店铺
	private Shop shop;
	
	//返回列表的店铺
	private List<Shop> shopList;
	
	public ShopExecution() {
		
	}
	
	//店铺操作失败使用构造器
	public ShopExecution(ShopStateEnum stateEnum) {
		this.state=stateEnum.getState();
		this.msg=stateEnum.getMsg();
	}
	
	//店铺操作成功的构造器
	public ShopExecution(ShopStateEnum stateEnum,Shop shop) {
		this.state=stateEnum.getState();
		this.msg=stateEnum.getMsg();
		this.shop=shop;
	}

	//店铺操作成功的构造器
	public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList) {
		this.state=stateEnum.getState();
		this.msg=stateEnum.getMsg();
		this.shopList=shopList;
	}


	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public List<Shop> getShopList() {
		return shopList;
	}

	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	
	
	
}
