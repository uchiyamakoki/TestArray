package cn.day12_Scanner;

import java.util.Scanner;

/*
Scanner：用于接受键盘输入
    A.导包
    B.创建对象
    C.调用方法
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc=new Scanner(System.in);//System类下的静态字段 public final static InputStream in 重点是静态才能调用
        //用了Scanner(InputStream source)的构造方法
        //InputStream is=System.in  对应着标准的输入流，对应着键盘输入
        int x=sc.nextInt();//用来将Scanner转换成对应类型
        System.out.println("x:"+x);
    }

}
