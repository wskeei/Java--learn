package Colltection.collection;

import java.util.AbstractCollection;
import java.util.Arrays;

public class ArrayUtil {

    //使用数组来存储数据，因为不知道存储什么样的数据，所以使用Object数组
    //支持存储所有类型的数据
    private Object[] elements;

    private int size;//数组中存储的元素个数

    public ArrayUtil() {
       this(16);
    }

    public ArrayUtil(int capacity) {
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        //数组中存储满了，数组需要扩容才能存储新的元素
        if(size == elements.length){
            //4 >> 1    0100 >> 1 => 010 = 2
            int length = elements.length + elements.length >> 1;
            elements = Arrays.copyOf(elements, length);
        }
        elements[size++] = o;
    }

    public void delete(Object o){
        if(o == null) return;
        int index = -1;//要删除的元素的下标
        for(int i=0; i< size; i++){
            if(o.equals(elements[i])){
                index = i;
                break;
            }
        }
        // 1 2 3 4 5
        // 1 2 4 5
        System.arraycopy(elements, index + 1, elements, index, size-index-1);
        size--;
    }

    public void update(int index, Object o){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("下标越界了");
        }
        elements[index] = o;
    }

    public Object get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("下标越界了");
        }
        return elements[index];
    }

}
