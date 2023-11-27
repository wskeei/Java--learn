package com.cyx.list;

import java.util.PriorityQueue;
import java.util.Stack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Stack<String> s = new Stack<>();
    }
}
