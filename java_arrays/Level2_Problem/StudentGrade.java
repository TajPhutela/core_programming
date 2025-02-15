import java.util.*;
public class StudentGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        
        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();
            while (marks[i][0] < 0 || marks[i][0] > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks[i][0] = sc.nextDouble();
            }
            
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();
            while (marks[i][1] < 0 || marks[i][1] > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks[i][1] = sc.nextDouble();
            }
            
            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
            while (marks[i][2] < 0 || marks[i][2] > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks[i][2] = sc.nextDouble();
            }
            
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300) * 100;
            
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        sc.close();
        
        System.out.println("\nStudent Data:");
        System.out.println("Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < number; i++) {
            System.out.println(marks[i][0] + "      " + marks[i][1] + "      " + marks[i][2] + "      " + percentages[i] + "%      " + grades[i]);
        }
    }
}
