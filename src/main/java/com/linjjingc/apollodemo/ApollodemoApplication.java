package com.linjjingc.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableApolloConfig
public class ApollodemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApollodemoApplication.class, args);
	}
}
