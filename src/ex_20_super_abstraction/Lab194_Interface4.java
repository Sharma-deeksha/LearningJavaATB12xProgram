package ex_20_super_abstraction;

public class Lab194_Interface4 {
    public static void main(String[] args) {
        Deeksha d = new Pandey(); // Dynamic Dispatch will Interface
        Pandey p1 = new Pandey(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}
class Pandey implements Deeksha{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Deeksha{
    int a = 10;
    void display();
}