package ngodingkuy.tech.spring.core.data;

import org.springframework.stereotype.Component;

import lombok.Getter;
import ngodingkuy.tech.spring.core.aware.IdAware;

/**
*Car 
*/
@Component
public class Car  implements IdAware{

	@Getter
	private String id;

	@Override
	public void setId(String id) {
		this.id = id;
	}


}

