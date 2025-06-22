package MCQs_22_06_2025;

public class Challenge_13 {
    public static void main(String[] args) {
        OuterClass c=new OuterClass();
        System.out.println(c.x);
        c.accessInner();
        System.out.println(c.x);
        OuterClass.InnerClass i=new OuterClass.InnerClass();
        System.out.println(i.x);

    }
}
class OuterClass{
    int x=10;
    static class InnerClass{
        int x=20;
    }
    public void accessInner(){
        InnerClass inner=new InnerClass();
        x= x+inner.x;
    }
}
