package com.example.demo.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String ruta = System.getProperty("user.dir") + "/uploads/img/";

        registry.addResourceHandler("/img/**")
                .addResourceLocations("file:" + ruta);
    }
}
