package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.Car;

public class OrderedTest {

	private ConfigurableApplicationContext applicationContext;

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testOrdered(){
		Car car = applicationContext.getBean(Car.class);

		Assertions.assertNotNull(car.getId());

		Assertions.assertTrue(car.getId().startsWith("PZN-"));
	}

}

