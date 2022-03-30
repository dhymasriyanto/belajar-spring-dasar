package ngodingkuy.tech.spring.core;
/**
*BeanPostProcessorTest 
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Car;

public class BeanPostProcessorTest {

	private ConfigurableApplicationContext applicationContext;

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testBeanPostProcessor(){
		Car car = applicationContext.getBean(Car.class);

		System.out.println(car.getId());
		Assertions.assertNotNull(car.getId());
	}
}

