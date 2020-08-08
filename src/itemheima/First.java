package itemheima;
import java.util.Arrays;

public class First {
    public static void main(String[] args){
        /* 创建对象，对象名为First */
        First obj = new First("s");
        obj.run();
        int sum = obj.sum();
        System.out.println(sum);
        //定义成绩数组 调用方法
        int[] scores = {89,23,66,98,-85,-119,120};
        obj.showTop3(scores);
    }
    /**
     * 知识点
     * 1.排序
     * 2.for循环倒序
     * 3.逻辑判断运算符
     * 4.创建对象 --传入参数
     * 5.continue 跳出循环；break 结束循环
     */
    public  void showTop3(int[] scores){
        Arrays.sort(scores);
        int num = 0;
        for(int i = scores.length-1;i>=0;i--){
            if(scores[i]<0||scores[i]>100){
                continue;
            }
            num++;
            if(num>3){
                break;
            }
            System.out.println(scores[i]);
        }
    }

    /**
     * 这个构造器仅有一个参数：name
     * @param name
     */
    public First(String name) {
        System.out.println("小狗的名字是 : " + name);
    }

    /**
     * 声明方法
     */
    //1.无返回值，无参数
    public void run(){
        System.out.println("hellow,word");
    }
    //2.有返回值，无参数
    public int sum() {
      //第一数组
        int[] age = {1,1,2,2,3,3,};
        int sum = 0;

        // 产生一个100以内的随机数，并赋值给数组的每个成员
        //nums[i] = (int)(Math.random()*100);
        for(int i=1;i<age.length;i++){
            sum=sum+i;
        }
        return sum;
    }

}
