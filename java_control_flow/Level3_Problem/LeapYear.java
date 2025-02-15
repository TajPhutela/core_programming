import java.util.*;

public class LeapYear{
    public static String isLeapYearIfElse(int year) {
        if (year < 1582) {
            return "Year must be >= 1582 (Gregorian Calendar).";
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a Leap Year.";
                } 
                else {
                    return year + " is NOT a Leap Year.";
                }
            } 
            else {
                return year + " is a Leap Year.";
            }
        } 
        else {
            return year + " is NOT a Leap Year.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYearIfElse(year));
        
    }
}
