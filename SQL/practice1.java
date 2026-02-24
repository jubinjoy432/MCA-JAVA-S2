import java.io.*;
import java.net.*;
class practice1
{
    public static void main(String[] args) {
        Socket as;  
         DataInputStream sin,kin;
         DataOutputStream sout;
        try{
            as=new Socket("localhost",1234);
            sin=new DataInputStream(as.getInputStream());
            sout=new DataOutputStream(as.getOutputStream());
            kin=new DataInputStream(System.in);
            while(true)
            {
                String str=sin.readUTF();
                System.out.println(str);
                System.out.println("Enter data/quit:");
                str=kin.readLine();
                sout.writeUTF(str);
                if(str.equals("quit"))
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}