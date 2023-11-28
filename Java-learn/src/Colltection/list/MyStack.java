package Colltection.list;

import java.util.ArrayList;

/**
 * 自定义栈：后进先出
 */
public class MyStack<T> extends ArrayList<T> {

    public void push(T t){
        add(t);
    }

    public T pop(){
        if(size() == 0) throw new IllegalArgumentException("栈里没有数据啦");
        T t = get(size() - 1);
        remove(t);
        return t;
    }
}
