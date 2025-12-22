import java.util.*;

class ArrayOperations 
{
    int arr[];
    int n;

    public void read() 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }
    }

    public void display() 
    {
        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void search() 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to search:");
        int key = s.nextInt();
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == key) 
            {
                System.out.println("Element found at position " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void sort() 
    {
        for(int i = 0; i < n - 1; i++) 
        {
            for(int j = 0; j < n - i - 1; j++) 
            {
                if(arr[j] > arr[j+1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}

public class Program4 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        ArrayOperations obj = new ArrayOperations();
        int choice;

        do {
            System.out.println("\n1. Read Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Sort Array");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = s.nextInt();

            switch(choice) 
            {
                case 1:
                    obj.read();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.sort();
                    System.out.println("Array sorted:");
                    obj.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }
}
