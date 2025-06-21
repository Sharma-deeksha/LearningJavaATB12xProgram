package tasks;

import java.util.Scanner;

public class Task22_ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Side1 length of triangle");
        int a= scanner.nextInt();
        System.out.println("Enter Side2 length of triangle");
        int b= scanner.nextInt();
        System.out.println("Enter Side1 length of triangle");
        int c= scanner.nextInt();
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is NOT a valid triangle.");
        }
    }
}
