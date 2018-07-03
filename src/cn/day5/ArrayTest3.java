package cn.day5;
/*
数组逆序
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr={12,98,50,34,76};

        System.out.println("逆序后：");
        reverse2(arr);
        System.out.println(arr[0]);


    }

    /*
    需求：数组逆序
        返回：void（可能有人会想到逆序后的数组，我就是。。。）
     */
    public static void reverse(int[] arr){
        /*//第一次交换
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        //第一次交换
        int temp=arr[1];
        arr[0]=arr[arr.length-1-1];
        arr[arr.length-1-1]=temp;*/

       for (int x=0;x<arr.length/2;x++){
           int temp=arr[x];
           arr[x]=arr[arr.length-x-1];
           arr[arr.length-x-1]=temp;
       }

    }
    public static void reverse2(int[] arr){
        for (int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }

}
