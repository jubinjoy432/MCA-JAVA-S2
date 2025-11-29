import java.io.*;
import java.util.*;
class L
{
    int a,b,c;
    public void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
    }
    public int large(int n1,int n2)
    {
        return n1>n2?n1:n2;
    }
    public void largest()
    {
        int g;
        g=large(a,b);
        g=large(g,c);
        System.out.println("Largest among three numbers:"+g);
    }
}
public class Program7
{
    public static void main(String args[])
    {
        L obj=new L();
        obj.read();
        obj.largest();
    }
}
