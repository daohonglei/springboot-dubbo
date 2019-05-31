package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String sayHello(String name) {
		return "hello"+name;
	}

	@Override
	public String getName(String name) {
		return name;
	}

}
