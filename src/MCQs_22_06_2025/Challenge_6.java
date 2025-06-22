package MCQs_22_06_2025;

public class Challenge_6 {
    public static void main(String[] args) {
        Vehicle b=new Bike();
        b.start();
        Vehicle c=new Car();
        c.start();
    }
}
class Vehicle{
    public void start(){
        System.out.println("Brrommm!");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike engine starts with a purr!");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car engine starts with a roar!");
    }
}

