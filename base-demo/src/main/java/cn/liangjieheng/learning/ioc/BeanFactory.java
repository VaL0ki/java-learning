package cn.liangjieheng.learning.ioc;

import java.util.Set;

public interface BeanFactory {

    Class<?> getBean(String beanName);

    Set<Class<?>> listBeans();
}
