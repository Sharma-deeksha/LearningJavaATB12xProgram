package MCQs_05_06_2025;

public class Challenge_2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (Exception e)
        {
            System.out.println("Cannot divide by 0");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
