package com.Nuttapat.BackendSide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendSideApplication {
	private static final Logger logger = LoggerFactory.getLogger(BackendSideApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendSideApplication.class, args);

		logger.info("SPRING_DATASOURCE_URL: " + System.getenv("SPRING_DATASOURCE_URL"));
		logger.info("SPRING_DATASOURCE_USERNAME: " + System.getenv("SPRING_DATASOURCE_USERNAME"));
	}
}
