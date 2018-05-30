package cn.testarray2;
/*
数组的基本语法
 */
public class Test002 {
    public static void main(String[] args) {
        //声明
        int[] a;
        int b[];
        //创建数组对象
        a=new int[4];
        b=new int[5];

        //初始化(数组元素初始化)
        //默认初始化 数组元素相当于对象的成员变量 默认值跟成员变量规则一样 数字0 布尔null

        a[0]=23;
        a[1]=45;
        //动态初始化
        for (int i=0;i<b.length;i++){
            b[i]=i*12;
        }

        //静态初始化
        int c[]={23,43,56,78}; //长度4 索引范围0~3
        Car[] cars={new Car("奔驰"),
                new Car("宝马"),
                new Car("比亚迪")};
        //car[0]=new Car("宝马");
        Car c2=new Car("奔驰");
        System.out.println(c2==cars[0]);//“==”运用在基本数据类型的时候，通过比较它们实际的值来判断是否相同；而用于比较引用
        // 数据类型的时候，则是比较俩个引用的地址是否相等，也就是是否指向一个对象。




    }
}
