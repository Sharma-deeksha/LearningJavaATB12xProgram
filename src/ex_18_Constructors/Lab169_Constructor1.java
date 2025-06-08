package ex_18_Constructors;

public class Lab169_Constructor1 {
    public static void main(String[] args) {
        Baby b1= new Baby();
        b1.name="Baby1";
        System.out.println(b1.name);
        new Baby();
        new Baby();
        Baby b2;
        //only when new keyword is used an object actually gets created and only then default constructor is called
    }
}
class Baby{
    String name;
    Baby(){
        System.out.println("I am called when Baby object is created");
    }
}
