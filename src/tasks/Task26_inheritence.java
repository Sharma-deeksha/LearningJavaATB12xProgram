package tasks;

public class Task26_inheritence {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}

class Outer {
    int x = 10;
    class Inner {
        void show() {
            System.out.println(x);
        }
    }
}