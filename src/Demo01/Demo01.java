package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 09:05
 */
public class Demo01 {
    @FunctionalInterface
            // 表明函数式编程
    interface IMmessage3 {
        void print();
    }
    public static class Test16 {
        public static void main(String[] args) {
            IMmessage3 mymessage3 = () -> System.out.println("MYMessage");
            mymessage3.print();
        }
    }

}
