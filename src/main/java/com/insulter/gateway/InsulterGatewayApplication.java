package com.insulter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class InsulterGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsulterGatewayApplication.class, args);
	}
}
