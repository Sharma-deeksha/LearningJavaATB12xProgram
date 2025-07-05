package ex_27_CollectionFramework.Set;
import  java.util.*;
public class Lab257_HashSet {
    public static void main(String[] args) {

        int arr[] = new int[3];
        System.out.println(arr.length);
        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    }

