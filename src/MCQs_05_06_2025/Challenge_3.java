package MCQs_05_06_2025;

public class Challenge_3 {
    public static <T> void swap(T[] array, int i, int j) {
        if (array == null || i >= array.length || j >= array.length || i < 0 || j < 0) {
            throw new IllegalArgumentException("Invalid index or null array");
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 1, 3);
        System.out.println("Swapped Integer array: " + java.util.Arrays.toString(intArray));

        // Example with String array
        String[] strArray = {"abc", "def", "sdf"};
        swap(strArray, 0, 2);
        System.out.println("Swapped String array: " + java.util.Arrays.toString(strArray));
    }
}

