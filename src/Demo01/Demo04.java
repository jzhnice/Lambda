package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 09:26
 */
public class Demo04 {
    @FunctionalInterface
    interface  IMath{
        int add( int a,int b);
    }

    public static class Test12{
        public static void main(String[] args) {
            IMath math = Integer::max;      // 最大
            IMath matha = Integer::sum;  //  相加
            IMath matha2 = (p1,p2)->(p1+p2);  //  相加
            System.out.println(math.add(21,30));
            System.out.println(matha.add(21,30));
        }
        public int sum (int a, int v){
            return a + v;
        }
    }
}


