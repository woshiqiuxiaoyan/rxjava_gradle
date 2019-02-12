import com.yan.vo.PeopleVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @author: QXY
 * @classDescribe: BeanWapper 使用
 * @createTime: 2019/2/12
 * @version: 1.0
 */
@Slf4j
public class BeanWrapperTest {


    /**
     * BeanWrapper 简单使用
     */
    @Test
    public void test1() {
        try {
            Object people = Class.forName("com.yan.vo.PeopleVO").newInstance();
            Object character = Class.forName("com.yan.vo.Character").newInstance();
            BeanWrapper beanWapper=new BeanWrapperImpl(people);
            beanWapper.setPropertyValue("character",character);
            log.info(String.format("========people :%s",((PeopleVO)people).getCharacter().getLevel()));
        } catch (Exception e) {
            log.error("=======反射实例化失败=====",e);
        }
    }

}
