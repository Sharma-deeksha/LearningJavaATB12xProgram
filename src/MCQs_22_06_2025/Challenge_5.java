package MCQs_22_06_2025;

public class Challenge_5 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
        Animal a1=new Dog();
        a1.makeSound();
    }
}
class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog says : Woof! woof!");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Car says : Meao! Meao!");
    }
}