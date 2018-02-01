package com.xmh.o2o.web.shopadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xmh.o2o.dto.Result;
import com.xmh.o2o.dto.ShopExecution;
import com.xmh.o2o.enums.ShopStateEnum;
import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.pojo.PersonInfo;
import com.xmh.o2o.pojo.Shop;
import com.xmh.o2o.pojo.ShopCategory;
import com.xmh.o2o.service.AreaService;
import com.xmh.o2o.service.ShopCategoryService;
import com.xmh.o2o.service.ShopService;
import com.xmh.o2o.util.CodeUtil;
import com.xmh.o2o.util.HttpServletRequestUtil;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
@Controller
@RequestMapping("/shopadmin")
public class ShopManagementController {

	@Autowired
	private ShopService shopService;
	@Autowired
	private ShopCategoryService shopCategoryService;
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/getshopinitinfo",method=RequestMethod.GET)
	@ResponseBody
	private Result<Map<String,Object>> getShopInitInfo(){
		Result<Map<String,Object>> result = new Result<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String, Object>();
		List<ShopCategory> shopCategoryList = new ArrayList<ShopCategory>();
		List<Area> areaList = new ArrayList<Area>();
		try {
			shopCategoryList = shopCategoryService.getShopCategoryList(new ShopCategory());
			areaList = areaService.getAreaList();
			map.put("shopCategoryList",shopCategoryList);
			map.put("areaList",areaList);
			result.setSuccess(true);
			result.setStatus(0);
			result.setMsg("返回初始商铺信息成功");
			result.setData(map);
			return result;
		}catch(Exception e) {
			result.setSuccess(false);
			result.setStatus(1);
			result.setMsg("getshopinitinfo发生错误");
			return result;
		}
	}
	
	@RequestMapping(value="/registershop",method=RequestMethod.POST)
	@ResponseBody
	private Result<Map<String,Object>> registerShop(HttpServletRequest request){
		Result<Map<String,Object>> result = new Result<Map<String,Object>>();
		if(!CodeUtil.checkVerifyCode(request)) {
			result.setSuccess(false);
			result.setStatus(1);
			result.setMsg("验证码错误");
			return result;
		}
		
		//将前段传过来的Str字符串转成实体对象
		String shopStr=HttpServletRequestUtil.getString(request, "shopStr");
		ObjectMapper mapper = new ObjectMapper();
		Shop shop = null;
		//接受前段的图片
		CommonsMultipartFile shopImg = null;
		//通过spring的commonsMultipartResolver获取传过来的文件内容
		CommonsMultipartResolver commonsMultipartResolver = 
				new CommonsMultipartResolver(
						request.getSession().getServletContext());
		//判断文件流是不是multipart类型（是不是有上传的文件流）
		if(commonsMultipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
			shopImg = (CommonsMultipartFile)multipartHttpServletRequest.getFile("shopImg");
		}else {
			result.setSuccess(false);
			result.setStatus(2);
			result.setMsg("店铺图片上传不能为空");
			return result;
		}
		try {
			shop = mapper.readValue(shopStr, Shop.class);
		}catch(Exception e) {
			result.setSuccess(false);
			result.setStatus(1);
			result.setMsg(e.getMessage());
			return result;
		}
		
		
		//2.注册店铺
		if(shop!=null&&shopImg!=null) {
			PersonInfo owner = new PersonInfo();
//			PersonInfo user = (PersonInfo) request.getSession()
//					.getAttribute("user");
//			shop.setOwnerId(user.getUserId());
			owner.setUserId(1);
			shop.setOwner(owner);
			ShopExecution se = shopService.addShop(shop, shopImg);
			if(se.getState() == ShopStateEnum.CHECK.getState()) {
				result.setStatus(0);
				result.setSuccess(true);
				result.setMsg("创建店铺成功");
				return result;
			}else {
				result.setStatus(se.getState());
				result.setSuccess(false);
				result.setMsg("创建店铺失败");
				return result;
			}
		}else {
			result.setSuccess(false);
			result.setStatus(3);
			result.setMsg("店铺信息不能为空");
			return result;
		}
	}
}
