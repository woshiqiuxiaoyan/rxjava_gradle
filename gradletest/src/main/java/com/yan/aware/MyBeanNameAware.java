package com.yan.aware;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/14
 * @version: 1.0
 */
public class MyBeanNameAware implements BeanNameAware {

    public List<String> beanName=new ArrayList<>();

    @Override
    public void setBeanName(String s) {
            this.beanName.add(s);
    }





}
