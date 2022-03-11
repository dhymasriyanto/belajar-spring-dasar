package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.data.FooBar;

/**
* DependencyInjectionTest
*/
public class QualifierInjectionTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(QualifierInjectionConfiguration.class);
	}

	@Test
	void testDI(){
		Foo foo = context.getBean("fooSecond", Foo.class);
		Bar bar = context.getBean(Bar.class);
		FooBar fooBar = context.getBean(FooBar.class);

		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertSame(bar, fooBar.getBar());
	}

	@Test
	void testNoDI(){

		var foo = new Foo();
		var bar = new Bar();
		var fooBar = new FooBar(foo, bar);

		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertSame(bar, fooBar.getBar());
	}
}
