package tasks;

public class Task24_ForLoopContinue {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 3; i++) {
            if (i == 2) continue;
            System.out.print(i);
        }
        int sum = 0; for (int i = 1; i <= 4; i++) { sum += i; }
        System.out.println(sum);*/

        for (int i = 0; i < 2; i++) { for (int j = 0; j < 2; j++) { System.out.print(i + j); } }
    }
}
