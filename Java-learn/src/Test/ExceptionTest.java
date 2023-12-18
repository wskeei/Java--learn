package Test;

class DivideByMinusException extends Exception {
    public DivideByMinusException(String message) {
        super(message);
    }
}
public class ExceptionTest {
    public static double divide(int numerator, int denominator) throws DivideByMinusException {
        if (denominator < 0) {
            throw new DivideByMinusException("除数是负数");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divide(4, -3);
            System.out.println("结果: " + result);
        } catch (DivideByMinusException e) {
            System.err.println("发生异常: " + e.getMessage());
        }
    }
}
