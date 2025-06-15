package ex_24_Exceptions;

public class Lab212_TryCatch1 {
    public static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Handling exception");
        }
    }
}
