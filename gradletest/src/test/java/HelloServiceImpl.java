/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/3/12
 * @version: 1.0
 */
public class HelloServiceImpl implements HelloService {
    public HelloServiceImpl() {
        System.out.println("HelloService构造");
    }

    /**
     * 该方法不能被子类覆盖,Cglib是无法代理final修饰的方法的
     */
    @Override
    public String sayOthers(String name) {
        System.out.println("HelloService:sayOthers>>" + name);
        return null;
    }

    public void sayHello() {
        System.out.println("HelloService:sayHello");
    }
}
