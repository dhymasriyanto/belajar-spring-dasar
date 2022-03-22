package ngodingkuy.tech.spring.core;
/**
*ComponentTest 
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.repository.ProductRepository;
import ngodingkuy.tech.spring.core.service.ProductService;

public class ComponentTest {
	private ConfigurableApplicationContext applicationContext;

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testComponent(){
		ProductService productService = applicationContext.getBean(ProductService.class);
		ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

		Assertions.assertSame(productService, productService2);
	}

	@Test
	void testConstructorComponentDependencyInjection(){
		ProductService productService = applicationContext.getBean(ProductService.class);
		ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

		Assertions.assertSame(productRepository, productService.getProductRepository());
	}
}

