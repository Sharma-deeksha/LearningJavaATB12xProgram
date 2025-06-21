package MCQs_21_06_2025;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt(); // Example input
        long factorial = 1;

        if (number==0)
        {
            System.out.println("0! = 1");
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
