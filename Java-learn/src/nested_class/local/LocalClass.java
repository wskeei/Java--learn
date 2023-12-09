package nested_class.local;

public class LocalClass {

    public static void main(String[] args) {
        int result = calculate(1, 3);
        System.out.println(result);
    }

    public static int calculate(int a, int b){
        class Calculator {
            private int num1,num2;

            public Calculator(int num1, int num2) {
                this.num1 = num1;
                this.num2 = num2;
            }

            public int calculate(){
                return num1 + num2;
            }
        }
        Calculator c = new Calculator(a, b);
        return c.calculate();
    }
}
