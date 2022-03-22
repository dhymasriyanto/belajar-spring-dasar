package ngodingkuy.tech.spring.core.configuration;
/**
*BarConfiguration 
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ngodingkuy.tech.spring.core.data.Bar;

@Configuration
public class BarConfiguration {

	@Bean
	public Bar bar() {
		return new Bar();
	}
}

