package ex_17_OOPS;

public class Lab166_OOPS2 {

    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2 = null;
        new Cat();
        Cat c3=new Cat();
        c1.catName="chinu";
        //c2.catName="minu";//NullPointerException
        c3.catName="keenu";
        System.out.println(c1.catName);
        c1.run();
       // System.out.println(c2.catName);//NullPointerException
        System.out.println(c3.catName);
        c3.run();
    }
}


class Cat {
    String catName;
    void run(){
        System.out.println("Running");
    }

}