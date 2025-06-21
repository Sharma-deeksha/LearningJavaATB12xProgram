package MCQs_21_06_2025;

import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args) {
        System.out.println("Enter number between 1 tp 7 to get the respective day of week");
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
