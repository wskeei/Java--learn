package nested_class.static_nested;

public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name,int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name + "年龄为" + this.age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
