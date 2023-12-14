package Thread.pool;

import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> taskQueue = new LinkedBlockingDeque<>(10);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5, //核心线程数
                10, //最大工作线程数
                2,//非核心线程的工作线程存活时间
                TimeUnit.SECONDS,//存活时间单位
                taskQueue,//任务队列
                Executors.defaultThreadFactory(),//线程池中的线程创建工厂
                new ThreadPoolExecutor.AbortPolicy());//拒绝新线程任务的策略

        for(int i=0; i<30; i++){
            pool.submit(new ThreadPoolTask(i));
            int corePoolSize = pool.getCorePoolSize();//获取核心线程数
            int size = pool.getQueue().size(); //获取队列中任务个数
            long finish = pool.getCompletedTaskCount();//获取线程池执行完成任务的个数
            System.out.printf("线程池中核心线程数：%d，队列中任务个数：%d，线程池完成任务数：%d\n",
                    corePoolSize, size, finish);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pool.shutdown();//关闭线程池，等待线程池中的任务执行完成，但是不会接收新的线程任务
    }

    static class ThreadPoolTask implements Runnable{

        private int num;

        public ThreadPoolTask(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行线程任务" + num);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
