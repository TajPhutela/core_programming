import java.util.Scanner;4
public class CountdownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
