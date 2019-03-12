import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/3/12
 * @version: 1.0
 */
public class JdkProxy implements InvocationHandler {


    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    public static <T> T getInstance(Object obj) {
        return (T)Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),new JdkProxy(obj));
    }

    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        System.out.println("jdk 前置");
        Object obj = method.invoke(target,args);
        System.out.println("jdk 后置");
        return obj;
    }

}
