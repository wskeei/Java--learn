package Thread.interact;

public class Account {

    private String name;

    private double balance;

    private boolean hasMoney = false; //存钱标志

    public Account(String name) {
        this.name = name;
    }

    public synchronized void store(double money){
        if(hasMoney){//已经存钱了
            System.out.println(name + "的老爸等待通知存钱");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            balance += money;
            System.out.println(name + "的老爸存了" + money + "元钱");
            hasMoney = true;
            notifyAll();//通知取钱
        }
    }

    public synchronized void draw(double money){
        if(hasMoney){ //已经存钱了
            if(balance < money){ //余额不足
                System.out.println(name + "向他老爸控诉没有钱了");
                hasMoney = false;
                notify();//通知他老爸存钱
            } else {
                balance -= money;
                System.out.println(name + "取了" + money + "元钱");
            }
        } else {//没有存钱
            try {
                System.out.println(name + "等待他老爸存钱");
                wait();//等待存钱
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
