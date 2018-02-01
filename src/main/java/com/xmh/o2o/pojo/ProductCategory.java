/**
 * @author minghui
 */
package com.xmh.o2o.pojo;

import java.util.Date;

/**
 * @author minghui wechat: xmh594603296
 * @date:2018年1月26日 version: 1.1
 */
public class ProductCategory {
	private Integer productCategoryId;
	private Integer shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;
	private Date updateTime;
	public Integer getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
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
		return "ProductCategory [productCategoryId=" + productCategoryId + ", shopId=" + shopId
				+ ", productCategoryName=" + productCategoryName + ", priority=" + priority + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
}
