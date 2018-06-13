package cn.testarray2;
/*
测试可变字符序列 StringBuilder(线程不安全)，StringBuffer（线程安全，效率低）
String 不可变字符序列
 */
public class Test03 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();//默认长度16
        StringBuilder sb1=new StringBuilder(32);//字符数组长度初始为32
        StringBuilder sb2=new StringBuilder("abcd");//字符数组长度初始为20 value[]={"a","b","c","d","/u0000".....}
        sb2.append("efg");
        sb2.append(true).append(321).append("随便");//通过returnthis实现方法链

        System.out.println(sb2);

        StringBuilder gh=new StringBuilder("a");
        for (int i=0;i<10;i++){//一直创建对象，所以很浪费空间
            gh.append(i);
        }
        System.out.println(gh);


    }
}
