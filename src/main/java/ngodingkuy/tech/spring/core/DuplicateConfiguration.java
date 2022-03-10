package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* DuplicateConfiguration
*/
@Configuration
public class DuplicateConfiguration {

	@Bean
	public Foo foo1(){
		return new Foo();
	}

	@Bean
	public Foo foo2(){
		return new Foo();
	}
}
