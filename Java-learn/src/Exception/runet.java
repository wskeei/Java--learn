package Exception;

public class runet {
    public void test1(){
        ArithmeticException a = new ArithmeticException("这是正常情况");
        //ArithmeticException 为
        throw a;
    }
    public void test2() throws TestException {
        TestException a = new TestException("这里需要使用throws");
        throw a;
    }

}
