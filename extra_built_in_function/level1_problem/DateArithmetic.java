import java.time.LocalDate;

class DateArithmetic{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 13);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + modifiedDate);
    }
}
