package Method_FunctionalInterface.lambda.lazy;

public class PrintTest {

    public static void main(String[] args) {
        String name = "Marry";
        String desc = " is friendly";
        //不会打印任何信息，但是此时已经完成了字符串的组装，这是属于性能上的浪费
        PrintUtil.print(false, name + desc);
        //不会打印任何信息，但是也未构建字符串
        PrintUtil.print(false, name, desc);
        //会打印信息时才会构建字符串
        PrintUtil.print(true, name, desc);
    }
}
