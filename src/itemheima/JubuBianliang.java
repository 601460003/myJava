package itemheima;

public class JubuBianliang {
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;

    /**
     * 3.类变量（静态变量）。
     */
    //salary1是静态的私有变量
    private static double salary1;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        JubuBianliang JubuBianliang = new JubuBianliang("RUNOOB");
        JubuBianliang.setSalary(1000.0);
        JubuBianliang.printEmp();
        JubuBianliang.pupAge();
        salary1 = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary1);
        System.out.println(DEPARTMENT+"开发类型:"+DEPARTMENT);
    }

    /**
     * 1.局部变量
     * 必须经过初始化，才可以使用。
     */
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    /**
     * 2.实例变量 类种实例化对象调用 改变参数的变量
     */
    //在构造器中对name赋值
    public JubuBianliang(String empName) {
        name = empName;
    }

    //设定salary的值
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // 打印信息
    public void printEmp() {
        System.out.println("名字 : " + name);
        System.out.println("薪水 : " + salary);
    }
}
