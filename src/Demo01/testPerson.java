package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 10:17
 */
@FunctionalInterface
interface  IMyPerson<R,PN,PA>{
    public  R message(PN  naem, PA age);
}


public class testPerson {
    public static void main(String[] args) {
        //  Demo07 :: new;  引用构造方法
        IMyPerson<Demo07,String,Integer> shili = Demo07 :: new;
        System.out.println(shili.message("eLonMask",45));
    }

}
