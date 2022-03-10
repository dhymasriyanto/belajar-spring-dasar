package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* DuplicateTest
*/
public class DuplicateTest {
	ApplicationContext context;

	@Test
	void testDuplicate(){
		context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

		//Foo foo = context.getBean(Foo.class);
		Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
			context.getBean(Foo.class);
		});
	}
	
	@Test
	void testGetDuplicate(){
		context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

		Foo foo1 = context.getBean("foo1", Foo.class);
		Foo foo2 = context.getBean("foo2", Foo.class);

		Assertions.assertNotSame(foo2, foo1);
	}
}
