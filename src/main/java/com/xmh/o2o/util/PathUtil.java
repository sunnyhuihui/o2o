package com.xmh.o2o.util;

/**
 * Author: minghui Wechat: xmh594603296
 * 
 * @date:2018年1月28日 DESC: version: 1.1
 */
public class PathUtil {

	private static String seperator = System.getProperty("file.separator");

	// 获取操作系统，定义图片输出的根路径
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/o2o/img/";
		} else {
			basePath = "/Users/xieminghui/work/img";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	
	//根据不同店铺，返回图片输出的子路径
	public static String getShopImagePath(int shopId) {
		String imagePath = "/upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
	
	

}
