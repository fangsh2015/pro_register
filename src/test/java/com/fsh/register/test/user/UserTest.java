package com.fsh.register.test.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.fsh.register.model.User;
import com.fsh.register.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class UserTest {
	private static Logger logger = Logger.getLogger(UserTest.class);  
	
	  @Resource  
	  private UserService userService = null; 
	  @Test  
	  public void test1() {  
         User user = userService.getUserById(1);
         user.setAge(25) ;
         user.setUserName("你的我d");
        int result = userService.updateUser(user);
         // System.out.println(user.getUserName());  
         logger.info("值："+user.getUserName());  
         logger.info(JSON.toJSONString(user));
         System.out.println(JSON.toJSONString(user));
	   }  
}
