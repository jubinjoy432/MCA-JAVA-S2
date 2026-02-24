import java.io.*;
import java.net.*;

 class practice
 {
    public static void main(String args[])
    {
        DatagramSocket ds=null;
        DatagramPacket dp=null,reply=null;
        InetAddress shost=null;
        try
        {
            ds=new DatagramSocket();
            shost=InetAddress.getByName("localhost");
            byte buffer[]=new byte[1000];
            byte[] m="Bye".getBytes();
            dp=new DatagramPacket(m,m.length,shost,1234);
            ds.send(dp);
            reply=new DatagramPacket(buffer, buffer.length);
            ds.receive(reply);
            System.out.println((new String(reply.getData())).trim());
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }

    }
 }