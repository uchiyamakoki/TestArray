package cn.day5;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr={200,250,38,888,444};

        int index=getIndex2(arr,2500);

        System.out.println(index);

    }

    public static int getIndex(int[] arr,int value){
        for (int x=0;x<arr.length;x++){
            if(arr[x]==value){
                return x;
            }
        }
        return -1;//
    }
    public static int getIndex2(int[] arr,int value){
        int index=-1;
        for (int x=0;x<arr.length;x++){
            if(arr[x]==value){
               index=x;
                return index;
            }
        }
        return -1;//
    }
}
