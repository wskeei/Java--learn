import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(); // 新建数组列表对象

        // 添加数据1
        al.add(1);

        print(al);

        System.out.println(al.get(0)); // 注意：列表索引从0开始，所以应该使用0而不是1
    }

    public static void print(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
