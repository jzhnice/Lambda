package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 09:09
 */
public class Demo02 {
    interface IMessage2 {
        void print();
    }

    public static class TestDemo {
        public static void main(String[] args) {
            IMessage2 message2 = new IMessage2() {//匿名内部类
                @Override
                public void print() {
                    System.out.println("MyMessage");
                }
            };
            message2.print();
        }
    }
}
