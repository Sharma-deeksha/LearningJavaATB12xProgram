package tasks;

import java.util.Scanner;

public class Task8_ReverseNumber_Using_loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        if(scanner.hasNextInt()){
            int num= scanner.nextInt();
            int revNum = 0;
            while (num>0){
                revNum= num%10 + revNum*10;
                num=num/10;

            }
            System.out.println(revNum);
        }
        else System.out.println("Please enter an integer only");
    }
}
