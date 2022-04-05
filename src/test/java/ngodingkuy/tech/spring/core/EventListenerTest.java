package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.listener.LoginSuccessListener;
import ngodingkuy.tech.spring.core.listener.UserListener;
import ngodingkuy.tech.spring.core.service.UserService;

public class EventListenerTest {

	private ConfigurableApplicationContext applicationContext;

	@Configuration
	@Import({
		UserListener.class,
		UserService.class,
		LoginSuccessListener.class
	})
	public static class TestConfiguration{

	}

	@BeforeEach
	void setUp(){
		applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
		applicationContext.registerShutdownHook();
	}

	@Test
	void testEventListener(){
		UserService userService = applicationContext.getBean(UserService.class);

		userService.login("eko", "eko");
	}
}

