package com.example.springbootzuulgetwayproxy;

import com.example.springbootzuulgetwayproxy.filters.ErrorFilter;
import com.example.springbootzuulgetwayproxy.filters.PostFilter;
import com.example.springbootzuulgetwayproxy.filters.PreFilter;
import com.example.springbootzuulgetwayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;



@EnableZuulProxy
@SpringBootApplication
public class SpringBootZuulgetwayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgetwayproxyApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
