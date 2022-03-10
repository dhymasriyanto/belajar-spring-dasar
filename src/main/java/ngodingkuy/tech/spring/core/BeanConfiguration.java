package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.data.Foo;

/**
* BeanConfiguration
*/
@Slf4j
@Configuration
public class BeanConfiguration {

	@Bean
	public Foo foo(){
		Foo foo = new Foo();
		log.info("Create new foo");
		return foo;
	}
}
