package com.ubaid.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.ubaid.app")
@EnableWebMvc
public class Config implements WebMvcConfigurer
{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry)
	{
		registry.jsp("WEB-INF/views/", ".jsp");
	}
	
}
