import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author: QXY
 * @classDescribe: 正态分布
 * @createTime: 2019/2/15
 * @version: 1.0
 */
@Slf4j
public class GaussianText {


    @Test
    public void test1() {

        int a = 0, b = 100, u = 50;

        double v = Math.sqrt(50);


        double maxNum = 0;
        double minNum = 0;

        final double[] tmp = {0,0,0};
        for (int i = 0; i < 100; i++) {

            //            double result=StandardNormalDistribution();


            double result = NormalDistribution(v);


            if (result > maxNum) {
                maxNum = result;
                tmp[1] = tmp[0];
            }
            if (result < minNum) {
                minNum = result;
                tmp[2] = tmp[0];
            }

            System.out.println("max   " + (maxNum + u) + "   " + tmp[1]);
            System.out.println("min   " + (minNum + u) + "   " + tmp[2]);
            //            System.out.println(NormalDistribution(50,50f));
        }

        System.out.println("max   " + (maxNum + u) + "   " + tmp[1]);
        System.out.println("min   " + (minNum + u) + "   " + tmp[2]);

    }

    @Test
    public void test2() {
        long consumeTime = System.currentTimeMillis();

        int[] result = createRanDomGaussian(100000,0,100,50);

        consumeTime = System.currentTimeMillis() - consumeTime;

        System.out.println("用时 ："+consumeTime);
    }

    /**
     * 正态生成
     * @author: QXY
     * @createTime: 2019/2/15
     * @version: 1.0
     * @param numbers 生成数量
     * @param minNum 最小金额
     * @param maxNum 最大金额
     * @param u 均值
     * @return void
     */
    public int[] createRanDomGaussian(int numbers,int minNum,int maxNum,int u) {

        int[] resultList = new int[numbers];

        /**
         * 方差
         */
        double v = Math.sqrt((maxNum - minNum) / 2);

        for (int i = 0; i < numbers; i++) {
            double result = NormalDistribution(v);
            int tmp = (int)Math.round(u + result);
            if (tmp > maxNum) {
                tmp = maxNum;
            } else if (tmp < minNum) {
                tmp = minNum;
            }
            resultList[i] = tmp;
        }
        return resultList;
    }


    //普通正态随机分布
    //参数 u 均值
    //参数 v 方差
    public synchronized static double NormalDistribution(double v) {
        return new java.util.Random().nextGaussian() * v;
    }



}
