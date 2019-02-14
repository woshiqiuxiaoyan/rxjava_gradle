package com.yan.aware;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/14
 * @version: 1.0
 */
@Getter
public class MyApplicationAware implements ApplicationContextAware {
    private  ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
