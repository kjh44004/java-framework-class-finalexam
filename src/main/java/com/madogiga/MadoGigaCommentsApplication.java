package com.madogiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Calendar;
import java.util.GregorianCalendar;


@SpringBootApplication
@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
public class MadoGigaCommentsApplication extends WebMvcConfigurerAdapter {

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.enableContentNegotiation(new MappingJackson2JsonView());
//    }

	public static void main(String[] args) {
		SpringApplication.run(MadoGigaCommentsApplication.class, args);
	}

	@Bean
	public DateTimeProvider dateTimeProvider() {
		return new DateTimeProvider() {
			@Override
			public Calendar getNow() {
				return GregorianCalendar.getInstance();
			}
		};
	}

}