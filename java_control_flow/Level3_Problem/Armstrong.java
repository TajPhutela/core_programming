import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        // Check if number is an Armstrong number
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += Math.pow(digit, 3); // Add cube of the digit to sum
            originalNumber /= 10; // Remove last digit
        }
        
        // Output result
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
        
        sc.close();
    }
}
