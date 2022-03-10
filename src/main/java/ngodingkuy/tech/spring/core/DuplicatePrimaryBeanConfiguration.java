package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* DuplicatePrimaryBeanConfiguration
*/
public class DuplicatePrimaryBeanConfiguration {

	@Primary
	@Bean
	public Foo foo1(){
		return new Foo();
	}


	@Bean
	public Foo foo2(){
		return new Foo();
	}
}
