package com.vtb.demobootvtb.dima;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class RandomSupportBPP implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            InjectRandom annotation = field.getAnnotation(InjectRandom.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int i = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(bean,i);
            }
        }
        return bean;
    }
}




