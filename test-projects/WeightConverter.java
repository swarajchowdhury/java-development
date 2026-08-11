import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();

        double grams = kg * 1000;
        double pounds = kg * 2.20462;

        System.out.printf("Weight in grams = %.2f%n", grams);
        System.out.printf("Weight in pounds = %.2f%n", pounds);

        sc.close();
    }
}
