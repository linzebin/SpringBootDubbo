/**
 * 
 */
package com.zblin.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zblin.api.service.UserService;

/**
 * create by zblin on 2016年7月26日
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String sayHello(String name) {
		System.out.println("RPC 远程调用成功!");
		return "hello" + name;
	}

}
