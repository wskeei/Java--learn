package Colltection.collection;

import java.util.Collection;
import java.util.List;

public class GenericLowerLimit {

    public static void main(String[] args) {
        //集合中存储元素的类型可以是Number的子类、Number类、Number的父类
        MyCollection<? super Number> c = new MyCollection<>();
        //虽然存储元素的类型可以是Number的父类，但是由于父类类型无法确定具体多少种，
        //因此在父类的使用添加功能时，编译器会报错
//        c.add(new Object());
        //但是集合中可以存储Number类
        c.add(1.0);
    }
}
