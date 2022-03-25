package ngodingkuy.tech.spring.core;
/**
*ComponentConfiguration 
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
		"ngodingkuy.tech.spring.core.service",
		"ngodingkuy.tech.spring.core.repository",
		"ngodingkuy.tech.spring.core.configuration"
})

@Import(MultiFoo.class)
public class ComponentConfiguration {

	
}

