package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
*MainConfiguration 
*/
@Configuration
@Import({
	FooConfiguration.class,
	BarConfiguration.class
})
public class MainConfiguration {

	
}

