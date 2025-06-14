package ex_19_OOPS2.superKeyword;

public class Lab184_super2 {
    public static void main(String[] args) {
     son s1=new son();
     s1.newHome();
    }
}
class father{
    father(){
        System.out.println("DC father");
    }
    int gold=10;

    void home(){
        System.out.println("home father");
    }
}
class son extends father{

   son(){
       super();
       System.out.println("son's DC constructor");

   }
   void bike()
   {
       System.out.println("Son's bike");
   }
   void newHome(){

       System.out.println("Son's home");
       super.home();
       System.out.println("Son accessing father gold---"+super.gold);
       System.out.println("son accessing his bike" );
       this.bike();
       System.out.println("son accessing his home" );
       this.home();
   }
}