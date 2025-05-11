package ex_02_Java_Basics;

public class Lab23_Byte {
    public static void main(String[] args) {

        byte age = 10;
        System.out.println("In first main method " + age);
        System.out.println("Overloading -- Calling main method with int args "+main(age));

    }
    public static int main(int a) {

        byte age = 11;
        System.out.println("In main method with int args "+age);
        return age;

    }



}
