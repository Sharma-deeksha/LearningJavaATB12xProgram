package ex_19_OOPS2.Inheritence.multilevel;

public class Lab177_multilevelInherit {
    public static void main(String[] args) {
        son s1 = new son();
        System.out.println("son will extend GF gold---" + s1.gfGold );
        s1.grfatherhome();
        s1.fatherhome();
        s1.shome();

        father f= new father();
        System.out.println("father will extend GF gold---" + f.gfGold );
        f.grfatherhome();
        f.fatherhome();

        grandfather gf= new grandfather();
        System.out.println("grandgather will have his gold---" + f.gfGold );
        gf.grfatherhome();


        father f1= new son();
        grandfather gf1=new son();
        grandfather gf2=new father();

    }


}
