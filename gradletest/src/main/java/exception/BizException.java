package exception;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/1/25
 * @version: 1.0
 */
public class BizException extends RuntimeException {


    public BizException(String message) {
        super(message);
    }
}
