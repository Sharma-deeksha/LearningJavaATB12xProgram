package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        int a= scanner.nextInt();
        System.out.println("enter number 2");
        int b=scanner.nextInt();
        System.out.println("enter number 3");
        int c=scanner.nextInt();
        int largest=0;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}
