import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + evenOdd);

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        } else {
            System.out.println("The number is not divisible by both 3 and 5");
        }

        if (num < 0) {
            if (-num > 100) {
                System.out.println("Absolute value is greater than 100");
            } else {
                System.out.println("Absolute value is not greater than 100");
            }
        } else {
            if (num > 100) {
                System.out.println("Absolute value is greater than 100");
            } else {
                System.out.println("Absolute value is not greater than 100");
            }
        }

        sc.close();
    }
}
