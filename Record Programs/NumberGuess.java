import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 25; // Secret number between 20 and 30
        int guess, attempts = 0;

        do {
            System.out.print("Guess a number between 20 and 30: ");
            guess = sc.nextInt();
            attempts++;
        } while (guess != secret);

        System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
    }
}
