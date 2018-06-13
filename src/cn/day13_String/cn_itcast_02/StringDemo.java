package cn.day13_String.cn_itcast_02;
/*
字符串一旦被赋值，就不能被改变
 */
public class StringDemo {
    public static void main(String[] args) {
        String s="hello";
        s+="world";
        System.out.println("s:"+s);
    }
}
