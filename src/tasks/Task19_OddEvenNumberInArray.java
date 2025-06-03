package tasks;

public class Task19_OddEvenNumberInArray {
    public static void main(String[] args) {
        int[] arr={4,6,1,9,3,10};

        for(int i =0;i< arr.length;i++){
            if(arr[i]%2==0)
                System.out.println(arr[i] + " is even");
            else
                System.out.println(arr[i]+ " is odd");

        }

    }
}
