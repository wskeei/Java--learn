package Test.E8;

public class ProducerA  implements Runnable {
    private final Warehouse warehouse;

    public ProducerA(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void run() {
        while (true) {
            try {
                warehouse.produce(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
