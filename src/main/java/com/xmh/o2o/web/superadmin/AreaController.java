package com.xmh.o2o.web.superadmin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xmh.o2o.pojo.Area;
import com.xmh.o2o.service.AreaService;

import ch.qos.logback.classic.Logger;

/**
 * Author: minghui
 * Wechat: xmh594603296
 * @date:2018年1月27日
 * DESC:
 * version: 1.1
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
	Logger logger = (Logger) LoggerFactory.getLogger(AreaController.class);
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="listarea")
	@ResponseBody
	private Map<String,Object> listArea(){
		logger.info("====start====");
		long startTime= System.currentTimeMillis();
		Map<String,Object> modelMap = new HashMap<String,Object>();
	    try {
			List<Area> list = areaService.getAreaList();
			modelMap.put("success", true);
			modelMap.put("rows", list);
			modelMap.put("total", list.size());
		}catch(Exception e) {
			e.printStackTrace();
			modelMap.put("success", false);
			modelMap.put("errMsg", e.toString());
		}
	    logger.error("test error!");
	    long endTime= System.currentTimeMillis();
	    //debug一般做调优，做程序优化的时间 
	    logger.debug("costTime:[{}ms]",endTime-startTime);
	    logger.info("=====end=====");
	    return modelMap;
	}
	
	
	
	
}
