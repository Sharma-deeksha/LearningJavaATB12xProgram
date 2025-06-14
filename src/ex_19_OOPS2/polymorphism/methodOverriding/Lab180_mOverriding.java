package ex_19_OOPS2.polymorphism.methodOverriding;

public class Lab180_mOverriding {
    public static void main(String[] args) {
        father f1=new father();
        f1.f1();
        f1.home();
        System.out.println("---------------");
        son s1=new son();
        s1.home();
        s1.p1();
        s1.f1();

        System.out.println("---------------");
        father f2=new son();
        f2.home();

    }
}
