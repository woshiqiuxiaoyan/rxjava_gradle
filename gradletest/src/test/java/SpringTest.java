import com.yan.aware.MyApplicationAware;
import com.yan.aware.MyBeanNameAware;
import com.yan.vo.PeopleVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/14
 * @version: 1.0
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {"classpath:spring/spring-test.xml"})
public class SpringTest {

    @Autowired
    MyBeanNameAware myBeanNameAware;

    @Autowired
    @Qualifier("myApplication")
    MyApplicationAware myApplicationAware;

    /**
     * TEST APPLICATION
     */
    @Test
    public void test2(){
        PeopleVO peopleVO = (PeopleVO)myApplicationAware.getApplicationContext().getBean("people");
        System.out.println(peopleVO);

    }

}
