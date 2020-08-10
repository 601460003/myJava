package subject;

public class Room {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[10];
        Student[] students = new Student[50];
        Student one = new Student();
        one.say();
        for (int i = 0; i < 10; i++) {
            teachers[i] = new Teacher("A" + i, "C" + i);
        }
        for (int i = 0; i < 50; i++) {
            students[i] = new Student("b" + i, i);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > 0 && students[i].getAge() < 10) {
                System.out.println("我是老师管理的学习："+teachers[i].getName());
                System.out.println(students[i].getName());

            }

        }
    }
}
