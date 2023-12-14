package Thread.interact;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("小明");
        Thread t1 = new Thread(new StoreTask(account, 500));
        Thread t2 = new Thread(new DrawTask(account, 1000));
        t1.start();
        t2.start();
    }
}
