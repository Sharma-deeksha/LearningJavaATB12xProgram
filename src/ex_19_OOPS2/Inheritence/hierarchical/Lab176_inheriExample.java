package ex_19_OOPS2.Inheritence.hierarchical;

public class Lab176_inheriExample {
    public static void main(String[] args) {
        son1 s1=new son1();
        s1.son1home();
        s1.home();

        son2 s2=new son2();
        s2.home();
        s2.son2home();
        //s2.son1home(); can access son1 home

        daughter d=new daughter();
        d.home();
        d.dhome();

        father f=new father();
        f.home();
    }


}
