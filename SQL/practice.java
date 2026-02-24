import java.io.*;
import java.net.*;
class MultiClient extends Thread
{
    Socket as;
    DataInputStream sin;
    DataOutputStream sout;
    MultiClient(Socket s) throws Exception
    {
        as=s;
        sin=new DataInputStream(as.getInputStream());
        sout=new DataOutputStream(as.getOutputStream());
    }
    public void run()
    {
        String str="welcome";
        try
        {
            while(true)
            {
                sout.writeUTF("From server:"+str);
                if(str.equals("quit"))
                    break;
                str=sin.readUTF();
                System.out.println("Client Says:"+str);
                if(str.equals("quit"))
                    break;
            }
         }
         catch(Exception e)
         {
            System.out.println("Error in C:"+e);
         }
    }
}
 class practice
 {
    public static void main(String args[])
    {
        ServerSocket ss;
        try
        {
            Socket as;
            ss=new ServerSocket(1234);
            while(true)
            {
                System.out.println("Server waiting...");
                as=ss.accept();
                System.out.println("Client Connected...");
                MultiClient obj=new MultiClient(as);
                obj.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }

    }
 }