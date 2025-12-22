import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 5, 7, 9};
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == x) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found." : "Element not found.");
    }
}
