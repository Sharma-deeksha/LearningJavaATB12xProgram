package MCQs_22_06_2025;

public class Challenge_11 {

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    static double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
   static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("add(int, int): " + add(5, 10));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
        System.out.println("add(double, double): " + add(4.5, 3.2));
        System.out.println("add(String, String): " + add("Hello, ", "Shubham!"));
    }
}

