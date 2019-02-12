package com.yan.beanfactorypostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author: QXY
 * @classDescribe: BeanFactoryPostProcessor是在Spring容器加载了bean的定义文件之后，在bean实例化之前执行的。这里手动修改
 * @createTime: 2019/2/11
 * @version: 1.0
 */
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("===================configurableListableBeanFactory======");

        //BeanFactoryPostProcessor发生在读取Bean的BeanDefinition后，Bean实例化之前，所以获取的是BeanDefinition
        BeanDefinition staffBeanDefinition = beanFactory.getBeanDefinition("myfactory");
        //获取bean属性
        MutablePropertyValues propertyValues = staffBeanDefinition.getPropertyValues();
        if(null!=staffBeanDefinition){
            propertyValues.addPropertyValue("yandaye", "Jack Ma");
        }


    }
}
