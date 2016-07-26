package com.zblin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zblin.api.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootDubboSampleClientApplication.class)
@WebAppConfiguration
public class BootDubboSampleClientApplicationTests {

	@Reference
	UserService userService;
	 
	@Test
	public void contextLoads() {
		System.out.println(userService.sayHello("林泽斌"));
	}

}
