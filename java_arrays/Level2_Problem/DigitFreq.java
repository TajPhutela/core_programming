import java.util.*;
public class DigitFreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        
        int[] frequency = new int[10];
        List<Integer> digits = new ArrayList<>();
        
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            frequency[digit]++;
            number /= 10;
        }
        
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
