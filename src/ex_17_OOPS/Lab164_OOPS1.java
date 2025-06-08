package ex_17_OOPS;

public class Lab164_OOPS1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Deeksha";
        person.age=25;
        person.gender="female";

        System.out.print(person.name + " aged "+ person.age + " is " );
        person.eat();
        System.out.print(person.name +  " is " );
        person.sleep();
        person.doAssignment();
        person.watchRecordings();
    }
}
