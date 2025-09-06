import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operator Type to Demonstrate:");
        System.out.println("1. Arithmetic Operators");
        System.out.println("2. Relational Operators");
        System.out.println("3. Logical Operators");
        System.out.println("4. Assignment Operators");
        System.out.println("5. Unary Operators");
        System.out.println("6. Bitwise Operators");
        System.out.println("7. Ternary Operator");
        System.out.print("Enter your choice (1-7): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Arithmetic
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt(), b = sc.nextInt();
                System.out.println("Addition: " + (a + b));
                System.out.println("Subtraction: " + (a - b));
                System.out.println("Multiplication: " + (a * b));
                System.out.println("Division: " + (a / b));
                System.out.println("Modulus: " + (a % b));
                break;

            case 2: // Relational
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt(), y = sc.nextInt();
                System.out.println("x == y : " + (x == y));
                System.out.println("x != y : " + (x != y));
                System.out.println("x > y  : " + (x > y));
                System.out.println("x < y  : " + (x < y));
                System.out.println("x >= y : " + (x >= y));
                System.out.println("x <= y : " + (x <= y));
                break;

            case 3: // Logical
                System.out.print("Enter two boolean values (true/false): ");
                boolean p = sc.nextBoolean(), q = sc.nextBoolean();
                System.out.println("p && q : " + (p && q));
                System.out.println("p || q : " + (p || q));
                System.out.println("!p     : " + (!p));
                break;

            case 4: // Assignment
                int num = 10;
                System.out.println("Initial num = " + num);
                num += 5;
                System.out.println("After += 5 : " + num);
                num -= 3;
                System.out.println("After -= 3 : " + num);
                num *= 2;
                System.out.println("After *= 2 : " + num);
                num /= 4;
                System.out.println("After /= 4 : " + num);
                num %= 3;
                System.out.println("After %= 3 : " + num);
                break;

            case 5: // Unary
                int u = 5;
                System.out.println("u = " + u);
                System.out.println("++u = " + (++u));
                System.out.println("u++ = " + (u++));
                System.out.println("After u++ : " + u);
                System.out.println("--u = " + (--u));
                System.out.println("u-- = " + (u--));
                System.out.println("After u-- : " + u);
                System.out.println("Unary minus of u: " + (-u));
                boolean flag = true;
                System.out.println("!flag = " + (!flag));
                break;

            case 6: // Bitwise
                int m = 5, n = 3; // 5 = 0101, 3 = 0011
                System.out.println("m & n : " + (m & n));
                System.out.println("m | n : " + (m | n));
                System.out.println("m ^ n : " + (m ^ n));
                System.out.println("~m    : " + (~m));
                System.out.println("m << 1 : " + (m << 1));
                System.out.println("m >> 1 : " + (m >> 1));
                System.out.println("m >>> 1: " + (m >>> 1));
                break;

            case 7: // Ternary
                System.out.print("Enter a number: ");
                int t = sc.nextInt();
                String result = (t % 2 == 0) ? "Even" : "Odd";
                System.out.println("Number is " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
