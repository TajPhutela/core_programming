import java.util.*;
class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi>=18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi>=25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Output result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);
        
        sc.close();
    }
}
