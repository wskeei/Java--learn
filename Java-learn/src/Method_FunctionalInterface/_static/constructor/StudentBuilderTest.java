package Method_FunctionalInterface._static.constructor;

public class StudentBuilderTest {

    public static void main(String[] args) {
//        StudentBuilder builder = new StudentBuilder() {
//            @Override
//            public Student build(String name, String sex) {
//                return new Student(name, sex);
//            }
//        };

//        StudentBuilder builder = (String name, String sex) -> {
//            return new Student(name, sex);
//        };

//        StudentBuilder builder = (name, sex) -> new Student(name, sex);
        StudentBuilder builder = Student::new;
        Student stu = builder.build("张三", "男");
        System.out.println(stu);
    }
}
