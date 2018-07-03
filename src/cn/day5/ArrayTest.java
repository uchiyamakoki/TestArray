package cn.day5;
/*
数组遍历
 */
public class ArrayTest {
    public static void main(String[] args) {
        //定义数组
        int[] arr={11,22,33,44,55};

        //获取每一个元素
        //如何获取呢？我们知道数组名结合编号，就可以找到数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------------------");
        //水平太低

        //代码重复度高。只有索引是变化的
        for (int x=0;x<5;x++){
            System.out.println(arr[x]);
        }
        System.out.println("-------------------------------------");

        int[] arr2={1,2,3,4,5,6,7,8,9,10};

        System.out.println(arr.length);
        System.out.println(arr2.length);

        //代码重复度高。只有索引是变化的
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
        System.out.println("-------------------------------------");

        printArray(arr);
        printArray(arr2);

    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void printArray2(int[] arr){
        System.out.println("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1) {
                System.out.println(arr[i]+"]");
                System.out.println("-------------------------------");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }

}
