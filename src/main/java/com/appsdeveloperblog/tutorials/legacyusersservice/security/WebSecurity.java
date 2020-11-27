package com.appsdeveloperblog.tutorials.legacyusersservice.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
	  @Override
	    protected void configure(HttpSecurity http) throws Exception { 
	        http
	        .cors().and()
	        .csrf().disable().authorizeRequests()
	        .antMatchers("/users/**")
	        .hasIpAddress("127.0.0.1")
	        .antMatchers("/h2-console/**").permitAll()
	        .anyRequest().authenticated().and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	        
	        http.headers().frameOptions().disable();
	  }
}
