package Colltection.list;

/**
 * 自定义单向链表
 * @param <T> 泛型变量
 */
public class MyNode<T> {

    private T data; //链中存储的数据

    private MyNode<T> next; //下一个链

    public MyNode(T data, MyNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
