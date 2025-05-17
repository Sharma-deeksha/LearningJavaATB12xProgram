package tasks;

public class Task3_Max_in_3_Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=555;
        int c=3;
        System.out.println("Biggest number is -> " + (c>(a>b?a:b)?c:(a>b?a:b)));
    }
}
