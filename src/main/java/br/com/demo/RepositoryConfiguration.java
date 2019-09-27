package br.com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.demo.repository.UserEventHandler;

@Configuration
public class RepositoryConfiguration {
	
	@Bean
	UserEventHandler userEventHandler() {
		return new UserEventHandler();
	}

}
