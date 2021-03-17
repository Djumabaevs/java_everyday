package ExPackageFeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,7.8,"Bob",25));
        students.add(new Student(2,7.8,"John",27));
        students.add(new Student(3,7.8,"David",29));
        students.stream().filter(e->e.age>27).limit(2).forEach(System.out::println);
        Student max = students.stream().max((x,y)->x.age-y.age).get();
        System.out.println(max);

        Map<Integer,List<Student>> map = students.stream().map(e ->{
            e.setName(e.getName().toUpperCase());
            return  e;
        })
                .collect(Collectors.groupingBy(e->e.getCourse()));
        for(Map.Entry<Integer,List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());

        Map<Boolean,List<Student>> map2 = students.stream().collect(
                Collectors.partitioningBy(e->e.grade>7));
        for(Map.Entry<Boolean,List<Student>> entry2: map2.entrySet()){
            System.out.println(entry2.getKey() + " : " + entry2.getValue().toString());

        }


        }

    }


}

class Student{
   private int course;
    double grade;
    private String name;
    int age;

    public Student(int course, double grade, String name, int age) {
        this.course = course;
        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
