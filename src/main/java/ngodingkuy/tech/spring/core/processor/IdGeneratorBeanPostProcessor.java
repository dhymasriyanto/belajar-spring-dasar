package ngodingkuy.tech.spring.core.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ngodingkuy.tech.spring.core.aware.IdAware;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("Set Id Generator for Bean {}", bean);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
