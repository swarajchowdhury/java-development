import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        String Items ;
        Integer Price;
        Integer Qty;
        Integer TotalPrice;

        System.out.println("What item would you like to buy?");
        Items = scanner.nextLine();
        System.out.println("What is the price for each?");
        Price = scanner.nextInt();
        System.out.println("How many you like to order?");
        Qty = scanner.nextInt();
        TotalPrice=Price*Qty;
        
        
        System.out.println("You have bought"+ Items + "pizza/s");
        System.out.println("Your total Price "+ TotalPrice );
        scanner.close();
    }
    
}