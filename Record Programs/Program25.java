class Cthread extends Thread
{
    int n;
    public Cthread(int a)
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
class Program25
{
    public static void main(String args[])
    {
        Cthread t1,t2;
        t1=new Cthread(200);
        t2=new Cthread(250);
        System.out.println("B4 Threading");
        t1.start();
        System.out.println("BW Threading");
        t2.start();
        System.out.println("Finished");
    }
}