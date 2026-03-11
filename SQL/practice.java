import java.io.*;
import java.util.*;

class SM
{

        int data;
        boolean f=false;
        public void put(int d)
        {
            try{
                if(f==true)
                    wait();
                data=d;
                System.out.println("Put:"+data);
                f=true;
                notify();
            }
            catch(Exception e)
            {}
        }
        public void get()
        {
            try{
                if(f==false)
                    wait();
                System.out.println("Get:"+data);
                f=false;
                notify();
            }
            catch(Exception e)
            {}
        }
}
class Producer extends Thread
{
    SM q;
    public Producer(SM q)
    {
        this.q=q;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            q.put(i);
            i++;
        }
    }
}
class Consumer extends Thread
{
    SM q;
    public Consumer(SM q)
    {
        this.q=q;
    }
    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}
class practice
{
    public static void main(String args[])
    {
        SM q=new SM();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        p.start();
        c.start();
    }
}