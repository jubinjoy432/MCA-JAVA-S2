import java.io.*;
public class CP{
    public static void main(String args[])
    {
        if (args.length<2)
        {
            System.out.println("Insufficient Arguments");
            return;
        }
        String fn1,fn2;
        FileInputStream fin;
        FileOutputStream fout;
        int ch;
        fn1=args[0];
        fn2=args[1];
        try{
            fin=new FileInputStream(fn1);
            fout=new FileOutputStream(fn2);
            while(true)
            {
                ch=fin.read();
                if(ch==-1)
                    break;
                fout.write(ch);
            }
            System.out.println("Successfully Copied "+args[0]+" to "+args[1]);
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}