import java.util.Scanner;
class SumNaturalNumber5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumFormula = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sum);

            // Compare results
            if (sumFormula == sum) {
                System.out.println("Both Matched");
            } else {
                System.out.println("There is No matc");
            }
        }

        sc.close();
    }
}
