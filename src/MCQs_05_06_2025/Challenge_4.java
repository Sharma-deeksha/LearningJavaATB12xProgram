package MCQs_05_06_2025;

public class Challenge_4 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        try{
            System.out.println(10/0);

        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
