package MCQs_22_06_2025;

public class Challenge_14 {

        public static void main(String[] args) {
            try {
                // Simulate input as command-line arguments
                String[] input = {"10", "0"}; // You can try changing values here

                // Converting string inputs to integers
                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[1]);

                // Performing division
                int result = num1 / num2;

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Not enough input values provided.");
            } finally {
                System.out.println("Program execution completed.");
            }
        }


}
