import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and different: " + r1 + ", " + r2);
        } else if (D == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and same: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex: " + real + " + " + imag + "i, " + real + " - " + imag + "i");
        }
    }
}
