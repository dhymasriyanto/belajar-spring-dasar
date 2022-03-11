package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
* DependsOnTest
*/
public class DependsOnTest {

	private ApplicationContext context;

	@BeforeEach
	void startUp(){
		context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
	}

	@Test
	void testDependsOn() {
		
	}
}
