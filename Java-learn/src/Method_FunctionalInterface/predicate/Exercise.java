package Method_FunctionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Student> students = Arrays.asList(
                new Student("管理员1","男", 20),
                new Student("管理员2","女", 21),
                new Student("管理员3","男", 22),
                new Student("管理员4","女", 23),
                new Student("管理员5","男", 24),
                new Student("管理员6","女", 18),
                new Student("管理员7","男", 16),
                new Student("管理员8","女", 19),
                new Student("管理员9","男", 20),
                new Student("管理员0","女", 23)
        );
//        Predicate<Student> p1 = new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return "男".equals(student.getSex());
//            }
//        };
        Predicate<Student> p1 = stu -> "男".equals(stu.getSex());
        Predicate<Student> p2 = stu -> stu.getAge() > 20;
        Predicate<Student> p3 = p1.and(p2);
//        students.forEach(new Consumer<Student>() {
//            @Override
//            public void accept(Student student) {
//                if(p3.test(student)){
//                    System.out.println(student);
//                }
//            }
//        });

        students.forEach(student -> {
            if(p3.test(student)){
                System.out.println(student);
            }
        });
    }
}
