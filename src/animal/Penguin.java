package animal;

public class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }

    public static void main(String[] args) {
        Penguin p = new Penguin("大猩猩",888888);
        p.eat();
        p.sleep();
        p.introduction();
    }
    public void eat(){
        this.sleep();
        System.out.println("属于企鹅自己的吃方法");
    }
    public void sleep(){
        System.out.println("属于企鹅自己的睡方法");
    }

}