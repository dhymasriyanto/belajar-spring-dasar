package ngodingkuy.tech.spring.core.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
* DoubletonScope
*/
public class DoubletonScope implements Scope{

	private List<Object> objects = new ArrayList<>(2);
	private Long counter = -1L;

	@Override
	public Object get(String arg0, ObjectFactory<?> arg1) {
		counter++;
		if (objects.size() == 2) {
			int index = (int)(counter % 2);
			return objects.get(index);
		}else{
			Object object = arg1.getObject();
			objects.add(object);
			return object;
		}
	}
	@Override
	public Object remove(String arg0) {
		if (!objects.isEmpty()) {
			return objects.remove(0);
		}
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
