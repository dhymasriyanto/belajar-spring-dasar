package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.data.Car;
import ngodingkuy.tech.spring.core.processor.IdGeneratorBeanPostProcessor;

/**
*BeanPostProcessorConfiguration 
*/
@Configuration
@Import({
	Car.class,
	IdGeneratorBeanPostProcessor.class
})
public class BeanPostProcessorConfiguration {

	
}

