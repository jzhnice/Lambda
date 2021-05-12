package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 10:06
 */
interface  IMyMessage6<R,P>{
    R compare(P canshu1, P canshu2);
}
public class Test3 {
    public static void main(String[] args) {
        IMyMessage6 <Integer, String> list =String::compareTo;
        System.out.println(list.compare("啊" ,"吧"));
        System.out.println(list.compare("b" ,"a"));
    }
}
