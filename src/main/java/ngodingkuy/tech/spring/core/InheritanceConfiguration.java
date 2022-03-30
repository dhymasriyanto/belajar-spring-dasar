package ngodingkuy.tech.spring.core;
/**
*InheritanceConfiguration 
*/

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.service.MerchantServiceImpl;

@Configuration
@Import({
	MerchantServiceImpl.class
})
public class InheritanceConfiguration {
}

