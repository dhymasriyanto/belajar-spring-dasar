package ngodingkuy.tech.spring.core.service;
/**
*CustomerService 
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import ngodingkuy.tech.spring.core.repository.CustomerRepository;

@Component
public class CustomerService {

	//@Getter
	//@Autowired
	//private CustomerRepository customerRepository;
	
	@Getter
	@Autowired
	@Qualifier("normalCustomerRepository")
	private CustomerRepository normalCustomerRepository;

	@Getter
	@Autowired
	@Qualifier("premiumCustomerRepository")
	private CustomerRepository premiumCustomerRepository;
}

