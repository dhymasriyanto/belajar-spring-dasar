package ngodingkuy.tech.spring.core;
/**
*ImportTest 
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;

public class ImportTest {

	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(MainConfiguration.class);
		context.registerShutdownHook();
	}

	@Test
	void testImport(){
		Foo foo = context.getBean(Foo.class);
		Bar bar = context.getBean(Bar.class);
	}
}

