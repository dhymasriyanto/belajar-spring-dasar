package ngodingkuy.tech.spring.core;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.data.FooBar;

/**
*OptionalConfiguration 
*/
@Configuration
public class OptionalConfiguration {

	@Bean
	public Foo foo(){
		return new Foo();
	}

	@Bean
	public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
		return new FooBar(foo.orElse(null), bar.orElse(null));
	}
}

