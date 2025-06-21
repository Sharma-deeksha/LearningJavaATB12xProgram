package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        int a= scanner.nextInt();
        System.out.println("enter number 2");
        int b=scanner.nextInt();
        System.out.println("Addition: " + (a+b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + a/b);
        System.out.println("Modulus: " + a%b);

    }
}
