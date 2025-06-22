package ex_27_CollectionFramework.Queue;
import java.util.*;
public class Lab253_ArrayDequeue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);
    }
}
