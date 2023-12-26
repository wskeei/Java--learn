package ZE.E5;

public class BirdTest {
    public static void main(String[] args) {
        Bird b1 = new Bird("小鸟", 2);

        b1.walk();
        b1.fly();

        Test1(b1);
        Test2(b1);
    }

    // 测试 walk 方法
    public static void Test1(Animal a) {
        a.walk();
    }

    // 测试 fly 方法
    public static void Test2(Flyable a) {
        a.fly();
    }
}
