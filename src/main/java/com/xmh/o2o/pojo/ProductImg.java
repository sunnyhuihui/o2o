/**
 * @author minghui
 */
package com.xmh.o2o.pojo;

import java.util.Date;

/**
 * @author minghui wechat: xmh594603296
 * @date:2018年1月26日 version: 1.1
 */
public class ProductImg {
	private Integer productImg;
	private String imgAddr;
	private String imgDesc;
	private Integer priority;
	private Integer productId;
	private Date createTime;
	private Date updateTime;
	
	
	
	
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

	public Integer getProductImg() {
		return productImg;
	}

	public void setProductImg(Integer productImg) {
		this.productImg = productImg;
	}

	public String getImgAddr() {
		return imgAddr;
	}

	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}

	public String getImgDesc() {
		return imgDesc;
	}

	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductImg [productImg=" + productImg + ", imgAddr=" + imgAddr + ", imgDesc=" + imgDesc + ", priority="
				+ priority + ", productId=" + productId + "]";
	}

}
