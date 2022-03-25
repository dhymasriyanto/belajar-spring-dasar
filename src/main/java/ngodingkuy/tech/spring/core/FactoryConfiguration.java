package ngodingkuy.tech.spring.core;

import org.springframework.context.annotation.Configuration;
/**
*FactoryConfiguration 
*/
import org.springframework.context.annotation.Import;

import ngodingkuy.tech.spring.core.factory.PaymentGatewayClientFactoryBean;
@Configuration
@Import({PaymentGatewayClientFactoryBean.class})
public class FactoryConfiguration {

	
}

