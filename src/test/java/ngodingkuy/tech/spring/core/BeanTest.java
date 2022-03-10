package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* BeanTest
*/
public class BeanTest {
	ApplicationContext context;

	@Test
	void testCreateBean(){
		
		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Assertions.assertNotNull(context);
	}

		@Test
	void testGetBean(){
		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);

		Assertions.assertSame(foo1, foo2);
	}
}
