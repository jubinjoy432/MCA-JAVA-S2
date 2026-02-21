import java.io.*;
 class FCopy extends Thread
 {
    String source;
    String destination;
    public FCopy(String s,String d)
    {
        source=s;
        destination=d;
    }
    public void run()
    {
            try{
                FileInputStream fin;
                FileOutputStream fout;
                fin=new FileInputStream(source);
                fout=new FileOutputStream(destination);
                int ch;
                while(true)
                {
                    ch=fin.read();
                    if(ch==-1)
                        break;
                    fout.write(ch);
                }
                fin.close();
                fout.close();
            }
            catch(Exception e)
            {}
    }

 }

  class FileCopyThread
 {
    public static void main(String args[])
    {
        File f;
        String a[];
        String s="e:\\A";
        String d="e:\\B";
        try{
            f=new File(s);
            a=f.list();
            FCopy obj[]=new FCopy[a.length];
            for(int i=0;i<a.length;i++)
            {
                obj[i]=new FCopy(s+"\\"+a[i],d+"\\"+a[i]);
                obj[i].start();
            }
        }
        catch(Exception e)
        {}
    }
 }