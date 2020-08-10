package subject;

public class Student {
    private String name;
    private int age;

    public static void main(String[] args) {
        say();
    }
    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static void say(){
        System.out.println("say u love me");
    }
}
