import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Logic 1: Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (using third variable): a=" + a + ", b=" + b);

        // Logic 2: Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (without third variable): a=" + a + ", b=" + b);

        // Logic 3: Using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap (using XOR): a=" + a + ", b=" + b);
    }
}
