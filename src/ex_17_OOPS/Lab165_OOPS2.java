package ex_17_OOPS;

import java.sql.SQLOutput;

public class Lab165_OOPS2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Nirvaan";
        student.age=6;
        student.roll=34;
        student.study();
    }
}

class Student{
    String name;
    int age;
    int roll;
    void study() {
        System.out.println("Learning");
    }

}