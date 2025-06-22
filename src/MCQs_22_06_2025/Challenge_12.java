package MCQs_22_06_2025;

public class Challenge_12 {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.showMessage();
        Child c= new Child();
        c.showMessage();
    }
}
class Parent {
    void showMessage() {
        System.out.println("This is the parent class.");
    }
}

// Child class
class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("This is the child class, overriding the parent method.");
    }
}