import java.io.*;
import java.util.*;

class C1{
	int a[];
    public void read()
    {
            int n;
			System.out.print("Enter the number of elements in the array:");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			a=new int[n];
			System.out.print("Enter the elements:");
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
    }
	public void search(int k)
	{
		int flag=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Found at location:"+i);
		}
		else
		{
			
			System.out.println("Not Found");
		}
	}
	public void sort()
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}

class Program3{
		public static void main(String args[]){
			C1 obj=new C1();
            int ch,k;
            Scanner s=new Scanner(System.in);
            obj.read();
			do{
				System.out.println("\nMenu: \n 1.Search\n 2.Sort\n 3.Exit\n Enter your choice:");
				ch=s.nextInt();
				switch(ch)
				{
					case 1:System.out.print("Enter the element to search:");
					       k=s.nextInt();
					       obj.search(k);
						break;
					case 2:obj.sort();
						break;
					case 3:break;
					default:System.out.println("Invalid Input");
				}
			}while(ch!=3);
		}
}
