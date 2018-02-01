package com.xmh.o2o.web.superadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月29日
 * DESC:
 * version: 1.1
 */
@Controller
@RequestMapping(value="/shopadmin")
public class ShopAdminController {

	@RequestMapping(value="/shopedit")
	//我们已经设置了在html/shop/shopoperation下面。  前后已经被我们定义了
	public String shopOperation() {
		return "shop/shopedit";
	}
	
	
}
