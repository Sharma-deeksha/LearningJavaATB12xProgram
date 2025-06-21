package MCQs_21_06_2025;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        if(a==0)
        {
            System.out.println("enter number other than 0");
        }
        else if(a>0)
        {
            System.out.println(a+ " is positive");
        }
        else
        {
            System.out.println(a+ " is negative");
        }
    }
}
