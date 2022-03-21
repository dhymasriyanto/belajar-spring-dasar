package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;

/**
* ScopeTest
*/
public class ScopeTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp(){
		context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
	}

	@Test
	void testScope(){
		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);
		Foo foo3 = context.getBean(Foo.class);

		Assertions.assertNotSame(foo1, foo2);
		Assertions.assertNotSame(foo1, foo3);
		Assertions.assertNotSame(foo2, foo3);
	}

	@Test
	void doubletonScopeTest(){
		Bar bar1 = context.getBean(Bar.class);
		Bar bar2 = context.getBean(Bar.class);
		Bar bar3 = context.getBean(Bar.class);
		Bar bar4 = context.getBean(Bar.class);

		Assertions.assertSame(bar1, bar3);
		Assertions.assertSame(bar2, bar4);

		Assertions.assertNotSame(bar1, bar2);
		Assertions.assertNotSame(bar3, bar4);
	}
}
