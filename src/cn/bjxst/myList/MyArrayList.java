package cn.bjxst.myList;
//模拟实现jdk中提供的ArrayList类
public class MyArrayList {
    Object[] value;
    int size;
    public MyArrayList(){

        //value=new Object[16];
        this(16);
    }
    public MyArrayList(int size){
        if (size<0){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        value=new Object[size];
    }
    public void add(Object obj){
        value[size]=obj;
        size++;
        if(size>value.length){
            //装不下了，扩容吧
            int newCapacity=value.length*2;
            Object[] newList=new Object[newCapacity];
            //System.arraycopy();
            for (int i=0;i<value.length;i++){
                newList[i]=value[i];
            }
            value=newList;
        }
    }
    public Object get(int index){
        rangeCheck(index);
        return value[index];
    }
    public int indexOf(Object obj){
        if(obj==null){
            return -1;
        }else {
            for(int i=0;i<value.length;i++){
                if(obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }
    public int lastIndexOf(Object obj){
        if(obj==null){
            return -1;
        }else {
            for(int i=value.length-1;i>=0;i--){
                if(obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }
    public Object set(int index,Object object){
        rangeCheck(index);
        Object old=value[index];
        value[index]=object;
        return old;

    }
    public void rangeCheck(int index){
        if(index<0||index>size-1){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add("aaa");
        list.add("bbbbbbbbbbbbbbbbbbbbbbbbbb");
        System.out.println(list.get(4));
    }
}
