package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {

	private ConfigurableApplicationContext applicationContext;

	@Configuration
	@Import(FooBeanFactoryPostProcessor.class)
	public static class TestConfiguration{

	}

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testBeanFactoryPostProcessor(){
		Foo foo = applicationContext.getBean(Foo.class);

		Assertions.assertNotNull(foo);
	}
}

