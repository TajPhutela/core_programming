import java.util.*;

public class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            double weight = -1, height = -1;
            
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid input. Enter a positive weight: ");
                weight = sc.nextDouble();
            }
            
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid input. Enter a positive height: ");
                height = sc.nextDouble();
            }
            
            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        sc.close();
        
        System.out.println("\nPerson Data:");
        System.out.println("Weight(kg)  Height(m)  BMI         Status");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "         " + personData[i][1] + "         " + personData[i][2] + "         " + weightStatus[i]);
        }
    }
}
