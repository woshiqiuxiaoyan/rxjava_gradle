package com.yan.test;

import com.yan.vo.PeopleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/11
 * @version: 1.0
 */
public class SpringMain {

    static Logger logger = LoggerFactory.getLogger(SpringMain.class);

    public static void main(String[] args) {
        logger.info("=============我进来了================");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-test.xml");
        PeopleVO peopleVO = applicationContext.getBean(PeopleVO.class);
        System.out.println(peopleVO);

    }

}
