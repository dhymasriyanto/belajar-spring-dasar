package ngodingkuy.tech.spring.core;
/**
*ComponentConfiguration 
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"ngodingkuy.tech.spring.core.service",
		"ngodingkuy.tech.spring.core.repository",
		"ngodingkuy.tech.spring.core.configuration"
})
public class ComponentConfiguration {

	
}

