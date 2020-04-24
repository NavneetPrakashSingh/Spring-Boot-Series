package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {
	

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		//store the bearer token in the database and generate the user
		.withUser("navneet").password("{noop}pass1").roles("USER").and()
		.withUser("navneet2").password("{noop}pass2").roles("USER", "OPERATOR");
	}
}
