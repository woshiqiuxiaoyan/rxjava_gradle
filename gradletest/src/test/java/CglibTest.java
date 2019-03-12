import org.junit.Test;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/16
 * @version: 1.0
 */
public class CglibTest {


    /**
     * cglib 实现代理
     *  因而类的修饰符不能含有final修饰符,并且方法同样不能使用static和final等修饰符,若含有就不能实现增强方法
     *  sayOthers 就不能出现增加方法（前置和后置）
     */
    @Test
    public void test() {
        CglibProxy cglib = new CglibProxy();
        HelloService helloService=cglib.getInstance(HelloServiceImpl.class);
        helloService.sayHello();
//        helloService.sayOthers("yandaye");
    }

    /**
     * jdk 实现代理
     * :代理对象和被代理对象必须同时实现同一接口(即含有同一套规范).
     */
    @Test
    public void test1(){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        HelloService helloService=new HelloServiceImpl();
        HelloService jdkService =  JdkProxy.getInstance(helloService);
        jdkService.sayOthers("yandaye");
    }





  /*  @Test
    public void test1() {
        BookFacadeCglib  cglib=new BookFacadeCglib();
        BookFacadeImpl1 bookCglib=(BookFacadeImpl1)cglib.getInstance(BookFacadeImpl1.class);
        bookCglib.addBook();

    }
*/
  /*  @Test
    public void test2() {
        BookFacadeCglib  cglib=new BookFacadeCglib();
        HelloService bookCglib=(HelloService)cglib.getInstance(HelloService.class);
        bookCglib.sayHello();

    }*/


}
