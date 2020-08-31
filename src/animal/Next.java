package animal;

import java.util.ArrayList;
import java.util.Collections;  // 引入 Collections 类

public class Next {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add("Weibo");
        sites.add("Weibo");
        sites.set(0,"zhangzhiwei");
        sites.remove(0);
        Collections.sort(sites);  // 字母排序
        for (String i : sites) {
            System.out.println(i);
        }
        System.out.println(sites.size());
    }
}