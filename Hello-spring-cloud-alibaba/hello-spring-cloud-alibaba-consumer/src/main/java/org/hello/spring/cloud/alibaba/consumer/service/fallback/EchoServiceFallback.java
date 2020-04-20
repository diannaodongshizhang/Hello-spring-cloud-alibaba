package org.hello.spring.cloud.alibaba.consumer.service.fallback;

import org.hello.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService{

	@Override
	public String echo(String string) {
		// TODO Auto-generated method stub
		return "echo fail";
	}

	@Override
	public String loadBalance() {
		// TODO Auto-generated method stub
		return "echo fail";
	}

}
