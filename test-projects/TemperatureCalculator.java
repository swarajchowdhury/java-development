import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double temp, result;

        System.out.println("Temperature Calculator");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        temp = sc.nextDouble();

        switch (choice) {
            case 1:
                result = (temp * 9/5) + 32;
                System.out.println("Fahrenheit: " + result);
                break;
            case 2:
                result = temp + 273.15;
                System.out.println("Kelvin: " + result);
                break;
            case 3:
                result = (temp - 32) * 5/9;
                System.out.println("Celsius: " + result);
                break;
            case 4:
                result = (temp - 32) * 5/9 + 273.15;
                System.out.println("Kelvin: " + result);
                break;
            case 5:
                result = temp - 273.15;
                System.out.println("Celsius: " + result);
                break;
            case 6:
                result = (temp - 273.15) * 9/5 + 32;
                System.out.println("Fahrenheit: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
