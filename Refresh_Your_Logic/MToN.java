import java.util.Scanner;

public class MToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = m;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
