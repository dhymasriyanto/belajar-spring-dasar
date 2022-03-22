package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Connection;
import ngodingkuy.tech.spring.core.data.Server;

/**
*LifeCycleConfiguration 
*/
@Configuration
public class LifeCycleConfiguration {

	@Bean
	public Connection connection() {
		return new Connection();
	}

	//@Bean(initMethod = "start", destroyMethod = "stop")
	@Bean
	public Server server() {
		return new Server();
	}
}

