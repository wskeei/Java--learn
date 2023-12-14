package Thread;

public class CreateDemo {

    public static void main(String[] args) {
        Thread t1 =new SubThread("inherit"); //通过继承实现的线程
        ThreadTask task = new ThreadTask();
        Thread t2 = new Thread(task, "interface");//通过实现Runnable接口实现的线程
        Thread t3 = new Thread(task, "t3");
        t1.start();//start方法只是告诉JVM线程t1已经准备好了，随时可以调度执行
        try {
            t1.join(); //等待线程t1执行完成
            t1.join(1000);//等待线程t1执行1秒
//             1毫秒 = 1000微秒 = 1000000纳秒
            t1.join(1000, 50000);//等待线程t1执行1.5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }


    static class SubThread extends Thread{

        public SubThread() {
        }

        public SubThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "=>This is SubThread");
        }
    }

    static class ThreadTask implements Runnable{

        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println(name + "=>This is Implementation");
        }
    }
}
