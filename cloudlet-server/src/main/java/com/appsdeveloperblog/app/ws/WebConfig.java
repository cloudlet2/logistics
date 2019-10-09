package com.appsdeveloperblog.app.ws;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry
		.addMapping("/**")
		.allowedMethods("*")
		.allowedOrigins("*");

	}
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/web/index.html");
		registry.addViewController("/web/").setViewName("forward:/web/index.html");
        registry.addViewController("/web").setViewName("forward:/web/index.html");
    }
	
}
