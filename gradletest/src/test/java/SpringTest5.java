import com.yan.commonfactory.PeopleFactory;
import com.yan.test.SpringMain;
import com.yan.vo.PeopleVO;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/11
 * @version: 1.0
 */
public class SpringTest5 {

    static Logger logger = LoggerFactory.getLogger(SpringMain.class);

    /**
     * test beanfactoryprocessor
     */
    @Test
    public void test1() {
        logger.info("=============我进来了================");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-test.xml");
        PeopleFactory factory=  applicationContext.getBean(PeopleFactory.class);
        System.out.println("======================   "+factory);
    }


    /**
     * test beanNameAware
     */
    @Test
    public void test2() {
        logger.info("=============我进来了================");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-test.xml");
        PeopleFactory factory=  applicationContext.getBean(PeopleFactory.class);
        System.out.println("======================   "+factory);
    }




}
