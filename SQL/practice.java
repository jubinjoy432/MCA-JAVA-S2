import java.io.*;
import java.util.*;
import java.net.*;
class practice
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket as;
        DataInputStream in;
        DataOutputStream out;
        String str;
        try{
        ss=new ServerSocket(1234);
        as=ss.accept();
        in=new DataInputStream(as.getInputStream());
        out=new DataOutputStream(as.getOutputStream());
        out.writeUTF("Welcome");
        str=in.readUTF();
        System.out.println("Client Says:"+str);
        System.in.read();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }

    }
}