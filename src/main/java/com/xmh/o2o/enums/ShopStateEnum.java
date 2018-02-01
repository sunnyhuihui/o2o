package com.xmh.o2o.enums;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月28日
 * DESC:
 * version: 1.1
 */
public enum ShopStateEnum {
	CHECK(1,"审核中"),
	OFFLINE(-1,"下线"),
	SUCCESS(0,"操作成功"),
	PASS(2,"审核通过"),
	INNER_ERROR(-1001,"系统错误"),
	NULL_SHOP(-1003,"店铺信息为空");
	
	private int state;
	private String msg;
	
	
	

	public int getState() {
		return state;
	}


	public String getMsg() {
		return msg;
	}


	private ShopStateEnum(int state,String msg) {
		this.state = state;
		this.msg=msg;
	};
	
	
	public static ShopStateEnum stateOf(int state) {
		for(ShopStateEnum stateEnum : values()) {
			if(stateEnum.getState() == state) {
				return stateEnum;
			}
		}
		
		return null;
	}
}
