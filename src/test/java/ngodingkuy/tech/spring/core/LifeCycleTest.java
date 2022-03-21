package ngodingkuy.tech.spring.core;
/**
*LifeCycleTest 
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Connection;

public class LifeCycleTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
	}

	@Test
	void testConnection() {
		Connection connection = context.getBean(Connection.class);
	}
}

