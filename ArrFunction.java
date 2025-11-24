import java.io.*;
import java.util.*;
class c1{
    public int[] read(int a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n=s.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        return a;
}
    public void disp(int a[]){
        System.out.println("The elements are:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("");
    }
    public int search(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
class ArrFunction{
    public static void main(String args[]){
        c1 obj=new c1();
        int a[]=null;
        a=obj.read(a);
        obj.disp(a);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int key=s.nextInt();
        int result=obj.search(a,key);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("Finished");
    }
}