import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Invalid input. Negative value entered. Stopping.");
            sc.close();
            return;
        }

        int sumAll = 0, sumEven = 0, sumOdd = 0;

        System.out.println("Numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            sumAll += i;
        }

        System.out.println("\nEven numbers from 1 to " + N + ":");
        int i = 2;
        while (i <= N) {
            System.out.print(i + " ");
            sumEven += i;
            i += 2;
        }

        System.out.println("\nOdd numbers from 1 to " + N + ":");
        i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            sumOdd += i;
            i += 2;
        }

        System.out.println("\nSum of all numbers: " + sumAll);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        sc.close();
    }
}
