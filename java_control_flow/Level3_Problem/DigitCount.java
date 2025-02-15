import java.util.*;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int count = 0;
        int originalNumber = number;
        while (originalNumber != 0) {
            originalNumber /= 10;
            count++;
        }

        System.out.println("Number of digits in " + number + " is: " + count);
        
        sc.close();
    }
}
