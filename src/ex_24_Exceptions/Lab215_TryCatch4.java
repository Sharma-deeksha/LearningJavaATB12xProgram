package ex_24_Exceptions;

public class Lab215_TryCatch4 {
    public static void main(String[] args) {
        String a=null;
        try{
            a.trim();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
