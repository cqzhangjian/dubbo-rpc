package org.zj.dubbo.demo.dubbozjdemoconsumer;

import org.zj.dubbo.demo.dubbozjdemoapi.DemoService;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class DubboZjDemoConsumerApplication {

	public static void main(String[] args) {
		
		ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<DemoService>();
        referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.1.188:2181"));
        referenceConfig.setInterface(DemoService.class);
        DemoService greetingService = referenceConfig.get();
        System.out.println(greetingService.sayHello("world"));
	}
	
}
