package E5;

public class Bird extends Animal implements Flyable{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " 在走路");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 在飞");
    }
}
