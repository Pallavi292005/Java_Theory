import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Implicit Conversion (Widening)
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        double widened = num;   // int → double automatically
        System.out.println("Implicit conversion (int to double): " + widened);

        // Explicit Conversion (Narrowing)
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        int narrowed = (int) d; // double → int (manual cast)
        System.out.println("Explicit conversion (double to int): " + narrowed);

        sc.close();
    }
}
