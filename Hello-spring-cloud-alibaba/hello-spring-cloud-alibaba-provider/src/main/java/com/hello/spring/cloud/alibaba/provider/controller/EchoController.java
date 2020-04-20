package com.hello.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
	
	@Value("${server.port}")
    private String port;
	
	@GetMapping(value="/echo/{string}")
	public String echo(@PathVariable String string) {
		return "Hello Nacos Provider " + string;
	}
	

    
	 @GetMapping(value = "/loadBalance")
	    public String loadBalance() {
	        return "Nacos Provider from port : " + port;
	    }
}
