package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;

/**
* DependsOnConfiguration
*/
@Slf4j
@Configuration
public class DependsOnConfiguration {

	@Bean
	public Foo foo() {
		log.info("Create new Foo");
		return new Foo();
	}

	@Bean
	public Bar bar() {
		log.info("Create new Bar");
		return new Bar();
	}
}
