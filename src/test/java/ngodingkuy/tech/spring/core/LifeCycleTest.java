package ngodingkuy.tech.spring.core;
/**
*LifeCycleTest 
*/

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Connection;
import ngodingkuy.tech.spring.core.data.Server;

public class LifeCycleTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		context.registerShutdownHook();
	}

	@AfterEach
	void tearDown(){
		//context.close();
	}

	@Test
	void testConnection() {
		Connection connection = context.getBean(Connection.class);
	}

	@Test
	void testServer(){
		Server server = context.getBean(Server.class);
	}
}

