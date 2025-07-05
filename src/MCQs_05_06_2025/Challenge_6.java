package MCQs_05_06_2025;

public class Challenge_6 {
    public static void main(String[] args) {
        Pair<Integer, String> testEx = new Pair<>(100, "Test");
        System.out.println("Print Pair: " + testEx);
    }
}
class Pair<T,U>{
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }

    // Setters
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
