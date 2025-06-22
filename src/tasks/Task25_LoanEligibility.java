package tasks;

import java.util.Scanner;

public class Task25_LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println("Enter your salary");
        double salary= scanner.nextDouble();
        System.out.println("Enter your credit score");
        int creditScore= scanner.nextInt();
        boolean eligible;
        isEligible(age,salary,creditScore);
    }
    static boolean isEligible(int age, double salary, int creditScore) {
        if (age >= 18 && age <= 80) {
            if (salary >= 30000) {
                if (creditScore >= 650 && creditScore <= 850) {
                    System.out.println("You are eligible for loan");
                }
            } else {
                System.out.println("Salary ");
            }
        } else {
            System.out.println("You are not eligible fot loan");
        }

        return false;
    }
}

