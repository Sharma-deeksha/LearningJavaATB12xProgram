package MCQs_22_06_2025;

public class Challenge_15 {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            int userAge = 21;  // You can change this to test different values
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }



}

class   InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}