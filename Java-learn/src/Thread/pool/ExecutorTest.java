package Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

    public static void main(String[] args) {
        //创建一个给定核心线程数以及最大线程数的线程池，该线程池队列非常大
        ExecutorService pool1 = Executors.newFixedThreadPool(5);
        //创建只有一个核心线程数以及最大线程数的线程池，该线程池队列非常大
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        //创建一个核心线程为0,最大线程数为整数的最大值的可缓存的线程池
        ExecutorService pool3 = Executors.newCachedThreadPool();
        //创建一个给定核心线程数，最大线程数为整数的最大值的可调度的线程池
        ExecutorService pool4 = Executors.newScheduledThreadPool(5);
    }
}
