package cn.day6;

import java.util.Scanner;

public class JiaMiDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        String result=JiaMi(number);

        System.out.println(result);


    }

    public static String JiaMi(int number){
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
        arr[0]=arr[index-1];//因为上面多加了1次
        arr[index-1]=temp;

        String s="";
        for (int x=0;x<index;x++){
            s+=arr[x];
        }

        return s;

    }
}
