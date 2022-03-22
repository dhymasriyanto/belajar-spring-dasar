package ngodingkuy.tech.spring.core.data;
/**
*Server 
*/

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

	@PostConstruct
	public void start() {
		log.info("Start server");
	}

	@PreDestroy
	public void stop() {
		log.info("Stop server");
	}
}

