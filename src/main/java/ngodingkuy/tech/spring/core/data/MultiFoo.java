package ngodingkuy.tech.spring.core.data;
/**
*MultiFoo 
*/

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MultiFoo {

	@Getter
	private List<Foo> foos;

	public MultiFoo(ObjectProvider<Foo> objectProvider) {
		this.foos = objectProvider.stream().collect(Collectors.toList());
	}


}

