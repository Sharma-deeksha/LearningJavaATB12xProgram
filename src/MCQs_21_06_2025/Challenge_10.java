package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {
        System.out.println("Simple calculator using switch statement");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1");
        double a= scanner.nextDouble();
        System.out.println("enter number 2");
        double b= scanner.nextDouble();
        System.out.println("enter any operation---> + , - ,* , /");
        String op=scanner.next();
        switch (op){
            case "+" :
                System.out.println("Addition: " +(a+b));
                break;
            case "-" :
                System.out.println("Substraction: " + (a-b));
                break;
            case "*" :
                System.out.println("Multiplication: " + (a*b));
                break;
            case "/" :
                if(b!=0){
                System.out.println("Division: " +(a/b));}
                else{
                    System.out.println("division by 0 will result in exception");
                }
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
