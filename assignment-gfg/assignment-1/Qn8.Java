import java.util.Scanner;

public class PrimeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L: ");
        int L = sc.nextInt();
        System.out.print("Enter R: ");
        int R = sc.nextInt();

        int count = 0, sum = 0;

        System.out.println("Prime numbers between " + L + " and " + R + ":");

        for (int num = L; num <= R; num++) {
            if (num < 2) continue;

            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
                sum += num;
            }
        }

        System.out.println("\nCount of primes: " + count);
        System.out.println("Sum of primes: " + sum);

        sc.close();
    }
}
