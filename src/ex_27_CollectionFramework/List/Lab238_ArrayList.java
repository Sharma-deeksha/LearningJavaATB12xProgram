package ex_27_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab238_ArrayList {
    public static void main(String[] args) {
        List l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(1));
        System.out.println(l1.contains(20));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.indexOf(30));
        System.out.println("-------------------------");
        for (int i = 0; i < l1.size() ; i++) {
            System.out.println(l1.get(i));
        }

        System.out.println(" ----- ");

        for (Object o:l1){
            System.out.println(o);
        }

        System.out.println(" ----- ");

        Iterator iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
