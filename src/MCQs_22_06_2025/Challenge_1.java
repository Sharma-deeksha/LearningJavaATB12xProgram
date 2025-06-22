package MCQs_22_06_2025;

public class Challenge_1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=18;
        p.name="Nayana";
        System.out.println("Person1: Name -> "+p.name+ " Age-> " +p.age);
        Person p1=new Person();
        p1.age=28;
        p1.name="Ayeesha";
        System.out.println("Person1: Name -> "+p1.name+ " Age-> " +p1.age);
    }



}
class Person{
    String name;
    int age;
}