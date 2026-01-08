import java.util.*;

class SearchThread extends Thread {
    int arr[];
    int start, end, key;

    SearchThread(int arr[], int start, int end, int key) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }

    public void run() {

        for (int i = start; i < end; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
            }
        }
    }   
}

class Program28 {
    public static void main(String args[]) {
        int index;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = s.nextInt();

        int threads = n / 5;

        if (threads == 0) {
            threads = 1;
        }

        for (int i = 0; i < threads; i++) {
            int start = i * 5;
            int end;

            if (i == threads - 1) {
                end = n;
            } 
            else {
                end = start + 5;
            }

            SearchThread t = new SearchThread(arr, start, end, key);
            t.start();
        }

    }
}
