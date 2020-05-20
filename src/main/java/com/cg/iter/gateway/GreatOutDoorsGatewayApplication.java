package com.cg.iter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GreatOutDoorsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatOutDoorsGatewayApplication.class, args);
	}

}
