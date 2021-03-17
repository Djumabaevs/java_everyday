package ExPackageJan4.Programmer1;

import java.io.Serializable;

public class SalesMan implements Serializable {
  static final long serialVersionUID = 2;
    private String name;
    private int age;
    Car car;
    transient int salary;

    public SalesMan(String name, int age, Car car, int salary) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                " car " + car+
                "salary is " + salary +
                '}';
    }
}
