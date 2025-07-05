package MCQs_05_06_2025;

import java.util.Scanner;

public class Challenge_1 {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Given: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
    public static void main(String[] args) {
        try {
            int age = 18; // Change this value to test different scenarios
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}