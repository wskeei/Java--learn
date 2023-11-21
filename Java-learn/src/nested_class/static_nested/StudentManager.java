package nested_class.static_nested;
import java.util.Arrays;
public class StudentManager {
    private Student[] stus = {};

    public void addStudent(Student stu){
        stus = Arrays.copyOf(stus, stus.length + 1);
        stus[stus.length -1] = stu;
    }

    public void showStudent(StudentSorter sorter){
        sorter.sort(stus);
        for(Student stu: stus){
            System.out.println(stu.toString());
        }

    }

    public static class StudentSorter{
        private int order; //排序标志：0-降序排列，1-升序排列

        public StudentSorter() {
            this(0);
        }

        public StudentSorter(int order) {
            this.order = order;
        }
        public void sort(Student[] stus){ //静态内部类不能调用外部变量，要传入对象
            for(int i = 0; i<stus.length ;i++){
                for(int j = 0 ;j<stus.length-i-1;j++){
                    int age1 = stus[j].getAge();
                    int age2 = stus[j+1].getAge();
                    if((order == 0 && age1 < age2) || (order == 1 && age1 >age2)) {
                            Student temp = stus[j];
                            stus[j] = stus[j+1];
                            stus[j+1] = temp;
                        }
                    }
                }
            }
        }

}
