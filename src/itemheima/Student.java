package itemheima;

/**
 * @author gorit
 * @date 2019年4月10日
 * 对象数组学生类的创建
 */
public class Student {
    //成员变量 通过构造函数 或者get、set初始化。
    private String name;//学生的姓名
    private int num;//学生的学号信息
    private int grades;//学生的成绩

    //有参的构造方法
    public Student(String name, int num, int grades) {
        super();
        this.name = name;
        this.num = num;
        this.grades = grades;
    }

    //无参的构造方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public Student() {
    }

}