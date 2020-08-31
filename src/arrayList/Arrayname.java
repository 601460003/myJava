package arrayList;

//1.引入数组包中的数组类
import java.util.ArrayList;
//2.引入数组中的工具函数包 Collections 类
import java.util.Collections;

/**
 * Java ArrayList 数组方法调用 CURD 方法
 */
public class Arrayname {
    public static void main(String[] args) {
        //创建学生对象Lily
        Student Lily = new Student("John", 16,"boy");
        Student John = new Student("John", 16,"boy");
        Student Ming = new Student("Ming", 17, "girl");
        Student Jack = new Student("Jack", 18, "boy");
        Student nn = new Student();
        nn.setAge(88);
        //3.初始化 方法
        ArrayList<Student> sites = new ArrayList<Student>();
        sites.add(John);
        sites.add(Lily);
        sites.add(Ming);//增
        sites.add(nn);
//        sites.remove(0);         //删
//        sites.set(0, "zhangzhiwei");  //改
//        sites.get(0);                //查
//
//        System.out.println(sites.size()); //数组长度
//        Collections.sort(sites);  // 排序
        //for each 遍历数组
        System.out.println(sites);
//        for (Student i : sites) {
//            System.out.println(i);
//        }

    }
}