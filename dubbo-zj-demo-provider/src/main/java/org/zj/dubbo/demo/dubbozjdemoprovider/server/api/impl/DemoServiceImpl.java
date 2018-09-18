package org.zj.dubbo.demo.dubbozjdemoprovider.server.api.impl;

import org.zj.dubbo.demo.dubbozjdemoapi.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello: " + name ;
	}

}
