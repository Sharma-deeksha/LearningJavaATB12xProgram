package ex_19_OOPS2.polymorphism.methodOverloading;

public class Lab179_Moverload {
    public static void main(String[] args) {
        mathOperations mo=new mathOperations();
        System.out.println(mo.add2(3,6));
        System.out.println(mo.add3(2,6,9));
        System.out.println(mo.addD(1.5,10.9));
    }
}
