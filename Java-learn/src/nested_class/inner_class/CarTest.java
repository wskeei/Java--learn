package nested_class.inner_class;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car(100000, "奥拓");//c是汽车类的成员，因此c对象中有Engine类成员
        c.show();
        Car.Engine engine = new Car(100000, "奥拓").new Engine("进口",50000); //Engine类创建方式
        Car c1 = new Car(engine, "奔驰", 150000);
        c1.show();
        Car.Engine engine1 = c.new Engine("进口", 50000);
        Car c2 = new Car(engine1, "奔驰", 165600);
        c2.show();
    }
}
