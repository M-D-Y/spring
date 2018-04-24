package com.annotations.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotations.spring.core.beans.Client;

@Configuration
public class AppConfig {

	@Bean
	public Client client() {
		return new Client(null, null);
	}
}
