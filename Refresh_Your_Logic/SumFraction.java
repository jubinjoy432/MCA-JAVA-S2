import java.util.Scanner;

public class SumFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        double sum = 0;
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i; // builds factorial gradually
            sum += (double) i / fact;
        }

        System.out.println("Sum of series is: " + sum);
    }
}

