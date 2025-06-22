package ex_27_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List1 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(true);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));
        System.out.println(list.contains("2"));
        System.out.println(list.indexOf(2));
        System.out.println(list.remove(true));
        System.out.println(list);
    }
}
