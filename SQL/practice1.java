import java.io.*;
import java.util.*;
import java.net.*;
class practice1
{
    public static void main(String args[])
    {
        Socket as;
        DataInputStream in;
        DataOutputStream out;
        String str;
        try{
        as=new Socket("localhost",1234);
        in=new DataInputStream(as.getInputStream());
        out=new DataOutputStream(as.getOutputStream());
        str=in.readUTF();
        System.out.println("Server Says:"+str);
        out.writeUTF("Hello.....");
        System.in.read();
        as.close();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }

    }
}