package Thread.deadlock;

public class DeadLockTest {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        DeadLockTask task1 = new DeadLockTask(o1, o2, 0);
        DeadLockTask task2 = new DeadLockTask(o1, o2, 1);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }


    static class DeadLockTask implements Runnable{

        private Object o1, o2;

        private int flag; //锁使用的条件

        public DeadLockTask(Object o1, Object o2, int flag) {
            this.o1 = o1;
            this.o2 = o2;
            this.flag = flag;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            if(flag == 0){
                synchronized (o1){
                    System.out.println(name + "锁定对象o1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o2){
                        System.out.println(name + "锁定对象o2");
                    }
                }
            } else {
                synchronized (o2){
                    System.out.println(name + "锁定对象o2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o1){
                        System.out.println(name + "锁定对象o1");
                    }
                }
            }
        }
    }
}
