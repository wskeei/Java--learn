package com.cyx.file;

/**
 * 使用递归求1~100的累加和。
 */
public class Example6 {

    public static void main(String[] args) {
        int result = sum(100);
        System.out.println(result);

        int s = multiply(6);
        System.out.println(s);
    }

    public static int sum(int number){
        if(number == 1) return 1;
        return number + sum(number - 1);
    }
    //sum(5) => 5 + sum(4)
    //sum(4) => 4 + sum(3)
    //sum(3) => 3 + sum(2)
    //sum(2) => 2 + sum(1) => 2 + 1


    public static int multiply(int number){
        if(number == 0 || number == 1) return 1;
        return number * multiply(number - 1);
    }
    //multiply(6) => 6 * multiply(5)
    //multiply(5) => 5 * multiply(4)
    //multiply(4) => 4 * multiply(3)
    //multiply(3) => 3 * multiply(2)
    //multiply(2) => 2 * multiply(1) => 2 * 1
}
