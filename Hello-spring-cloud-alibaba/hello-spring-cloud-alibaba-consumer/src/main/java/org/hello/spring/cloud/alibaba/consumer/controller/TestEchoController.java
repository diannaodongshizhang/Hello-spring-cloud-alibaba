package org.hello.spring.cloud.alibaba.consumer.controller;

import org.hello.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestEchoController {
	
	@Autowired
	private EchoService echoService;
	
	@Value("${user.name}")
	private String username;
	
	 @GetMapping(value = "/feign/echo/{str}")
	    public String echo(@PathVariable String str) {
	        // 使用服务名请求服务提供者
	        return echoService.echo(str);
	    }
	 @GetMapping(value = "/feign/echo")
	    public String echo() {
	        // 使用服务名请求服务提供者
	        return echoService.echo(username);
	    }
	 @GetMapping(value="/loadBalance")
	 public String loadBalance() {
		 return echoService.loadBalance();
	 }
	 
}
