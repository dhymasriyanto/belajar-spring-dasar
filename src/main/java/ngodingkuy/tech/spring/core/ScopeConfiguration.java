package ngodingkuy.tech.spring.core;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.data.Bar;
import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.scope.DoubletonScope;

/**
* ScopeConfiguration
*/
@Slf4j
@Configuration
public class ScopeConfiguration {

	@Bean
	@Scope("prototype")
	public Foo foo() {
		log.info("Create new foo");
		return new Foo();
	}

	@Bean
	public CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		configurer.addScope("doubleton", new DoubletonScope());
		return configurer;
	}

	@Bean
	@Scope("doubleton")
	public Bar bar() {
		log.info("Create new bar");
		return new Bar();
	}
}
