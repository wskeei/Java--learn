package ZE.End;

import java.util.Random;

class Bank {
    private static int balance = 1000000;

    public static synchronized void withdraw(String windowName, int amount) {
        if (amount % 100 == 0 && amount <= 1000 && amount <= balance) {
            System.out.println(windowName + " 正在取钱数为 " + amount);
            balance -= amount;
            System.out.println("当前余额为: " + balance);
        } else {
            System.out.println(windowName + " 无法取钱，金额不符合要求或余额不足");
        }
    }
}

class Window extends Thread {
    private String windowName;

    public Window(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int amount = random.nextInt(1001);
            amount = amount - amount % 100;

            Bank.withdraw(windowName, amount);

            try {
                Thread.sleep(3000); // 休息3秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread windowA = new Window("窗口A");
        Thread windowB = new Window("窗口B");
        Thread windowC = new Window("窗口C");
        Thread windowD = new Window("窗口D");

        windowA.start();
        windowB.start();
        windowC.start();
        windowD.start();
    }
}
