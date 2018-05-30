package cn.testarray2;

public class Test02 {
    public static void main(String[] args) {
        /*
        1.数组是相同数据类型（数据类型可以有任意类型）的有序集合
        2.数组也是对象。数组元素相当于对象的成员变量
        3.数组的长度是确定的，不可变的，若果越界，报ArrayIndexOutof....
         */

        int[] a=new int[3];
        a[0]=23;
        a[1]=28;
        a[2]=32;
        double[] b=new double[2];
        Car[] cars=new Car[10];//指向对象的数组
        cars[0]=new Car("奔驰");
        cars[1]=new Car("宝马");
        cars[2]=new Car("奔驰");

        System.out.println(cars[0].name);
        System.out.println(a.length);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
