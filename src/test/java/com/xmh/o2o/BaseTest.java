/**
 * @author minghui
 */
package com.xmh.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author minghui
 * wechat: xmh594603296
 * @date:2018年1月27日
 * version: 1.1
 * desc: 配置spring和junit的整合，也就是加载spring-test
 * 启动spring ioc容器
 * 用Runwith 和 ContextConfiguration
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
