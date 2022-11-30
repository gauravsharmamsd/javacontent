package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration("config")
public class Configs {

	@Bean
	public College getInstance() {
		return new College();
	}



}
