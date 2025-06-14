package ex_19_OOPS2.polymorphism.methodOverriding;

public class son extends  father{
    void p1(){
        System.out.println("son - p1");
    }

    @Override
    void home(){
        System.out.println("son - 3BHK");
    }
}
