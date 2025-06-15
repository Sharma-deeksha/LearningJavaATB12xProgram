package ex_24_Exceptions;


import java.util.Scanner;

public class Lab218_TryCatchFinally1 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = 10 / a;
            System.out.println(b);
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("always executed");
        }

    }
}
