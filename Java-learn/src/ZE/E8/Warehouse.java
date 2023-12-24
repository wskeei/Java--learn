package ZE.E8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Warehouse {
    private int stock = 0;
    private final int MAX_CAPACITY = 100;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public void produce(int amount) throws InterruptedException {
        lock.lock();
        try {
            while (stock + amount > MAX_CAPACITY) {
                notFull.await();
            }
            stock += amount;
            System.out.println("生产者A--存放了:" + amount + "--当前库存:" + stock);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
        Thread.sleep(2000); // 休息2秒
}
    public void consume(int amount) throws InterruptedException {
        lock.lock();
        try {
            while (stock < amount) {
                notEmpty.await();
            }
            stock -= amount;
            System.out.println("消费者B--消费了:" + amount + "--当前库存:" + stock);
            notFull.signalAll();
        } finally {
            lock.unlock();
        }
        Thread.sleep(1000); // 休息1秒
    }
}
