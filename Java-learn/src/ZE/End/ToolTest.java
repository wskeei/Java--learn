package ZE.End;

class Tool {
    String name;
    String type;

    public Tool(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void function() {
        System.out.println("通用功能");
    }
}

class Car extends Tool {
    public Car(String name, String type) {
        super(name, type);
    }

    @Override
    public void function() {
        run();
    }

    public void run() {
        System.out.println("轿车陆地行驶");
    }
}

class Airplane extends Tool {
    public Airplane(String name, String type) {
        super(name, type);
    }

    @Override
    public void function() {
        fly();
    }

    public void fly() {
        System.out.println("飞机用于天空飞翔");
    }
}

public class ToolTest {
    public static void testFunction(Tool v) {
        v.function();
    }

    public static void main(String[] args) {
        Car car = new Car("Car1", "比亚迪");
        Airplane airplane = new Airplane("Airplane1", "打飞机");

        testFunction(car);

        testFunction(airplane);
    }
}
