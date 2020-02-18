package com.cts.training.bootapphibernatejpa.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
@Autowired
public DataSource  datasource;
@Autowired
private DataSource dataSource;

// configure the credentials repository
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	auth.jdbcAuthentication().dataSource(dataSource);
	
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	http
		.cors() 
	.and()
		.csrf().disable() 
		.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS, "/api/**").hasRole("USER")
			.antMatchers(HttpMethod.OPTIONS, "/login").hasRole("USER") 
			
		.and()
			.httpBasic();
}
}
