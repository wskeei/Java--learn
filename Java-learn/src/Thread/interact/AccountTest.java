package Thread.interact;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("小明");
        Thread t1 = new Thread(new StoreTask(account, 500));// state：new
        Thread t2 = new Thread(new DrawTask(account, 1000));
        t1.start();//state：runnable 有运行能力，但不一定运行
        t2.start();
    }
}
