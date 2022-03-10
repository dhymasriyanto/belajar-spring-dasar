package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import ngodingkuy.tech.spring.core.data.Foo;

/**
* BeanNameConfiguration
*/
public class BeanNameConfiguration {

	@Primary
	@Bean(value = "fooFirst")
	public Foo foo1(){
		return new Foo();
	}

	@Bean(value = "fooSecond")
	public Foo foo2(){
		return new Foo();
	}
}
