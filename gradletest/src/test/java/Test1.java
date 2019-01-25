import exception.BizException;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/1/25
 * @version: 1.0
 */
@Slf4j
public class Test1 {


    @Test
    public void test1() {


        String name = "qiuxy";
        if (StringUtils.isBlank(name)) {
            System.out.println("this string is null");
        }
    }

    /**
     * text rxjava2
     */
    @Test
    public void test2() {


        /**
         * 第一步：初始化Observable
         */
        Observable observable = Observable.create((observableEmitter) -> {
            log.info("=====订阅成功2====");


            observableEmitter.setDisposable(new Disposable() {
                @Override
                public void dispose() {
                    log.info("=====dispose 被调用了=====");
                }

                @Override
                public boolean isDisposed() {
                    return true;
                }
            });

            observableEmitter.onNext("yandaye1");

            observableEmitter.onNext("yandaye2");

//            observableEmitter.onNext("中断");

            observableEmitter.onNext("yandaye3");

            /**
             * onComplete 和 tryOnError 互斥  complete 和 error 最终都会调用 dispose
             */
            observableEmitter.onComplete();

            observableEmitter.tryOnError(new BizException("customException"));
        });


        /**
         *  第二步：初始化Observer
         */
        Observer observer =    new Observer<Object>(){

            private Disposable disposable;

            @Override
            public void onSubscribe(Disposable disposable) {
                log.info(String.format("======= 发起订阅1 :%s ",disposable));
               this.disposable=disposable;

            }

            @Override
            public void onNext(Object o) {
                log.info(String.format("======= onNext :%s ",o));
                if(o.toString().equalsIgnoreCase("中断")){
                    log.info("=============我被中断了=============");
                    disposable.dispose();
                }
            }

            @Override
            public void onError(Throwable throwable) {
                log.info(String.format("======= onError :%s ",throwable));

            }

            @Override
            public void onComplete() {
                log.info(String.format("======= onComplete ===="));
            }
        };

        /**
         *   第三步：订阅
         */
        observable.subscribe(observer);

    }


}
