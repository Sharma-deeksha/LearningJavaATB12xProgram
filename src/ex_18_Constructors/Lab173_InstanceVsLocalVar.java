package ex_18_Constructors;

public class Lab173_InstanceVsLocalVar {
    public static void main(String[] args) {
        A1 a1=new A1();
        System.out.println(a1.instVar);
        //System.out.println(a1.localVar); This will not be accessible outside function
        a1.fn();
    }

}
class A1 {
    String instVar = "Instance Variable";
    void fn ()
    {
        String localVar="Local Variable";
        System.out.println(localVar);
    }
}
