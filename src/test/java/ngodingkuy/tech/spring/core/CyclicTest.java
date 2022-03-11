package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
* CyclicTest
*/
public class CyclicTest {

	private ApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
	}

	@Test
	void testCyclic(){
		
	}
}
