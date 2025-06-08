package ex_18_Constructors;

public class Lab172_Constructor4 {
    public static void main(String[] args) {
        Car2 car1=new Car2();
        Car2 car2=new Car2("Tesla","XX1");
        System.out.println(car2.name + " " + car2.model + " " + car2.year);
        Car2 car3=new Car2("Nano","Metix1", 2024);
        System.out.println(car3.name + " " + car3.model + " " + car3.year);
    }

}
