import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("\nArithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\nLogical Operators");
        boolean x = (a > 0), y = (b > 0);
        System.out.println("(a>0 && b>0) = " + (x && y));
        System.out.println("(a>0 || b>0) = " + (x || y));
        System.out.println("!(a>0) = " + (!x));

        System.out.println("\nAssignment Operators");
        int c = a; // start with a
        System.out.println("c = a → c = " + c);
        c += b; System.out.println("c += b → " + c);
        c -= b; System.out.println("c -= b → " + c);
        c *= b; System.out.println("c *= b → " + c);
        c /= (b == 0 ? 1 : b); 
        System.out.println("c /= b → " + c);

        System.out.println("\n===== Increment / Decrement =====");
        int d = a;
        System.out.println("d = " + d);
        System.out.println("d++ = " + (d++)); 
        System.out.println("After d++ → d = " + d);
        System.out.println("++d = " + (++d)); 
        System.out.println("d-- = " + (d--));
        System.out.println("After d-- → d = " + d);
        System.out.println("--d = " + (--d)); 

        System.out.println("\nBitwise Operators");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

        sc.close();
    }
}
