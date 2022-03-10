package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* PrimaryTest
*/
public class PrimaryTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(DuplicatePrimaryBeanConfiguration.class);
	}

	@Test
	void testPrimary(){
		Foo foo = context.getBean(Foo.class);
		Foo foo1 = context.getBean("foo1", Foo.class);
		Foo foo2 = context.getBean("foo2", Foo.class);

		Assertions.assertSame(foo, foo1);
		Assertions.assertNotSame(foo1, foo2);
		Assertions.assertNotSame(foo, foo2);
	}
}
