package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-12 10:14
 */
public class Demo07 {
    private  String name;
    private  Integer age;

    public Demo07() {
    }

    public Demo07(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo07{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
