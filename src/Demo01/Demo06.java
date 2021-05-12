package Demo01;

import java.util.Locale;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 10:01
 */
@FunctionalInterface
interface IMyMwsage2<R> {
    R zhuanchengdaxie();

}
public class Demo06 {
    public static void main(String[] args) {
        IMyMwsage2<String> shili = "hello"::toUpperCase;   //  转为大写
        // 表明 引用对象       "hello"::toUpperCase；
        System.out.println(shili.zhuanchengdaxie());
    }
}
