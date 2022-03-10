package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.data.FooBar;

/**
* DependencyInjectionConfiguration
*/
@Configuration
public class DependencyInjectionConfiguration {

	@Bean
	public Foo foo() {
		return new Foo();
	}
	
	@Bean
	public Bar bar() {
		return new Bar();
	}

	@Bean
	public FooBar fooBar(Foo foo, Bar bar) {
		return new FooBar(foo, bar);
	}
}
