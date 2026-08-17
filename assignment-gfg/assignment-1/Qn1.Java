import java.util.Scanner;
public class StudentProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SUBJECTS = 3;
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Age: ");
        int age = sc.nextInt();
        int[] marks = new int[SUBJECTS];
        int[] maxMarks = new int[SUBJECTS];
        System.out.println("Enter Marks Information:");
        for (int i = 0; i < SUBJECTS; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            System.out.print("Maximum Marks in Subject " + (i + 1) + ": ");
            maxMarks[i] = sc.nextInt();
        }
        int totalMarks = 0, totalMax = 0;
        for (int i = 0; i < SUBJECTS; i++) {
            totalMarks += marks[i];
            totalMax += maxMarks[i];
        }
        double average = (double) totalMarks / SUBJECTS;
        double percentage = ((double) totalMarks / totalMax) * 100;
        System.out.println("===== Student Report =====");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + totalMarks + " / " + totalMax);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        sc.close();
    }
}
