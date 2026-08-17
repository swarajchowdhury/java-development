import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int digits = 0, sum = 0, product = 1, reverse = 0;

        if (temp == 0) {
            digits = 1;
            product = 0;
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                digits++;
                sum += digit;
                product *= digit;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
        }

        System.out.println("Digits: " + digits);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Reverse: " + reverse);
        System.out.println("Palindrome: " + (reverse == num ? "Yes" : "No"));

        sc.close();
    }
}
