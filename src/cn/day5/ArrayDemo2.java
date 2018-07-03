package cn.day5;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr=new int[3];

        //输出数组名称
        System.out.println(arr);
        //输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------");

        //给数组元素赋值
        arr[0]=100;
        arr[2]=200;

        //输出数组名称
        System.out.println(arr);
        //输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------");
    }
}
