package subject;
import java.text.*;
import java.util.Date;

public class DateDemo {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));
    }
}
