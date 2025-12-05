import java.io.*;
import java.util.*;
class Recursion
{
	public void oneToN(int n,int i)
	{
		if(i>n)
		{
			return;
		}
		else
        {
            System.out.print(i+" ");
			oneToN(n,i+1);
        }
		
	}
	public void nToOne(int n)
	{
		if(n==0)
		{
			return;
		}
		else
        {
            System.out.print(n+" ");
			nToOne(n-1);
        }
		
	}
}
class Program10
{
	public static void main(String args[])
	{
		Recursion obj=new Recursion();
		int n,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=s.nextInt();
        System.out.println("N to 1:");
		obj.nToOne(n);
        System.out.println("\n1 to N:");
		obj.oneToN(n,i);
	}
}
