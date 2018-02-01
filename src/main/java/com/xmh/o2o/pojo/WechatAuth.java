/**
 * @author minghui
 */
package com.xmh.o2o.pojo;

import java.util.Date;

/**
 * @author minghui
 * wechat: xmh594603296
 * @date:2018年1月26日
 * version: 1.1
 */
public class WechatAuth {

	private Integer wechatAuthId;
	private Integer userId;
	private String openId;
	private Date createTime;
	private Date updateTime;
	
	
	public Integer getWechatAuthId() {
		return wechatAuthId;
	}
	public void setWechatAuthId(Integer wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOpenid() {
		return openId;
	}
	public void setOpenid(String openid) {
		this.openId = openid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "WechatAuth [wechatAuthId=" + wechatAuthId + ", userId=" + userId + ", openId=" + openId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
	
}
