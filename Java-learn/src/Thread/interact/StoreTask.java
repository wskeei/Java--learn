package Thread.interact;

/**
 * 存钱任务
 */
public class StoreTask implements Runnable{

    private Account account;

    private double money;

    public StoreTask(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        while (true){
            account.store(money);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
