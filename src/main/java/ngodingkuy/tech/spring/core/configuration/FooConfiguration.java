package ngodingkuy.tech.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Foo;

/**
*FooConfiguration 
*/
@Configuration
public class FooConfiguration {

	@Bean
	public Foo foo() {
		return new Foo();
	}
	@Bean
	public Foo foo2() {
		return new Foo();
	}
	@Bean
	public Foo foo3() {
		return new Foo();
	}
}

