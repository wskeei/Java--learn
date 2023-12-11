package nested_class.inner_class.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        int result = calculate(10, 20);
        System.out.println(result);

        Animal a = new Animal() { //匿名内部类里面还有类的主体
            @Override
            public void eat() {
                System.out.println("老虎吃肉");
            }
        };
        a.eat();
        Student stu = new Student("好奇怪", 20){
            @Override
            public void show() {
                System.out.println(age);
            }
        };
        stu.show();
    }
    public static int calculate(int a, int b){
        Calculate c = new Calculate() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        return c.calculate(a, b);
    }
}

