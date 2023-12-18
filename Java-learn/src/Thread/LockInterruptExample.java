package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptExample {
        private static Lock lock = new ReentrantLock();

        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                try {
                    lock.lockInterruptibly(); // 尝试获取锁
                    try {
                        // 关键代码段 - 在获取锁后执行的代码
                        System.out.println("线程1获取了锁");
                        Thread.sleep(2000); // 模拟一些工作
                    } finally {
                        lock.unlock(); // 释放锁
                        System.out.println("线程1释放了锁");
                    }
                } catch (InterruptedException e) {
                    // 处理中断异常
                    System.out.println("线程1在等待锁的过程中被中断");
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    Thread.sleep(1000); // 让线程1开始等待锁
                    thread1.interrupt(); // 中断线程1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread1.start();
            thread2.start();
        }
}

