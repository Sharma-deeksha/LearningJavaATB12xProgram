package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Deeksha");
        sb.append(" Sharma");
        System.out.println(sb);

        String s1="Deekhsa";
        s1=s1.concat(" Sharma");
        System.out.println(s1);
    }
}
