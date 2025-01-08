package com.data.usingbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configure {
	@Bean
	public Emp emp() {
		return new Emp();
	}
}
