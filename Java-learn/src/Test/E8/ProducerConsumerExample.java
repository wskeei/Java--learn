package Test.E8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Thread producerThread = new Thread(new ProducerA(warehouse), "生产者A");
        Thread consumerThread = new Thread(new ConsumerB(warehouse), "消费者B");

        producerThread.start();
        consumerThread.start();
    }
}
