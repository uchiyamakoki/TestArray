package cn.day5;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //定义第一个数组
        int[] arr=new int[2];
        //定义第二个数组
        int[] arr2=new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("-------");

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------");

        //给元素重新赋值
        arr[1]=20;

        arr2[1]=20;
        arr2[0]=40;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("-------");

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------");
    }

}
