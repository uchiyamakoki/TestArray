package cn.day5;
/*
数组操作的两个常见小问题

 ArrayIndexOutOfBoundsException:数组索引越界异常
    原因：你访问了不存在的索引

    NullPointException:数组索引越界异常
        原因：数组已经不在指向堆内存了。
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        //定义数组
        int[] arr={1,2,3};

        //System.out.println(arr[3]);
        arr=null;
        System.out.println(arr[0]);
    }
}
