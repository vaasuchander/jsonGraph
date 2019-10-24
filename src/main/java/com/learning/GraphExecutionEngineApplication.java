package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.service.GraphService;

@SpringBootApplication
public class GraphExecutionEngineApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(GraphExecutionEngineApplication.class, args);
		GraphService gService = ctx.getBean(GraphService.class);
		System.out.println(gService.loadAndProcess());
	}
	
	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
	
}
