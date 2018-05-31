package cn.testarray2;

public class TestString {

/*
1.练习string类的常用方法
2.结合数组查看源码
3.提高：按照老师的方法将String类中的相关方法的源码看一看
 */
    public static void main(String[] args) {
        String s="abcd";//new String("") ""为一个String 构造器重载，不同参数
        //new String() 则是给一个长度为0的数组

        char[] c={'a','b'};
        String str=new String(c);

        String str2=str;//new String（"abcd"）也一样
        String str3=new String("abcd");

        System.out.println(s.charAt(2));
        System.out.println(str2.equals(str));//比较内容
        System.out.println(str2==str3);//比较内容

        String str4="def";//常量池赋值,不用新建
        String str5="def";
        System.out.println(str4.equals(str5));
        System.out.println(str4==str5);

        System.out.println(str4.indexOf('d'));

        String s1=str4.substring(0);
        System.out.println(s1==str4);//原码相同0直接this

        String str6=str4.replace('d','r');
        System.out.println(str6);

        String str7="abcd,rrtt,cccee";
        String[] strArray=str7.split(",");
        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

        String str8="aaa bbb ccc";
        String str88=str8.trim();
        System.out.println(str88.length());
    }
    //地址不能变，对象里的内容可以改变
    public void  setCharAt(char c,int idx){
        //value[idx]=c;
    }
    // private final char value[];所有修改方法都返回一个新的String
}
