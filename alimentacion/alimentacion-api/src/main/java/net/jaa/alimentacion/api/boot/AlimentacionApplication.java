package net.jaa.alimentacion.api.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "alimentacion")
@ServletComponentScan(basePackages = "alimentacion")
public class AlimentacionApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(AlimentacionApplication.class, args);
	}	
}