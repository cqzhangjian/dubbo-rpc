package org.zj.dubbo.demo.dubbozjdemoprovider;

import java.io.IOException;

import org.zj.dubbo.demo.dubbozjdemoapi.DemoService;
import org.zj.dubbo.demo.dubbozjdemoprovider.server.api.impl.DemoServiceImpl;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

public class DubboZjDemoProviderApplication {

	public static void main(String[] args) throws IOException {
		   	ServiceConfig<DemoService> serviceConfig = new ServiceConfig<DemoService>();
	        serviceConfig.setApplication(new ApplicationConfig("first-dubbo-provider"));
	        serviceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.1.188:2181"));
	        serviceConfig.setProtocol(new ProtocolConfig("dubbo", 20880));
	        serviceConfig.setInterface(DemoService.class);
	        serviceConfig.setRef(new DemoServiceImpl());
	        serviceConfig.export();
	        System.in.read();
	}
}
