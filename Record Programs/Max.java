import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Logic 1
        int max1 = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum (ternary): " + max1);

        // Logic 2
        int max2 = Math.max(a, Math.max(b, c));
        System.out.println("Maximum (Math.max): " + max2);

        // Logic 3
        int max3 = a;
        if (b > max3)
            max3 = b;
        if (c > max3) 
            max3 = c;
        System.out.println("Maximum (if-else): " + max3);
    }
}
