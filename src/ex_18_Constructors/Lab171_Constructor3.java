package ex_18_Constructors;

public class Lab171_Constructor3 {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.model);
        c1.name="Tesla";
        c1.model="T1";
        c1.year=2025;
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        Car c2= new Car();
        System.out.println(c2.model);
        c2.name="Benz";
        c2.model="B1";
        c2.year=2022;
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

        LoginPage l1=new LoginPage();
    }
}
