

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/16
 * @version: 1.0
 */

public class MyMethodInterfactor implements MethodInterceptor {

    @Override
    public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy) throws Throwable {

        System.out.println("插入前通知");

        methodProxy.invoke(o,objects);

        System.out.println("插入后通知");

        return null;
    }
}
