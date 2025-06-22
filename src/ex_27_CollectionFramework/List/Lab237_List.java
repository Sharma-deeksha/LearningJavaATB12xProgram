package ex_27_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab237_List {
    public static void main(String[] args) {
        List list=List.of("Orange","Mango",1,20,'A');
        System.out.println(list);

        List l1=new ArrayList<>();
        l1.add("Deeksha");
        l1.add("Mango");
        l1.add(1);
        l1.add(1234);
        System.out.println(l1);
        System.out.println(l1.size());
    }
}
