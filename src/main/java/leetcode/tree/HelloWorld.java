package leetcode.tree;

import java.util.*;
public class HelloWorld{

    public static void main(String[] args)  {
        new HelloWorld().test();
        System.out.println("hello world");
    }
    /**
     *
     * the program is tool  and I need take care to so many important things
     *
     */
    public void test() {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("hello","world");
        map.put("world","hello");
        int size = map.size();
        System.out.println("this size is "+size);
        System.out.println("this is test method");
    }

}
