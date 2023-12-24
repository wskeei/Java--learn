package ZE.E8;

public class ConsumerB implements Runnable {
    private final Warehouse warehouse;

    public ConsumerB(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            try {
                warehouse.consume(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
