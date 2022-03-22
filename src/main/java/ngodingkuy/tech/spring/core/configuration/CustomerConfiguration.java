package ngodingkuy.tech.spring.core.configuration;
/**
*CustomerConfiguration 
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ngodingkuy.tech.spring.core.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

	@Primary
	@Bean
	public CustomerRepository normalCustomerRepository() {
		return new CustomerRepository();
	}

	@Bean CustomerRepository premiumCustomerRepository(){
		return new CustomerRepository();
	}
}

