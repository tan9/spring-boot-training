package com.cht.inception;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class Application
		extends SpringBootServletInitializer
		implements WebApplicationInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
