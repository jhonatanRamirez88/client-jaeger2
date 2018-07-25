package com.jaegerdos.jaegerdos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.opentracing.Tracer;

@SpringBootApplication
public class JaegerdosApplication {

	@Bean
	public Tracer jaegerTracer(){
		Configuration configuration = new Configuration("spring-boot-dos");
		Tracer tracer = configuration.getTracerBuilder().build();
		return tracer;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JaegerdosApplication.class, args);
	}
}
