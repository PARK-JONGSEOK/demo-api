package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**")
				.allowedOrigins("http://localhost:3000")
				.allowedMethods("*")
				.allowCredentials(true);

		/*registry.addMapping("/api/**")
				.allowedOrigins("http://localhost:3000")
				.allowCredentials(true);
		*/// .allowedMethods("POST", "GET", "PUT", "DELETE")

	}
}