package tasks;

import java.util.Scanner;

public class Task21_ATMSimulation {
    public static void main(String[] args) {
        int AccountBalance=10000;
        System.out.println("Enter the amount you want to withdraw");
        Scanner scanner=new Scanner(System.in);
        int withdrawAmount= scanner.nextInt();

            if (withdrawAmount <= 0)
                System.out.println("Enter amount greater than zero");
            else if (withdrawAmount % 100 != 0) {
                System.out.println("Enter the amount in 100's");
            } else if (withdrawAmount > AccountBalance) {
                System.out.println("In1200sufficient balance");

            } else {
                AccountBalance = AccountBalance - withdrawAmount;
                System.out.println("You have withdrawn " + withdrawAmount + " Rs.");
                System.out.println("Balance in account " + AccountBalance);
            }
        }
    }


