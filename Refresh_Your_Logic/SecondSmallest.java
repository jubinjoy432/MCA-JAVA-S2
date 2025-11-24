// File: SecondSmallest.java
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Second smallest element is: " + arr[1]);
    }
}
