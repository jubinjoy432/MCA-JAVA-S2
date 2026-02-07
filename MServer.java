import java.io.*;
import java.net.*;
class OneClient extends Thread
{
	Socket as;
	DataInputstream sin;
	DataOutputStream sout;
	public OneClient(Socket s) throws Exception
	{
		as =s;
		sin=new DataInputStream(as.getInputStream());
		sout=new DataOutputStream(as.getOutputStream());
	}
	public Void run()
	{
		try
		{
			String str="welcome";
			for(;;)
			{
				sout.writeUTF("From Server:"+str);
				str= sin.readUTF();
				if(str.equals("quit")
					break;
				System.out.println("From  Client:"+str);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
class MServer
{
	public static void main(String args[])
	{
		ServerSocket ss;
		try
		{
			ss=new ServerSocket(1234);
			for(;;)
			{
				System.out.println("Server Waiting.....");
				Socket as=as.accept();
				System.out.println("Client connected.....");
				OneClient obj=new OneClient(as);
				obj.start();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
	