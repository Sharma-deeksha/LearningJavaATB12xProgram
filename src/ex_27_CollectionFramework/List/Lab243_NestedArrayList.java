package ex_27_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits1=new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("Banana");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("grapes");
        fruits2.add("Mango");
        fruits2.add("Papaya");
        System.out.println(fruits2);

        List veg=new ArrayList();
        veg.add("tomoato");
        veg.add("potato");
        veg.add("Bhindi");
        System.out.println(veg);

        List fruitsVegies=new ArrayList();
        fruitsVegies.add(fruits1);
        fruitsVegies.add(fruits2);
        fruitsVegies.add(veg);
        fruitsVegies.add("dragonFruit");
        System.out.println(fruitsVegies);
    }
}
