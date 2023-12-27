package ZE.End;

// 自定义异常类
class MouthException extends Exception {
    public MouthException(String message) {
        super(message);
    }
}

// 月份类
class Mouth {
    int month;

    public Mouth(int month) throws MouthException {
        if (month < 1 || month > 12) {
            throw new MouthException("月份非法");
        }
        this.month = month;
        System.out.println("月份正确：" + month + "月");
    }
}

// 测试类
public class MouthTest {
    public static void main(String[] args) {
        try {
            // 测试正常月份
            Mouth validMouth = new Mouth(6);

            // 测试错误月份
            Mouth invalidMouth = new Mouth(15);
        } catch (MouthException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }
    }
}
