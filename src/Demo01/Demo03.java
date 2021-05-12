package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 09:17
 */
public class Demo03 {
    @FunctionalInterface
    interface  IMmessage{
        public void print();
    }

    public static class TestDemo{
        public static void main(String[] args) {
            IMmessage mmessage = () ->{
                System.out.println("hello");
                System.out.println("world");
                System.out.println("hello world");
            };
            mmessage.print();

        }
    }
}
