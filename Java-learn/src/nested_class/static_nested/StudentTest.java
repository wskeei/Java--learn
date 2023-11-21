package nested_class.static_nested;

public class StudentTest {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("张三", 20));
        manager.addStudent(new Student("李四", 21));
        manager.addStudent(new Student("王五", 22));
        manager.addStudent(new Student("龙华", 23));
        //静态嵌套类构建对象的语法： new 外部类类名.内部类类名()

        manager.showStudent(new StudentManager.StudentSorter(1));
    }
}
