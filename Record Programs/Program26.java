import java.io.*;
class CIThread implements Runnable
{
    int n;
    public CIThread(int a)
    {
        n=a;
    }
    public void run()
    {
        int i;
        for(i=0;i<=n;i++)
        {
            System.out.println("i="+i+"\t");
        }
    }
}
class Program26
{
    public static void main(String args[])
    {
        Cthread p,q;
        p=new Cthread(200);
        q=new Cthread(250);
        Thread t1,t2;
        t1=new Thread(p);
        t2=new Thread(q);
        System.out.println("B4 Threading");
        t1.start();
        System.out.println("BW Threading");
        t2.start();
        System.out.println("Finished");
    }
}
