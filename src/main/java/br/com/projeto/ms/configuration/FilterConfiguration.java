package br.com.projeto.ms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.projeto.ms.filters.ErrorFilter;
import br.com.projeto.ms.filters.PostFilter;
import br.com.projeto.ms.filters.PreFilter;
import br.com.projeto.ms.filters.RouteFilter;


@Configuration 
public class FilterConfiguration {
	
	 
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
