package MCQs_22_06_2025;

public class Challenge_9 {
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        Drawable rectangle = new Rectangle1();

        circle.draw();
        rectangle.draw();
    }
}

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class implementing Drawable
class Rectangle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

