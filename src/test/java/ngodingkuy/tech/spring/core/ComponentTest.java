package ngodingkuy.tech.spring.core;
/**
*ComponentTest 
*/

import org.apache.logging.log4j.message.MultiformatMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ngodingkuy.tech.spring.core.data.MultiFoo;
import ngodingkuy.tech.spring.core.repository.CategoryRepository;
import ngodingkuy.tech.spring.core.repository.CustomerRepository;
import ngodingkuy.tech.spring.core.repository.ProductRepository;
import ngodingkuy.tech.spring.core.service.CategoryService;
import ngodingkuy.tech.spring.core.service.CustomerService;
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

	@Test
	void testSetterComponentDependencyInjection(){
		CategoryService categoryService = applicationContext.getBean(CategoryService.class);
		CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);


		Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
	}

	@Test
	void testFieldComponentDependencyInjection(){
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
		CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

		Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
		Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
	}

	@Test
	void testObjectProvider(){
		MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);

		Assertions.assertEquals(3, multiFoo.getFoos().size());
	}
}

