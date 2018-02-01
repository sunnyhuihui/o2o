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
public class HeadLine {

	private Integer lineId;
	private String lineName;
	private String linelink;
	private String priority;
	// 0 可以用  1不能使用 
	private Integer enableStatus;
	private Date createTime;
	private Date updateTime;
	public Integer getLineId() {
		return lineId;
	}
	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLinelink() {
		return linelink;
	}
	public void setLinelink(String linelink) {
		this.linelink = linelink;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
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
		return "HeadLine [lineId=" + lineId + ", lineName=" + lineName + ", linelink=" + linelink + ", priority="
				+ priority + ", enableStatus=" + enableStatus + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	
	
}
