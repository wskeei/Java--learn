package Colltection.compare;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {
        Course[] courses = {
                new Course("Java", 5),
                new Course("Html", 3),
                new Course("JavaScript", 2),
                new Course("JDBC", 6)
        };
//        Comparator<Course> c = new Comparator<Course>() {
//            @Override
//            public int compare(Course o1, Course o2) {
//                return 0;
//            }
//        };
//        Comparator<Course> c = (Course o1, Course o2) -> {
//            return 0;
//        };
        Comparator<Course> c = (o1, o2) -> {
            int score1 = o1.getScore();
            int score2 = o2.getScore();
            if(score1 == score2) return o1.getName().compareTo(o2.getName());
            else if(score1 < score2) return -1;
            else return 1;
        };
        Arrays.sort(courses, c);
        for(Course course: courses){
            System.out.println(course);
        }
        System.out.println("=================");
        List<Course> courseList = new ArrayList<>();
        courseList.add( new Course("Java", 5));
        courseList.add( new Course("Html", 3));
        courseList.add( new Course("JavaScript", 2));
        courseList.add( new Course("JDBC", 6));
        Collections.sort(courseList, c);
        for(Course course: courseList){
            System.out.println(course);
        }
    }
}
