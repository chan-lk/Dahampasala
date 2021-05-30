package com.chanlk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = "com.chanlk")
@EnableJpaRepositories
@EnableTransactionManagement
@RestController
public class Application {

	public static void main(String[] args) {
//		Method 1
		SpringApplication.run(Application.class, args);
		
//		Method 2
//        SpringApplicationBuilder app = new SpringApplicationBuilder(Application.class);
//        app.run();
		
//		Method 3
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
//		applicationContext.start();
	}
	

	@GetMapping("/")
	public String test() {
		return "Application deployed";
	}

}
