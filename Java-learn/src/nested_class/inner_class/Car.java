package nested_class.inner_class;

public class Car {
    private double price;
    private String brand;
    private Engine engine; //汽车拥有的发动机
    public Car(double price, String brand) {
        this.brand = brand;
        this.engine = new Engine("国产", 20000);
        this.price = price + engine.price;
    }
    public Car(Engine engine, String brand, double price) {
        this.engine = engine;
        this.brand = brand;
        this.price = price + engine.price;
    }
    public void show(){
        this.engine.show();
    }
    class Engine{ //发动机 //内部类
        private String type; //发动机类型
        private double price; //发动机价格
        public Engine(String type, double price) {
            this.type = type;
            this.price = price;
        }
        public void show(){
            System.out.println(brand + "汽车使用的是" + type + "发动机，价格为：" + price);

            //如果内部类中存在于外部类同名的成员变量时，想要使用外部类的同名成员变量，需要加上： 外部类类名.this.变量名
            System.out.println("汽车总价为：" + Car.this.price);
        }
    }
}

