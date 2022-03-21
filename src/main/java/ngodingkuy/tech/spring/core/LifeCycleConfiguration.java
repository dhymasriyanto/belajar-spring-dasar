package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Connection;

/**
*LifeCycleConfiguration 
*/
@Configuration
public class LifeCycleConfiguration {

	@Bean
	public Connection connection() {
		return new Connection();
	}
}

