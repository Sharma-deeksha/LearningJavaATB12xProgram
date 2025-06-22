package ex_27_CollectionFramework.List;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab248_ArrayListIterator {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList();
        mylist.add("Deekhsa");
        mylist.add("Baurun");
        mylist.add("Ninnyu");
        System.out.println("print ArrayList 1");
        for (String str:mylist)
        {
            System.out.println(str);
        }
        System.out.println("print ArrayList 2");
        Iterator<String> iterator=mylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("print ArralyList 3");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
