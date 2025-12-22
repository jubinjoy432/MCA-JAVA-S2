import java.util.Scanner;

class Cthread extends Thread
{
    int start,n;
    public Cthread(int s,int a)
    {
        start=s;
        n=a;
    }
    public void run()
    {
        int i;
        for(i=start;i<=n;i=i+2)
        {
            if(i%2==0)
                System.out.println("Even="+i);
            else
                System.out.println("Odd="+i);
        }
    }
}
class Program27
{
    public static void main(String args[])
    {
        Cthread t1,t2;
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=s.nextInt();
        t1=new Cthread(1,n);
        t2=new Cthread(0,n);
        t1.start();
        t2.start();
    }
}