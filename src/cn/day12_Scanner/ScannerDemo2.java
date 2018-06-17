package cn.day12_Scanner;

import java.util.Scanner;

/*
基本格式：
    public boolean hasNextXXX（）；判断是否有某种类型
    public XXX nextXXX（）； 获取该元素
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc=new Scanner(System.in);

        //获取数据
        if(sc.hasNextInt()){
            int x=sc.nextInt();
            System.out.println("x:"+x);
        }else {
            System.out.println("您输入的数据有误");
        }
    }
}
