import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
        } else {
            int bill = 0;

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = (100 * 2) + ((units - 100) * 3);
            } else if (units <= 400) {
                bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
            } else {
                bill = (100 * 2) + (100 * 3) + (200 * 5) + ((units - 400) * 7);
            }

            bill += 50; // fixed service charge
            System.out.println("Total Electricity Bill: ₹" + bill);
        }

        sc.close();
    }
}
    