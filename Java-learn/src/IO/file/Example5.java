package com.cyx.file;

import java.util.Scanner;

/**
 * 递归
 */
public class Example5 {

    private static Scanner sc=  new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
//        gotoLogin();
    }

    public static void showMenu(){
        showMenu();
    }

    public static void gotoLogin(){
        System.out.println("登录");
        System.out.println("请输入菜单编号：");
        int number = sc.nextInt();
        if(number == 1){
            gotoMain();
        } else {
            System.out.println("感谢使用XXX系统");
        }
    }

    public static void gotoMain(){
        System.out.println("主菜单");
        System.out.println("请输入菜单编号：");
        int number = sc.nextInt();
        if(number == 5){
            gotoLogin();
        } else {
            System.out.println("你选择了其他菜单");
        }
    }
}
