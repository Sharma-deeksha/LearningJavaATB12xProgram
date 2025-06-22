package MCQs_22_06_2025;

public class Challenge_8 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
    }
}

abstract class Shape {
    abstract double getArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

