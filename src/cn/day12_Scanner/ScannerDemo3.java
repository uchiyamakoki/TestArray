package cn.day12_Scanner;

import java.util.Scanner;
/*
先获取一个数值，在获取一个字符串，会出现问题
主要原因：就是那个换行符号的问题

解决：
    A.先获取一个数值后，再创建一个新的键盘输入对象（同一个扫描器）
    B:把所有数据都先按照字符串获取，然后要什么，转成什么
 */
public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        Scanner sc2=new Scanner(System.in);

        String s2=sc2.nextLine();//String是nextLine

        System.out.println("a:"+a+",s2:"+s2);


    }
}
