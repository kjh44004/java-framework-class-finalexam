package com.madogiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@SpringBootApplication
public class MadoGigaCommentsApplication extends WebMvcConfigurerAdapter{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.enableContentNegotiation(new MappingJackson2JsonView());
	}
	public static void main(String[] args) {
		SpringApplication.run(MadoGigaCommentsApplication.class, args);
	}
}
