package cn.day6;

public class JiaMiDemo {
    public static void main(String[] args) {

        int number=123456;

        int[] arr=new int[8];

        int index=0;

        while (number>0){
            arr[index]=number%10;
            index++;
            number/=10;
        }
        for (int x=0;x<index;x++){
            arr[x]+=5;
            arr[x]%=10;
        }
        int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;

        for (int x=0;x<index;x++){
            System.out.print(arr[x]);
        }
        System.out.println();

    }
}
