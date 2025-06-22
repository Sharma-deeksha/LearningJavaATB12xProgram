package MCQs_22_06_2025;

public class Challenge_10 {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.canFly();
        d.canSwim();
        flyable d1=new Duck();
        d1.canFly();
        swimmable d2=new Duck();
        d2.canSwim();

    }
}
interface flyable{
    public void canFly();
}
interface swimmable{
    public void canSwim();
}
class Duck implements flyable,swimmable{
    @Override
    public void canFly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void canSwim() {
        System.out.println("Duck is swimming in the water!");
    }
}