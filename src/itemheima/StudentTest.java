package itemheima;

import java.util.Scanner;

public class StudentTest {
    //一个教室50个学生 根据年龄划分给每个任课老师
    public static void main(String[] args) {
        System.out.println("请录入学生姓名，学号、成绩:");
        Scanner in=new Scanner(System.in);
//		int[] a=new int[3];对照数组的使用
//  	1、创建对象数组，Student类有三个属性，所以传入数据需要传三个数据
        Student[] s=new Student[5];//对象数组的创建是一样的
        for (int i = 0; i < s.length; i++) {
            //还可以一个个输入s[i].getName,s[i].getNum,s[i].getGrade,一个个输入,用下面的方法更加快捷
            s[i]=new Student(in.next(),in.nextInt(),in.nextInt());
        }
        Student s1=null;//创建一个为空的对象进行数据交换
        //根据学生的成绩进行排序,这里运用冒泡排序
        for(int i=0;i<s.length;i++) {
            for (int j =0; j < s.length; j++) {
                if(j!=4)//这里必须加上这个条件，不然数字会报出越界的问题
                    if(s[j].getGrades()<s[j+1].getGrades()) {
                        s1=s[j+1];
                        s[j+1]=s[j];
                        s[j]=s1;
                    }
            }
        }

        System.out.println("学生的成绩排名如下\n姓名\t学号\t成绩");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+"\t"+s[i].getNum()+"\t"+s[i].getGrades());
        }

    }
}
