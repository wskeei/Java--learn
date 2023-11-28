package Colltection.list;

public class MyNodeTest {

    public static void main(String[] args) {
        MyNode<String> first = new MyNode<>("第一个链", null);
        MyNode<String> second = new MyNode<>("第二个链", null);
        first.setNext(second);
        MyNode<String> third = new MyNode<>("第三个链", null);
        second.setNext(third);
        MyNode<String> fourth = new MyNode<>("第四个链", null);
        third.setNext(fourth);
        MyNode<String> nextNode = first;
        while (nextNode != null){
            System.out.println(nextNode.getData());
            nextNode = nextNode.getNext();
        }
        System.out.println("===================");
        MyNode<Integer> number4 = new MyNode<>(4, null);
        MyNode<Integer> number3 = new MyNode<>(3, number4);
        MyNode<Integer> number2 = new MyNode<>(2, number3);
        MyNode<Integer> number1 = new MyNode<>(1, number2);
        MyNode<Integer> next = number1;
        while (next != null){
            System.out.println(next.getData());
            next = next.getNext();
        }
    }
}
