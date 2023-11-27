package com.cyx.list;

public class DeNodeTest {

    public static void main(String[] args) {
        DeNode<Integer> number1 = new DeNode<>(1, null, null);
        DeNode<Integer> number2 = new DeNode<>(2, number1, null);
        number1.setNext(number2);
        DeNode<Integer> number3 = new DeNode<>(3, number2, null);
        number2.setNext(number3);
        DeNode<Integer> number4 = new DeNode<>(4, number3, null);
        number3.setNext(number4);
        DeNode<Integer> nextNode = number1;
        while (nextNode != null){
            System.out.println(nextNode.getData());
            nextNode = nextNode.getNext();
        }
        System.out.println("==================");
        DeNode<Integer> prevNode = number4;
        while (prevNode != null){
            System.out.println(prevNode.getData());
            prevNode = prevNode.getPrev();
        }
    }
}
