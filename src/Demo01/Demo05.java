package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 09:34
 */

    @FunctionalInterface
    interface  IMath< P,R>{
        R zhuanhuancanshu(P shili);

    public class Demo05 {

        public static void main(String[] args) {
            IMath<Integer,String> message = String::valueOf;    //  进行方法调用
            String str= message.zhuanhuancanshu(100);   // 转换为字符串 所以是三位  1000 就是四位   相当于调用了string.valueof
            System.out.println(str.length());
        }
    }
}
