// File: DifferenceWhile.java
import java.util.Scanner;

public class Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int diff = a;
        while (b-- > 0) {
            diff--;
        }
        System.out.println("Difference (a - b) is: " + diff);
    }
}
