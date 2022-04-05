package ngodingkuy.tech.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ngodingkuy.tech.spring.core.application.FooApplication;
import ngodingkuy.tech.spring.core.data.Foo;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

	
	@Autowired
	Foo foo;

	@Test
	void testSpringBoot(){
		Assertions.assertNotNull(foo);
	}
}

