package ngodingkuy.tech.spring.core;
/**
*OptionalTest 
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.data.FooBar;

public class OptionalTest {

	private ConfigurableApplicationContext applicationContext;

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testOptional(){
		Foo foo = applicationContext.getBean(Foo.class);
		FooBar fooBar = applicationContext.getBean(FooBar.class);

		Assertions.assertNull(fooBar.getBar());
		Assertions.assertSame(foo, fooBar.getFoo());
	}
}

