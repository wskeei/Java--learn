package Thread;

public class SaleThreadTest {

    public static void main(String[] args) {
        SaleTask task = new SaleTask();//一个成员
        Thread t1 = new Thread(task, "窗口1");//共用同一个成员
        Thread t2 = new Thread(task, "窗口2");//共用同一个成员
        Thread t3 = new Thread(task, "窗口3");//共用同一个成员
        t1.start();
        t2.start();
        t3.start();
    }


    static class SaleTask implements Runnable{

        private int totalTickets = 10; //售卖10张火车票

        private Object o = new Object();

        //synchronized作用在成员方法上，因此synchronized与成员有关
        //monitor enter
//        private synchronized void saleTicket(){
//            if(totalTickets > 0){
//                String name = Thread.currentThread().getName();
//                System.out.println(name + "售卖火车票：" + totalTickets);
//                totalTickets --;
//            }
//        }
//      monitor exit


        @Override
        public void run() {
            while (true){
//                saleTicket();
                synchronized (o){ //this
                    if(totalTickets > 0){
                        String name = Thread.currentThread().getName();
                        System.out.println(name + "售卖火车票：" + totalTickets);
                        totalTickets --;
                    }
                }
                if(totalTickets == 0) break;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
