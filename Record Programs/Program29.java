import java.io.*;
import java.util.*;
class SquareThread extends Thread {
    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class CubeThread extends Thread {
    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

class Program29 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        SquareThread t1 = new SquareThread(n);
        CubeThread t2 = new CubeThread(n);

        t1.start();
        t2.start();
    }
}
