/**
 * 
 */
package com.zblin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zblin.api.service.UserService;

/**
 * create by zblin on 2016年7月26日
 */
@RestController
public class UserController {
	@Reference
	UserService userService;
	
	@RequestMapping("/welcome")
	public String welcome(){
		return userService.sayHello("林泽斌");
	}

}
