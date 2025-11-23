import java.util.Arrays;

public class Sort{
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
