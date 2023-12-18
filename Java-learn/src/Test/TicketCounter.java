package Test;

public class TicketCounter {
    // 共享资源，即车票数量
    private static int ticketCount = 20;

    public static void main(String[] args) {
        // 创建多个窗口线程
        Thread window1 = new Thread(new TicketSeller(), "窗口1");
        Thread window2 = new Thread(new TicketSeller(), "窗口2");
        Thread window3 = new Thread(new TicketSeller(), "窗口3");
        Thread window4 = new Thread(new TicketSeller(), "窗口4");

        // 启动窗口线程
        window1.start();
        window2.start();
        window3.start();
        window4.start();
    }

    static class TicketSeller implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (TicketCounter.class) {
                    if (ticketCount > 0) {
                        System.out.println(Thread.currentThread().getName() + "售出第" + ticketCount + "张票");
                        ticketCount--;

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 所有票已售完
                        System.out.println("票已售完，" + Thread.currentThread().getName() + "停止售票");
                        break;
                    }
                }
            }
        }
    }
}
