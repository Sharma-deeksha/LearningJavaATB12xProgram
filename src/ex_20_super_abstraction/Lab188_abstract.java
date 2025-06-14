package ex_20_super_abstraction;

public class Lab188_abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

        // Father f1 = new Father();
    }
}

class Normal{
    // Concrete class -> complete class
}
abstract class Father{
    abstract void loan50K();
}
class Son extends Father{


    @Override
    void loan50K() {
        System.out.println("Loan given!!");
    }
}