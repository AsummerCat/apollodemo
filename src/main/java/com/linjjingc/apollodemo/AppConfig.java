package com.linjjingc.apollodemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public TestJavaConfigBean javaConfigBean() {
		return new TestJavaConfigBean();
	}
}