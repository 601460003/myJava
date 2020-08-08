
public class HelloWorld{
    int puppyAge;
    public HelloWorld(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }
    public HelloWorld(){
        //这个构造器仅有一个参数：name
        System.out.println("无参数构造函数 : " );
    }
    public static void main(String[] args){
        // 下面的语句将创建一个Puppy对象
        HelloWorld HelloWorld = new HelloWorld( "tommy" );
        HelloWorld first = new HelloWorld();
        System.out.println(first);
        /* 通过方法来设定age */
        HelloWorld.setAge( 5 );
        /* 调用另一个方法获取age */
        HelloWorld.getAge( );
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + HelloWorld.puppyAge );
    }


    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }
}
