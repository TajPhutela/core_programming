import java.util.*;
class LeapYearUsingLogical{
    public static String isLeapYearSingleIf(int year) {
        if (year < 1582) {
            return "Year must be >= 1582 (Gregorian Calendar).";
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " is a Leap Year.";
        }
        return year + " is NOT a Leap Year.";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYearSingleIf(year));
    }
}