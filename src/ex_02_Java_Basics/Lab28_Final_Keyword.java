package ex_02_Java_Basics;

public class Lab28_Final_Keyword {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println(PI);
    }
}
