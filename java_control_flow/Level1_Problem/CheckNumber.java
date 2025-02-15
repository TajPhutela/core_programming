import java.util.*;

class CheckNumber {
    public static boolean check(int num) {
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if (check(num)) {
            System.out.printf("Is the number %d divisible by 5? Yes%n", num);
        } else {
            System.out.printf("Is the number %d divisible by 5? No%n", num);
        }

    }
}
