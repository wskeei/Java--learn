package Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTaskTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i=0; i<100; i++){
            int order = i;
            service.submit(()-> System.out.println("正在执行任务" + order));
        }
        service.shutdown();
    }
}
