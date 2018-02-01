/**
 * @author minghui
 */
package com.xmh.o2o.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author minghui wechat: xmh594603296
 * @date:2018年1月26日 version: 1.1
 */
public class Product {

	private Integer productId;
	private String productName;
	private String productDesc;
	// 缩略图
	private String imgAddr;
	private String normalPrice;
	private String promotionPrice;
	private String pripority;
	private Integer enableStatus;
	private Date createTime;
	private Date updateTime;

	private List<ProductImg> productImgList;
	private Shop shop;
	private ProductCategory productCategory;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getPripority() {
		return pripority;
	}
	public void setPripority(String pripority) {
		this.pripority = pripority;
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
	public List<ProductImg> getProductImgList() {
		return productImgList;
	}
	public void setProductImgList(List<ProductImg> productImgList) {
		this.productImgList = productImgList;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", imgAddr=" + imgAddr + ", normalPrice=" + normalPrice + ", promotionPrice=" + promotionPrice
				+ ", pripority=" + pripority + ", enableStatus=" + enableStatus + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", productImgList=" + productImgList + ", shop=" + shop
				+ ", productCategory=" + productCategory + "]";
	}

	
}
