package ngodingkuy.tech.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.data.FooBar;

/**
* QualifierInjectionConfiguration
*/
@Configuration
public class QualifierInjectionConfiguration {

	@Primary
	@Bean
	public Foo fooFirst() {
		return new Foo();
	}

	@Bean
	public Foo fooSecond() {
		return new Foo();
	}

	@Bean
	public Bar bar() {
		return new Bar();
	}

	@Bean
	public FooBar fooBar(@Qualifier("fooSecond")Foo foo, Bar bar) {
		return new FooBar(foo, bar);
	}
}
