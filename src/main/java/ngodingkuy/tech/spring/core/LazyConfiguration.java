package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;

/**
* LazyConfiguration
*/
@Slf4j
@Configuration
public class LazyConfiguration {

	@Lazy
	@Bean
	public Foo foo() {
		log.info("Create new foo.");
		return new Foo();
	}

	@Bean
	public Bar bar() {
		log.info("Create new bar.");
		return new Bar();
	}
}
