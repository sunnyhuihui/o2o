/**
 * @author minghui
 */
package com.xmh.o2o.pojo;

/**
 * @author minghui
 * wechat: xmh594603296
 * @date:2018年1月26日
 * version: 1.1
 */
public class LocalAuth {

	private Integer localAuthId;
	private Integer userId;
	private String username;
	private String password;
	private String createTime;
	private String updateTime;
	
	
	public Integer getLocalAuthId() {
		return localAuthId;
	}
	public void setLocalAuthId(Integer localAuthId) {
		this.localAuthId = localAuthId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getuserId() {
		return userId;
	}
	public void setuserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "LocalAuth [userId=" + userId + ", username=" + username + ", password=" + password
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
