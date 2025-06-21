package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        int a= scanner.nextInt();
        System.out.println("enter number 2");
        int b=scanner.nextInt();
        System.out.println("a==b: " + (a==b));
        System.out.println("a>b: " + (a>b));
        System.out.println("a<b: " + (a<b));
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(a > b): " + !(a > b));

    }
}
