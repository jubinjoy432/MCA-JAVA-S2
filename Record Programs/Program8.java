import java.io.*;
import java.util.*;
class C1
{
	public int reverse(int a)
	{
		int n=a,temp=0,rev=0;
		while(n!=0)
		{
		temp=n%10;
		rev=(rev*10)+temp;
		n/=10;
		}
		return rev;
	}
	
	public Boolean palindrome(int a)
	{
		
		return a==reverse(a);
	}
}
public class Program8
{
    public static void main(String args[])
    {
        C1 obj=new C1();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int rev=obj.reverse(num);
        System.out.println("Reversed number:"+rev);
        if(obj.palindrome(num))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}