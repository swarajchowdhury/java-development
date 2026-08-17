import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SUBJECTS = 5;
        String name = "";
        int roll = 0;
        int[] marks = new int[SUBJECTS];
        boolean detailsEntered = false;

        int total = 0;
        double average = 0;
        double percentage = 0;
        char grade = 'F';

        int choice;

        do {
            System.out.println("STUDENT RESULT SYSTEM");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Calculate Result");
            System.out.println("3. Display Result");
            System.out.println("4. Check Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    roll = sc.nextInt();

                    for (int i = 0; i < SUBJECTS; i++) {
                        System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                        int m = sc.nextInt();
                        if (m < 0 || m > 100) {
                            System.out.println("Invalid marks. Must be between 0 and 100.");
                            i--; // retry same subject
                            continue;
                        }
                        marks[i] = m;
                    }
                    detailsEntered = true;
                    System.out.println("Student details entered successfully.");
                    break;

                case 2:
                    if (!detailsEntered) {
                        System.out.println("Error: Enter student details first.");
                        break;
                    }
                    total = 0;
                    for (int m : marks) {
                        total += m;
                    }
                    average = (double) total / SUBJECTS;
                    percentage = ((double) total / (SUBJECTS * 100)) * 100;

                    if (percentage >= 90) grade = 'A';
                    else if (percentage >= 80) grade = 'B';
                    else if (percentage >= 70) grade = 'C';
                    else if (percentage >= 60) grade = 'D';
                    else if (percentage >= 50) grade = 'E';
                    else grade = 'F';

                    System.out.println("Result calculated successfully.");
                    break;

                case 3:
                    if (!detailsEntered) {
                        System.out.println("Error: Enter student details first.");
                        break;
                    }
                    System.out.println("\n===== Student Result =====");
                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + roll);
                    System.out.print("Marks: ");
                    for (int m : marks) {
                        System.out.print(m + " ");
                    }
                    System.out.println("\nTotal Marks: " + total);
                    System.out.println("Average Marks: " + average);
                    System.out.println("Percentage: " + percentage + "%");
                    break;

                case 4:
                    if (!detailsEntered) {
                        System.out.println("Error: Enter student details first.");
                        break;
                    }
                    System.out.println("Grade: " + grade);
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Demonstrating increment/decrement and bitwise operation
            int demo = 1;
            demo++;
            demo--;
            int bitwiseDemo = demo & 1; // just to show bitwise AND
        } while (choice != 5);

        sc.close();
    }
}
