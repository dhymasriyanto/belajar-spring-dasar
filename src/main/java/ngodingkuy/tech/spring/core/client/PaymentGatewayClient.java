package ngodingkuy.tech.spring.core.client;
/**
*PaymentGateway 
*/

import lombok.Data;

@Data
public class PaymentGatewayClient {

	private String endpoint;

	private String publicKey;

	private String privateKey;
}

