package ex_24_Exceptions;

public class Lab214_TryCatch3 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
             b=10/a;
        }catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }

}
