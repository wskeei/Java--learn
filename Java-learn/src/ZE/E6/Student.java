package E6;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) throws EmptyException, AgeLowerException, AgeHighException {
        this.id = id;
        if(name.isEmpty()) {
            throw new EmptyException("姓名不能为空");
        }
        this.name = name;
        if(age < 0) {
            throw new AgeLowerException("年龄不能为负数");
        }
        if(age > 100) {
            throw new AgeHighException("年龄超出最大范围");
        }
        this.age = age;
    }


}
