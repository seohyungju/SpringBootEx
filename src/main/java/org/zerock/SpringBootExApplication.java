package org.zerock;

import javax.servlet.Filter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.zerock.filter.SampleFilter;

@SpringBootApplication
@MapperScan(value = {"org.zerock.mapper"})
public class SpringBootExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean someFilterRegistration(){
		
		FilterRegistrationBean registration = new FilterRegistrationBean<>();
		SampleFilter sampleFilter = new SampleFilter();
		registration.setFilter(sampleFilter);
		registration.addUrlPatterns("/test/*");
		registration.setName("sampleFilter");
		
		return registration;
	}
}
