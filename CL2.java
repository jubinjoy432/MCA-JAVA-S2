import java.io.*;

class CLA2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java CLA2 <num1> <num2> <operation>");
            System.out.println("Operations: 0=Add, 1=Subtract, 2=Multiply, 3=Divide, 4=Modulus");
            return;
        }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int op = Integer.parseInt(args[2]);
            int result = 0;

            switch (op) {
                case 0: result = n1 + n2; break;
                case 1: result = n1 - n2; break;
                case 2: result = n1 * n2; break;
                case 3:
                    if (n2 == 0) {
                        System.out.println("Error: Division by zero.");
                        return;
                    }
                    result = n1 / n2; 
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Error: Modulus by zero.");
                        return;
                    }
                    result = n1 % n2; 
                    break;
                default:
                    System.out.println("Invalid operation code.");
                    return;
            }

            System.out.println("Result = " + result);
    }
}
