package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* LazyTest
*/
public class LazyTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(LazyConfiguration.class);
	}
	@Test
	void testLazy() {
		Foo foo = context.getBean(Foo.class);
	}
}
