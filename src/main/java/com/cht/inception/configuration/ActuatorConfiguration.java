package com.cht.inception.configuration;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorConfiguration {

	@Bean
	public HealthIndicator holyUpHealthIndicator() {
		return () -> Health.up().withDetail("hp", 10000).build();
	}
}
