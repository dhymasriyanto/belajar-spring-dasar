package ngodingkuy.tech.spring.core.application;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ngodingkuy.tech.spring.core.data.Foo;
import ngodingkuy.tech.spring.core.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication {

	@Bean
	public Foo foo() {
		return new Foo();
	}

	//public static void main (String[] args) {
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
		//Foo foo = applicationContext.getBean(Foo.class);

		//System.out.println(foo);
	//}
	//public static void main (String[] args) {
		//SpringApplication application = new SpringApplication(FooApplication.class);
		
		//application.setListeners(List.of(new AppStartingListener()));

		//Custom Spring Application here

		//application.setBannerMode(Banner.Mode.OFF);

		//ConfigurableApplicationContext applicationContext = application.run(args);

		//Foo foo = applicationContext.getBean(Foo.class);

		//System.out.println(foo);
	//}
}

