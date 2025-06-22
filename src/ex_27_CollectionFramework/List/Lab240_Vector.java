package ex_27_CollectionFramework.List;

import java.util.Vector;

public class Lab240_Vector {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add("Deeksha");
        v.add("Ninnu");
        v.add("Barun");
        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.capacity());
        v.remove(2);
        System.out.println(v);
        System.out.println(v.contains("deeksha"));
    }
}
