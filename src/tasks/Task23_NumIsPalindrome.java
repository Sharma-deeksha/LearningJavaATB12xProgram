package tasks;

import java.util.Scanner;

public class Task23_NumIsPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number you want to check for palindrome");
        int num= scanner.nextInt();
        int temp=num;

        int reverse=0;
        while(temp>0)
        {
            reverse=temp%10 + reverse*10;
            temp=temp/10;
        }
        System.out.println(reverse);
        if(num==reverse)
        {
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome" + ++num);
        }
    }
}
