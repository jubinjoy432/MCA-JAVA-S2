import java.io.*;
 class FileCopy{
    public static void main(String args[])
    {
        File f;
        FileInputStream fin;
        FileOutputStream fout;
        String a[];
        try{
            f=new File("e:\\A");
            a=f.list();
            int ch;
            for(int i=0;i<a.length;i++)
            {
                fin=new FileInputStream("e:\\A\\"+a[i]);
                fout=new FileOutputStream("e:\\B\\"+a[i]);

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
        }
        catch(Exception e)
        {}
    }
 } 