import java.io.DataInputStream;
import java.io.IOException;

class Program21 {
    public static void main(String args[]) {

        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(dis.readLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(dis.readLine());

            int c = a / b;   // may cause ArithmeticException
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
        catch (IOException e) {
            System.out.println("Error: Input/Output exception");
        }
        catch (Exception e) {
            System.out.println("General exception occurred");
        }
    }
}
