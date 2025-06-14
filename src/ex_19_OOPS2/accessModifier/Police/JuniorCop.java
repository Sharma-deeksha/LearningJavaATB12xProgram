package ex_19_OOPS2.accessModifier.Police;

public class JuniorCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}