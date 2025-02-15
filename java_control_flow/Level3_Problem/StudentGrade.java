import java.util.*;
class StudentGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();
        
        // Compute percentage
        double percentage = (physics + chemistry + maths) / 3.0;
        
        // Determine grade and remarks
        String grade;
        String remarks;
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4 ,above agency-normalized standards";
        } else if (percentage >= 70 && percentage <=79) {
            grade = "B";
            remarks = "Level 3 ,at agency-normalized standards";
        } else if (percentage >= 60 && percentage<=69) {
            grade = "C";
            remarks = "Level 2 ,but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "D";
            remarks = "Level 1 ,well below agency-normalized standards";
        } else if (percentage >= 40 && percentage<=49) {
            grade = "E";
            remarks = "Level 1- ,too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial Standards";
        }
        
        // Output results
        System.out.println("\nAverage Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        sc.close();
    }
}
