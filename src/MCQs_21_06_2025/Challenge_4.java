package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int a= scanner.nextInt();
        System.out.println("Original: " +a);
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Pre-increment: " + (a++) + " returned " + a);
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Pre-decrement: " + (a--) + " returned " + a);
    }
}
