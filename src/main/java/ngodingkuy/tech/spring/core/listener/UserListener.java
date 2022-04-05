package ngodingkuy.tech.spring.core.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

	@EventListener(classes = LoginSuccessEvent.class)
	public void onLoginSuccesEvent(LoginSuccessEvent event){
		log.info("Success login on user {}", event.getUser());
	}
}

