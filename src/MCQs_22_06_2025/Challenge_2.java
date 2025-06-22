package MCQs_22_06_2025;

public class Challenge_2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Bob";
        s.rollNo=141;
        s.section='A';
        System.out.println("Student: " +s.name+", Roll No: " +s.rollNo+", Section: "+s.section);

    }
}

class Student{
    String name;
    int rollNo;
    char section;

        }
